package com.org.kz.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.kz.test.mapping.StudentMapper;
import com.org.kz.test.model.Student;


@Controller

public class StudentController {
	
	
	@RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showTodoPage() {
        return "newStudent";
    }

    @RequestMapping(value = "/add-student", method = RequestMethod.POST)
    public String addStudent(ModelMap model, @RequestParam String sname, @RequestParam Integer age,
    		@RequestParam double gpa) {
    	if(sname == null){
    		model.put("errorMessage", "Student name cannot be empty!");
    		return "newStudent";
    	}
    	SqlSessionFactory sqlSessionFactory;
        StudentMapper studentMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("spring-mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            studentMapper = session.getMapper(StudentMapper.class); 
            studentMapper.addStudent(sname,age,gpa);
            List<Student> students = studentMapper.findAll();
            model.addAttribute("students",students);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }         
        return "studentList";
    }
    
    @RequestMapping(value = "/delete-student", method = RequestMethod.GET)
    public String deleteStudent(ModelMap model, @RequestParam int id) {
    	SqlSessionFactory sqlSessionFactory;
        StudentMapper studentMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("spring-mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            studentMapper = session.getMapper(StudentMapper.class); 
            studentMapper.deleteById(id);
            List<Student> students = studentMapper.findAll();
            model.addAttribute("students",students);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }        

        return "studentList";
    }
	
}
