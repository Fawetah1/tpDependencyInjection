package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Component
public class ToDoDao implements IToDoDao {

	@Override
	public List<String> getCoursesList() {
		List<String> courses = new ArrayList<>();
		courses.add("Maven");
		courses.add("Dependency Injection");
		courses.add("Spring Data JPA");
		courses.add("Spring AOP");
		return courses;
	}
}
