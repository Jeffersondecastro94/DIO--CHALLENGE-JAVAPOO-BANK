
public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(Client client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printExtract() {
		System.out.println("=== extrato conta poupança ===");
		super.printBankInformation();
	}

}
