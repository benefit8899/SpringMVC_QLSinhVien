package com.vanloi.service;

import com.vanloi.model.Student;

public interface StudentService {
	void insertStudent(Student student);

	boolean getStudentByLogin(String userName, String password);

	boolean getStudentByUserName(String userName);
}