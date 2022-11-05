package p5;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

class Contact {
  String name;

  String email;

  char gender;

  Contact(String name, String email, char gender) {

    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  @Override
  public String toString() {

    return "Contact{" + "name='" + this.name + '\'' + ", email='" + this.email + '\'' + ", gender=" + this.gender + '}';
  }
}

class number {
  int phno;

  number(int phno) {

    this.phno = phno;
  }

  @Override
  public String toString() {

    return "number{" + "phno=" + this.phno + '}';
  }
}

class Sortbyphno implements Comparator {
  @Override
  public int compare(Object str1, Object str2) {

    String i1 = str1.toString();
    String i2 = str2.toString();
    return i2.compareTo(i1);
  }
}

public class TreeExample {
  public static void main(String[] args) {

    number n1 = new number(647528916);
    number n2 = new number(647528919);
    number n3 = new number(647528915);
    Contact c1 = new Contact("a", "agmail.com", 'f');
    Contact c2 = new Contact("b", "bgmail.com", 'f');
    Contact c3 = new Contact("c", "cgmail.com", 'f');
    TreeMap<number, Contact> t1 = new TreeMap<number, Contact>(new Sortbyphno());
    t1.put(n1, c1);
    t1.put(n2, c2);
    t1.put(n3, c3);
    System.out.println(t1);
    Set s1 = t1.keySet();
    System.out.println(s1);
    Collection s2 = t1.values();
    System.out.println(s2);
    Set s3 = t1.entrySet();
    System.out.println(s3);
  }
}
