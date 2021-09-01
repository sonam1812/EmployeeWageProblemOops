package com.bridgelabz.EmpWageProblemOops;

public class EmployeeWageProblemOops {
	public static final int wagePerHrs=20;
	public static final int workHrs = 0;
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int numWorkingDays=20;
	public static final int day=0;
	public static final int hrs=0;
	public static final int totalMonthlyHrs=10;
	
	public static void main(String[] args) {
		int Salary=wageCal();
		System.out.println("TotalWage:"+ Salary);
			 EmployeeWageProblemOops obj=new EmployeeWageProblemOops();
			 obj.wageCal();
	}
		
		public static int wageCal() {
			int workHrs=0,hrs=0,day=0;
			while(day<=numWorkingDays && hrs<=totalMonthlyHrs ) {
				int randomCheck = (int) (Math.floor(Math.random()*10)%3);
				day++;
				
				System.out.println("RandomCheckValue:"+randomCheck);
			
			switch(randomCheck) {
			 case isPartTime: 
			   {
					workHrs=4;
					break;
			   }
			   case isFullTime: 
			   {
					workHrs=8;
					break;
			   }
			   default :
			   {
				   workHrs=0; 
				   break;
			   }
			}
		hrs=hrs+workHrs;
		System.out.println(hrs);
	}
	int totalWage=wagePerHrs*hrs;
	return totalWage;
}
}