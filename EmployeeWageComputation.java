package com.practiceproblem;//add part time employee wage

public class EmployeeWageComputation {
	
public static void main(String args[]) {
	System.out.println("Welcome to Employee Wage Computation");
	int EMP_RATE_PER_HOUR=20;
	int IS_PART_TIME=1;
	int empHrs=0;
	int empWage=0;
	int IS_FULL_TIME=2;
	double empCheck;
	empCheck=Math.floor(Math.random()*10)%2;
	
	if(empCheck==IS_PART_TIME)
		empHrs=4;
		
	else if(empCheck==IS_FULL_TIME)
		empHrs=8;
	else
		empHrs=0;
	
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("empWage:"+empWage);
	
}
}
