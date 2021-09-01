package com.bridgelabz.EmpWageProblemOops;

public class EmployeeWageProblemOops {

	public double isPresent() {
		
		int isPresent=1;
		double randomCheck = (int) (Math.floor(Math.random()*10)%2);
		if(isPresent == randomCheck)
		{
			System.out.println("Employee is Present");
			
		}
		else {
		
			System.out.println("Employee is Abscent");
		}
		return(isPresent);
	 }
		public void dailyWage(double check) {
		int wagePerHrs=20;
		int dailyWage;
		 int FullTimeHrs=8;
		    dailyWage=wagePerHrs*FullTimeHrs;
		   System.out.println("DailyWage:"+dailyWage);
	}



	 public static void main(String[] args) {
		EmployeeWageProblemOops obj = new EmployeeWageProblemOops();
		 double check = obj.isPresent();
		 obj.dailyWage(0);
	}

	 }
	 

