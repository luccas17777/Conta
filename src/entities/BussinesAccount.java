package entities;

public class BussinesAccount extends Account {
	
	private double loanLimit;
	
	public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
		balance += amount - 10;
		}
	}
	
	@Override  //Indicar para o compilador que é uma sobreposição
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	@Override
	public String toString() {
		return "BussinesAccount [loanLimit= " + loanLimit + "Nome da Empresa: "+ holder +" saldo: "+balance+"]";
	}
	
	
	
	
	
}
