package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class housingLoanAcc implements LoanAcc, DebitInterest
{
	public void createAccount()
	{
		System.out.println("you created a new housing loan acc");
	}
	@Override
	public void deductMonthlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting monthly interest in housing loan acc");
	}

	@Override
	public void deductHalfYearlyInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting half yearly interest in housing loan acc");
	}

	@Override
	public void deductAnualInterest() {
		// TODO Auto-generated method stub
		System.out.println("deducting Annual interest in housing loan acc");
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("repay Principal in housing loan acc");
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("pay interest in housing loan acc");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("pay  partial principal in housing loan acc");
	}

}
