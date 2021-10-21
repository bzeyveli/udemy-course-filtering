package com.example.udemycoursefiltering.entity;

public class Course {

	String name;
	double point; // puan
	boolean free; // ücretsiz
	boolean paid; // ücretli
	String language;

	public Course(String name, double point, boolean free, boolean paid,
			String language) {
		this.name = name;
		this.point = point;
		this.free = free;
		this.paid = paid;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", point=" + point + ", free=" + free
				+ ", paid=" + paid + ", language=" + language + "]";
	}

	

	
}
