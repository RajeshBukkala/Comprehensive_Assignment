package Assignment;

import java.util.Scanner;

public class IT_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Enter Taxable Income: $");
		double taxableIncome = scanner.nextDouble();
		
		double taxPaidPerYear= calculateTaxPaid(taxableIncome);
		double taxPayablePerMonth=taxPaidPerYear / 12;
		
		System.out.println("Tax Paid Per Year: $" + taxPaidPerYear);
		System.out.println("Tax Payable Per Months: $" + taxPayablePerMonth);
		
		
		scanner.close();
	}
	
	public static double calculateTaxPaid(double taxableIncome) {
		
		if (taxableIncome <= 25000) {
			return 0;
		}
		else if (taxableIncome <= 50000) {
			return taxableIncome * 0.1;
		}
		else if (taxableIncome <= 75000) {
			return taxableIncome * 0.2;
		}
		else {
			return taxableIncome * 0.3;
	
		}
			

	}

}
