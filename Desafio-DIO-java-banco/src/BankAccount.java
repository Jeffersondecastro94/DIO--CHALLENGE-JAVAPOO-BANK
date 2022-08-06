
public abstract class  BankAccount implements IAccount {

	protected int agency;
	protected int number;
	protected Double balance;
	
	private static final int AGENCY = 1;
	private static int SEQUENTIAL=1;

	public BankAccount(){
		
		this.agency=BankAccount.AGENCY;
		this.number= SEQUENTIAL++;
		
	}
	
	
	@Override
	public void withdrawMoney (double value) {
		this.balance-=value;
	}
	
	@Override
	public void cashDeposit(double value) {} ;
	this.balance+=value;
	
	@Override
	public void transferMoney(double value,BankAccount destinationAccount) {} ;
	
	
	
	public Double getBalance() {
		return balance;
	};

	public int getAgency() {
		return agency;
	};

	public int getNumber() {
		return number;
	};


	
	
	

};

