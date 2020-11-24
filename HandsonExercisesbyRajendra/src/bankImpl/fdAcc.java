package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class fdAcc implements DepositAcc, CreditInterest 
{
	public void createAccount()
	{
		System.out.println("you created a new fd acc");
	}
	@Override
	public void addMonthlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("adding monthly interest to fixed account");
	}

	@Override
	public void addHalfYearlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("adding half yearly interest to fixed account");
	}

	@Override
	public void addAnnualInterest() {
		// TODO Auto-generated method stub
		System.out.println("adding annual interest to fixed account");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdrawing money from fixed account");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("depositing money to fixed account");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("displaying amount of fixed account");
	}

}
