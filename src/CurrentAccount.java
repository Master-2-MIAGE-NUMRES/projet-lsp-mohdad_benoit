// Compte courant qui permet les retraits et les dépôts
public class CurrentAccount extends BankAccount implements Withdrawable {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être positif");
        }
        if (amount > balance) {
            throw new IllegalStateException("Fonds insuffisants");
        }
        this.balance -= amount;
    }
}