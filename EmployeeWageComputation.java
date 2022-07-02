package com.practiceproblem;//calculate daily employee wage

public class EmployeeWageComputation {
	
public static void main(String args[]) {
	System.out.println("Welcome to Employee Wage Computation");
	int EMP_RATE_PER_HOUR=20;
	int empHrs;
	int empWage;
	int IS_FULL_TIME=1;
	double empCheck;
	empCheck=Math.floor(Math.random()*10)%2;
	
	if(empCheck==IS_FULL_TIME)
		empHrs=8;
		
	else
		empHrs=0;
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("empWage:"+empWage);
	
}
}
