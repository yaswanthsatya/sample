package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest 
{
	public void createAccount()
	{
		System.out.println("you created a new savings acc");
	}
	@Override
	public void addMonthlyInterest() {
		// TODO Auto-generated method stub
     System.out.println("adding monthly interest to savings acc");
	}

	@Override
	public void addHalfYearlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("adding half yearly interest to savings acc");
	}

	@Override
	public void addAnnualInterest() {
		// TODO Auto-generated method stub
		System.out.println("adding annual interest to savings acc");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdrawing money from savings acc");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("depositing money to savings acc");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("showing account balance of savings acc");
	}

}
