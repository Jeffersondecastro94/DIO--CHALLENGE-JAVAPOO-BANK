
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount cc= new CurrentAccount();
		BankAccount cp= new SavingsAccount();

		
		cc.cashDeposit(100);
		cc.printBankInformation();
		
		
	}

}
