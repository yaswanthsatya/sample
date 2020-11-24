package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class personalLoanAcc implements LoanAcc, DebitInterest 
{
	public void createAccount()
	{
		System.out.println("you created a new personal loan acc");
	}
	@Override
	public void deductMonthlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting monthly interest in personal loan acc");
	}

	@Override
	public void deductHalfYearlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting Half yearly interest in personal loan acc");

	}

	@Override
	public void deductAnualInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting annual interest in personal loan acc");

	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("repayPrincipal in  personal loan acc");

	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("pay interest in  personal loan acc");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("payPartialPrincipal in  personal loan acc");
	}

}
