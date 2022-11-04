package p2;

class saving {
  String name;

  int money;

  saving(String name, int money) {

    this.name = name;
    this.money = money;
  }

  public void fixeddeposit() {

    System.out.println("money deposited is " + this.money);
  }

  public int totalMoney() {

    return this.money;
  }
}

class current {
  String name;

  int moneyc;

  current(String name, int moneyc) {

    this.name = name;
    this.moneyc = moneyc;
  }

  public int cashcredit() {

    System.out.println("money credited is " + this.moneyc);

    return this.moneyc;
  }

  public int totalMoney() {

    return this.moneyc;
  }
}

class bank2 {
  public static void main(String[] args) {

    saving s = new saving("SU", 1000);
    s.fixeddeposit();
    int p = s.totalMoney();
    current c = new current("SV", 2000);
    c.cashcredit();
    int d = c.totalMoney();
    int y = p + d;
    System.out.println("Total money in the bank is" + y);
  }
}
