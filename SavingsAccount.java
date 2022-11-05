package p3;

public class SavingsAccount {
  double balance = 15000;

  long id;

  SavingsAccount(long id, double balance) {

    this.balance = balance;
    this.id = id;
  }

  public double withdraw(double amt) {

    if (this.balance == 0 || this.balance < amt) {
      throw new RuntimeException("InsuffficientBalanceException");
    } else if (amt < 0) {
      throw new RuntimeException("IllegalBankTransactionException");
    }
    return amt;
  }

  public double deposit(double amt) {

    this.balance += amt;
    return this.balance;
  }

  public static void main(String args[]) {

    SavingsAccount s1 = new SavingsAccount(12703, 28000);
    double availBal = s1.deposit(5000);
    System.out.println("Available Balance after deposit: " + availBal);
    double withdrawAmt = s1.withdraw(35000);
    System.out.println("Available Balance after withdraw: " + (availBal - withdrawAmt));
  }

}
