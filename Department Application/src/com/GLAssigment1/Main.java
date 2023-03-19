package com.GLAssigment1;

public class Main {
	public static void main(String args[]){
		Admindepartment admindept = new Admindepartment();
		Hrdepartment hrdept =new Hrdepartment();
		Techdepartment techdept =new Techdepartment ();
		System.out.println("Welocme to " +admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday());
		System.out.println("\nWelcome to " +hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());
		System.out.println("\nWelcome to " +techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}

}
