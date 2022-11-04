package p2;

public class Singleton {

  static Singleton st = new Singleton();

  private Singleton() {

    System.out.println("constructor will invoke only one object");
  }

  static Singleton getInstance() {

    return st;
  }
}

class Test {
  public static void main(String args[]) {

    Singleton st1 = Singleton.getInstance();
    Singleton st2 = Singleton.getInstance();
    System.out.println(st1);
    System.out.println(st2);
  }
}
