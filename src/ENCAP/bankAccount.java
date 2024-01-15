package ENCAP;

public class bankAccount {
	
	private String owner;
	private double balance;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw() {
		double updateAmount = balance-10;
		System.out.println("New Balance"+updateAmount);
		
	}
	public void deposit() {
		double updateAmount1 = balance+10;
		System.out.println("New Balance"+updateAmount1);
		
	}
	
	public bankAccount(String owner, double balance) {
		this.owner=owner;
		this.balance=balance;
		
	}
	


}
