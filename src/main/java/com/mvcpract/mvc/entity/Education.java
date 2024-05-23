package com.mvcpract.mvc.entity;

public class Education {
	String university;
	String schoolname;
	String dgereename;
	String percentage;
	String specialization;

	public Education(String university, String schoolname, String dgereename, String percentage,
			String specialization) {
		super();
		this.university = university;
		this.schoolname = schoolname;
		this.dgereename = dgereename;
		this.percentage = percentage;
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "education [university=" + university + ", schoolname=" + schoolname + ", dgereename=" + dgereename
				+ ", percentage=" + percentage + ", specialization=" + specialization + "]";
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getDgereename() {
		return dgereename;
	}
	public void setDgereename(String dgereename) {
		this.dgereename = dgereename;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
