
public class CurrentAccount extends BankAccount {

@Override
public void printExtract() {
	System.out.println("=== extrato conta corrente ===");
	super.printBankInformation();
}
}