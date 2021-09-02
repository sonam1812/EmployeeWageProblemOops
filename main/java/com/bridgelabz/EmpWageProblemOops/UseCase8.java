package com.bridgelabz.EmpWageProblemOops;

public class UseCase8 {

	private final int wagePerHrs;
	public static final int workHrs = 0;
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	private final int numWorkingDays;
	public static final int day=0;
	public static final int hrs=0;
	private final int totalMonthlyHrs;
	private final String company;
	
	
	public static void main(String[] args) {
	    UseCase8 wipro=new UseCase8("wipro",20,2,10);
		System.out.println("Total wage for Company:"+ wipro.company +" "+wipro.wageCal());
		UseCase8 tcs=new UseCase8("tcs",40,3,20);
		System.out.println("Total Wage for Company:"+ tcs.company +" "+tcs.wageCal());
		UseCase8 hcl=new UseCase8("hcl",30,4,40);
		System.out.println("Total Wage for Company:"+ hcl.company +" "+hcl.wageCal());
			}


	public UseCase8 (String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
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
}

		

	