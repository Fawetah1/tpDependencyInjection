package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Primary;
import java.util.ArrayList;
import java.util.List;

@Component
public class ToDoDao2 implements IToDoDao {

	@Override
	public List<String> getCoursesList() {
		List<String> courses = new ArrayList<>();
		courses.add("Diagramme de cas d'utilisation");
		courses.add("Diagramme de classes");
		courses.add("Diagramme de séquences");
		courses.add("Diagramme état-transition");
		return courses;
	}
}
