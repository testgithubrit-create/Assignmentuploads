package p4;

public class PairDemo {

  public static void main(String[] args) {

    Pair<String, String> myobj1 = new Pair<>();
    myobj1.setKey("1");
    myobj1.setValue("Hello");

    System.out.println("Key: " + myobj1.getKey() + ", Value:" + myobj1.getValue());

    Pair<String, Date> myobj2 = new Pair<>();
    myobj2.setKey("Today is");
    myobj2.setValue(new java.util.Date());

    System.out.println("Key: " + myobj2.getKey() + ", Value:" + myobj2.getValue().toString());
  }

}
