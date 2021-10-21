package com.example.udemycoursefiltering.business.concrete;

import java.util.List;

import com.example.udemycoursefiltering.business.abstracts.CriterionToComparasionHelper;
import com.example.udemycoursefiltering.entity.Course;

public class TwoCriterionsCompare  implements CriterionToComparasionHelper{

	CriterionToComparasionHelper criterion1;
	CriterionToComparasionHelper criterion2;
	
	public TwoCriterionsCompare(CriterionToComparasionHelper criterion1, CriterionToComparasionHelper criterion2) {
		super();
		this.criterion1 = criterion1;
		this.criterion2 = criterion2;
	}
	
	// iki kriterin karþýlanmasý durumunda sonuc donecek 

	@Override
	public List<Course> CriterionToCompare(List<Course> course) {
		List<Course> list = criterion1.CriterionToCompare(course);
		
		return criterion2.CriterionToCompare(list);
			
		}
	}


