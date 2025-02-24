package com.esprit.Dependency.tpDependencyInjection.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import com.esprit.Dependency.tpDependencyInjection.services.ToDoService;

@Controller
@AllArgsConstructor

public class ToDoController {

	private  ToDoService toDoService;

	// Injection par constructeur (meilleure pratique)




	public List<String> getCoursesList() {
		return toDoService.getCoursesList();
	}
}
