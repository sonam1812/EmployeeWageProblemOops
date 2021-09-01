package com.bridgelabz.EmpWageProblemOops;

public class EmployeeWageProblemOops {
	int wagePerHrs=20;
	int dailyWage;
		public static void main(String[] args) {
		
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			System.out.println(randomCheck);
			 EmployeeWageProblemOops obj=new EmployeeWageProblemOops();
			 obj.wageCal(randomCheck);
			
			
		}
		public void wageCal(int randomCheck) {
			int dailyWage=0;
			
		switch(randomCheck) {
			   case 1:
			   {
					int halfTimeHrs=4;
					dailyWage=wagePerHrs*halfTimeHrs;
					System.out.println("DailyWage:"+dailyWage);
					break;
			   }
			   case 2:
			   {
					int fullTimeHrs=8;
					dailyWage=wagePerHrs*fullTimeHrs;
					System.out.println("DailyWage:"+dailyWage);
					break;
			   }
			default: {
			wagePerHrs=0;
					}   
		}
		}
}
	

