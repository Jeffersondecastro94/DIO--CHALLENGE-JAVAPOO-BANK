
public abstract class  BankAccount implements IAccount {

	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
	
	private static final int AGENCY = 1;
	private static int SEQUENTIAL=1;

public BankAccount(Client client){
		
		this.agency=BankAccount.AGENCY;
		this.number= SEQUENTIAL++;
		this.client=client;
		
	}
	
	
	@Override
	public void withdrawMoney (double value) {
		this.balance-=value;
	}
	
	@Override
	public void cashDeposit(double value) {
		this.balance+=value;
	} ;
	
	
	@Override
	public void transferMoney(double value,BankAccount destinationAccount) {
		this.withdrawMoney(value);
		destinationAccount.cashDeposit(value);
	} ;
	
	public void printExtract() {
		// TODO Auto-generated method stub
		
	}
	
	
	public Double getBalance() {
		return balance;
	};

	public int getAgency() {
		return agency;
	};

	public int getNumber() {
		return number;
	};


	protected void printBankInformation() {
		System.out.println(String.format("Cliente:%s", this.client.getName()));
		System.out.println(String.format("Agencia:%d", this.agency));
		System.out.println(String.format("Numero:%d", this.number));
		System.out.println(String.format("Saldo:%.2f", this.balance));
	}




	
	

};

