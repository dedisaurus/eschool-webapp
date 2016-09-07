package com.org.kz.test.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.org.kz.test.model.Student;

public interface StudentMapper {
	Student findById(Integer sid);
	List<Student> findAll(); 
	void deleteById(Integer sid);
	void addStudent(@Param("sname") String sname, @Param("age") Integer age, @Param("gpa") double gpa);
}
