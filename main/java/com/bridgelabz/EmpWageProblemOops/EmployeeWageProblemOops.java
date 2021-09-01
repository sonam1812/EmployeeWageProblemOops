package com.bridgelabz.EmpWageProblemOops;

public class EmployeeWageProblemOops {
	int wagePerHrs=20;
	int dailyWage;
	int workHrs=0;
	int totalWage=0;
		public static void main(String[] args) {
			for(int day=1;day<=20;day++) {
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			System.out.println(randomCheck);
			 EmployeeWageProblemOops obj=new EmployeeWageProblemOops();
			 obj.wageCal(randomCheck);
			}
		}
		
		public void wageCal(int randomCheck) {
			int dailyWage=0;
			
			switch(randomCheck) {
			   case 1:
			   {
				workHrs=4;
					break;
			   }
			   case 2:
			   {
				   workHrs=8;	
					break;
			   }
					default: {
					
						workHrs=0;
					}
			   }
			dailyWage=wagePerHrs*workHrs;
			System.out.println("DailySalary:"+dailyWage);
			totalWage=totalWage+dailyWage;
			System.out.println("Salary:"+totalWage);
		}
		}
