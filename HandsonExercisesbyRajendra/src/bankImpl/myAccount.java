package bankImpl;

public class myAccount {

	public static void main(String[] args) 
	{
		fdAcc fd = new fdAcc();
		housingLoanAcc hla = new housingLoanAcc();
		SavingsAcc sa = new SavingsAcc();
		personalLoanAcc pla = new personalLoanAcc();
		
		pla.deductAnualInterest();
		pla.deductHalfYearlyInterest();
		pla.deductMonthlyInterest();
		
		hla.payInterest();
		hla.payPartialPrincipal();
		hla.repayPrincipal();
		
	}

}
