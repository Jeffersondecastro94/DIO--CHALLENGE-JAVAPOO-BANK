
public class SavingsAccount extends BankAccount{
	
	@Override
	public void printExtract() {
		System.out.println("=== extrato conta poupan�a ===");
		super.printBankInformation();
	}

}
