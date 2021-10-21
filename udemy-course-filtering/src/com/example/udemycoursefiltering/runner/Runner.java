package com.example.udemycoursefiltering.runner;

import java.util.ArrayList;
import java.util.List;

import com.example.udemycoursefiltering.business.abstracts.CriterionToComparasionHelper;
import com.example.udemycoursefiltering.business.concrete.FreeCriterions;
import com.example.udemycoursefiltering.business.concrete.LanguageCriterions;
import com.example.udemycoursefiltering.business.concrete.PaidCriterions;
import com.example.udemycoursefiltering.business.concrete.TwoCriterionsCompare;
import com.example.udemycoursefiltering.entity.Course;

public class Runner {

	public static void main(String[] args) {
		
		List<Course> list = new ArrayList<Course>();
		list.add(new Course("java", 4.5, true, false, "Türkçe"));
		list.add(new Course("java", 4.1, false, true, "English"));
		list.add(new Course("java", 4.7, true, false, "English"));
		list.add(new Course("java", 4.0, false, true, "Türkçe"));
		list.add(new Course("java", 3.9, true, false, "Türkçe"));
		list.add(new Course("C++", 4.7, true, false, "Türkçe"));
		
		System.out.println("*****************************************");
		courseWriter(list);
	
		System.out.println("*****************************************");
		PaidCriterions paidCriterions = new PaidCriterions();
		List <Course> list1 = paidCriterions.CriterionToCompare(list);
		courseWriter(list1);
	
		System.out.println("******************************************");
		
		FreeCriterions freeCriterions = new FreeCriterions();
		List<Course> list2 =  freeCriterions.CriterionToCompare(list);
		courseWriter(list2);
		
		System.out.println("*****************************************");
		LanguageCriterions languageCriterions = new LanguageCriterions();
		List <Course> list4 = languageCriterions.CriterionToCompare(list);
		courseWriter(list4);
	
		System.out.println("*********************************************");
		// kriter karþýlaþtýrma
		 CriterionToComparasionHelper twoCriterionsCompare = new TwoCriterionsCompare(freeCriterions,languageCriterions);
		 List<Course> list3 =  twoCriterionsCompare.CriterionToCompare(list);
		courseWriter(list3);
	}
	
	
	public static void courseWriter(List<Course> list) {
		for (Course course : list) {
			System.out.println(course);
		}
	}

}
