package com.bridgelabz.EmpWageProblemOops;

public class EmployeeWageProblemOops {

	 public void isPresent() {
		
		int isPresent=1;
		int randomCheck = (int) (Math.floor(Math.random()*10)%2);
		if(isPresent == randomCheck)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Abscent");
		}
	}
	 public static void main(String[] args) {
		EmployeeWageProblemOops obj = new EmployeeWageProblemOops();
        obj.isPresent();
	}

}
