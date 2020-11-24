package bank;

public interface DebitInterest extends Account
{
	void deductMonthlyInterest();
	void deductHalfYearlyInterest();
	void deductAnualInterest();
}
