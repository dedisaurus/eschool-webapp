package com.org.kz.test.login;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.org.kz.test.mapping.StudentMapper;
import com.org.kz.test.model.Student;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private LoginValidationService service;
	
	
	@RequestMapping(value = "/eschool", method = RequestMethod.GET)	
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping(value = "/eschool", method = RequestMethod.POST)	
	public String handleLoginRequest(@RequestParam String name,
			@RequestParam String password, ModelMap model){
		if(!service.isUserValid(name, password)){
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		SqlSessionFactory sqlSessionFactory;
        StudentMapper studentMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("spring-mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            studentMapper = session.getMapper(StudentMapper.class); 
            List<Student> students = studentMapper.findAll();
            model.addAttribute("students",students);
            session.commit();
            session.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
		model.put("name", name);
		model.put("password", password);
		return "studentList";
	}

}
