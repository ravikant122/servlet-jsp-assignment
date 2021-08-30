package com.student.entity;

public class Student {
	private int Sap_ID;
	private String Stud_name;
	private String Stream;
	private Double Percentage;
	public Student() {}
	public Student(int sap_ID, String stud_name, String stream, Double percentage) {
		Sap_ID = sap_ID;
		Stud_name = stud_name;
		Stream = stream;
		Percentage = percentage;
	}
	public Student(String stud_name, String stream, Double percentage) {
		Stud_name = stud_name;
		Stream = stream;
		Percentage = percentage;
	}
	public int getSap_ID() {
		return Sap_ID;
	}
	public void setSap_ID(int sap_ID) {
		Sap_ID = sap_ID;
	}
	public String getStud_name() {
		return Stud_name;
	}
	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public Double getPercentage() {
		return Percentage;
	}
	public void setPercentage(Double percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [Sap_ID=");
		builder.append(Sap_ID);
		builder.append(", Stud_name=");
		builder.append(Stud_name);
		builder.append(", Stream=");
		builder.append(Stream);
		builder.append(", Percentage=");
		builder.append(Percentage);
		builder.append("]");
		return builder.toString();
	}

}
