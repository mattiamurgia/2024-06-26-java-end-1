public class BankAccount {

    private double personalAccount;

    public BankAccount(double money) {
        setPersonalAccount(money);
    }

    public double getPersonalAccount() {
        return this.personalAccount;
    }

    public void setPersonalAccount(double personalAccount) {
        this.personalAccount = personalAccount;
    }

    // Method for adding money
    public void addMoney(double amount) {
        if (amount > 0) {
            this.personalAccount += amount;
            System.out.println("Deposito di " + amount + " effettuato");
        } else {
            System.out.println("L'importo del deposito non valido");
        }
    }

    // Method for making the withdrawal
    public void removeMoney(double amount) throws Exception {
        if (amount > 0) {
            if (amount <= getPersonalAccount()) {
                this.personalAccount -= amount;
                System.out.println("Prelievo di " + amount + " effettuato");
            } else {
                throw new Exception("Saldo insufficiente");
            }
        } else {
            System.out.println("L'importo del prelievo non valido");
        }
    }

    // Bank account details
    public String getDetails() {
        return "Saldo attuale: " + getPersonalAccount();
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
