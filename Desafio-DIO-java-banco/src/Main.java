
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client jefferson =new Client();
		jefferson.setName("jefferson");
		
		BankAccount cc= new CurrentAccount(jefferson);
		BankAccount cp= new SavingsAccount(jefferson);

		
		cc.cashDeposit(100);
		cc.transferMoney(100, cp);
		
		
		cc.printExtract();
		cp.printExtract();
		
		
		
	}

}
