
public class CurrentAccount extends BankAccount {

public CurrentAccount(Client client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

@Override
public void printExtract() {
	System.out.println("=== extrato conta corrente ===");
	super.printBankInformation();
}
}