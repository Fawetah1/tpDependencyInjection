package com.esprit.Dependency.tpDependencyInjection.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.esprit.Dependency.tpDependencyInjection.dao.IToDoDao;

@Service
@AllArgsConstructor
public class ToDoService {

	private  IToDoDao toDoDao;


	public List<String> getCoursesList() {
		return toDoDao.getCoursesList();
	}
}
