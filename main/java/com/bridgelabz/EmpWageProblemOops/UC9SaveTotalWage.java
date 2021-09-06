package com.bridgelabz.EmpWageProblemOops;

public class UC9SaveTotalWage {

	private int wagePerHrs;
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	private int numWorkingDays;
	private int totalMonthlyHrs;
	private String company;
	private int totalWage;
	
	public static void main(String[] args) {
	    UC9SaveTotalWage wipro=new UC9SaveTotalWage("wipro",20,2,10);
	    wipro.wageCal();
		System.out.println(wipro);
		UC9SaveTotalWage tcs=new UC9SaveTotalWage("tcs",40,3,20);
		tcs.wageCal();
		System.out.println(tcs);
		UC9SaveTotalWage hcl=new UC9SaveTotalWage("hcl",30,4,40);
		hcl.wageCal();
		System.out.println(hcl);
			}


	public UC9SaveTotalWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		this.company = company;
		this.wagePerHrs = wagePerHrs;
		this.numWorkingDays = numWorkingDays;
		this.totalMonthlyHrs = totalMonthlylHrs;
	}
		
		public int wageCal() {
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
		//override
		public String toString() {
		
			return "Total Emp wage for Company : " +company+ " is " +totalWage;
		}
		
}

		

	