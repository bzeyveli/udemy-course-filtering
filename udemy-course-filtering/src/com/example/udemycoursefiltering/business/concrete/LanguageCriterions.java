package com.example.udemycoursefiltering.business.concrete;

import java.util.ArrayList;
import java.util.List;

import com.example.udemycoursefiltering.business.abstracts.CriterionToComparasionHelper;
import com.example.udemycoursefiltering.entity.Course;

public class LanguageCriterions implements CriterionToComparasionHelper{

	public List<Course> CriterionToCompare(List<Course> course) { //kriter kar��la�t�rma
		
		List<Course> list =  new ArrayList<Course>() ;
		
		for (Course course2 : course) {
			if(course2.getLanguage().equalsIgnoreCase("T�rk�e")){
				list.add(course2);
			}
		}
		return list;
	}
	
}
