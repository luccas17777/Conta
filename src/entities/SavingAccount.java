package entities;

public class SavingAccount extends Account{
	private Double interestRate;
	

	public SavingAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updaBalan() {
		balance += balance * interestRate;
	}
	
	@Override  //Indicar para o compilador que é uma sobreposição
	public void withdraw(double amount) {
		balance -= amount;
	}
}
