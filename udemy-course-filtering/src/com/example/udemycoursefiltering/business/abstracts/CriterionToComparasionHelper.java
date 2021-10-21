package com.example.udemycoursefiltering.business.abstracts;

import java.util.List;

import com.example.udemycoursefiltering.entity.Course;

public interface CriterionToComparasionHelper {
	
	 List<Course> CriterionToCompare(List<Course> course);
}
