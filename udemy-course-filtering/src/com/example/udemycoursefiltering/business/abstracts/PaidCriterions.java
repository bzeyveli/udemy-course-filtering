package com.example.udemycoursefiltering.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import com.example.udemycoursefiltering.entity.Course;

public class PaidCriterions implements CriterionToComparasionHelper {

	public List<Course> CriterionToCompare(List<Course> course) {

		List<Course> list = new ArrayList<Course>();

		for (Course course2 : course) {
			if (course2.isPaid()) {
				list.add(course2);
			}
		}
		return list;
	}
}
