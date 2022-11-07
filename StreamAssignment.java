package p9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Fruit {
  String name;

  int calories;

  int price;

  String color;

  Fruit(String name, int calories, int Price, String color) {

    this.name = name;
    this.calories = calories;
    this.price = this.price;
    this.color = color;
  }

  public String getName() {

    return this.name;
  }

  public int getCalories() {

    return this.calories;
  }

  public int getPrice() {

    return this.price;
  }

  public String getColor() {

    return this.color;
  }

  @Override
  public String toString() {

    return "Fruit{" + "name='" + this.name + '\'' + ",calories='" + this.calories + ",price=" + this.price + ",color='"
        + this.color + '\'' + '}';
  }
}

public class StreamAssignment {
  public static void main(String args[]) {

    List<Fruit> fruits = Arrays.asList(new Fruit("Apple", 80, 100, "Red"), new Fruit("Mango", 110, 150, "Yellow"),
        new Fruit("Orange", 60, 80, "Orange"), new Fruit("Cherries", 50, 50, "Red"),
        new Fruit("Banana", 70, 40, "Yellow"), new Fruit("Kiwi", 150, 120, "Green"));
    System.out.println(fruits);
    System.out.println("List of fruits sorted by calories");
    fruits.stream().filter(p -> p.getCalories() < 100)
        .sorted((Fruit o1, Fruit o2) -> o2.getCalories() - o1.getCalories())
        .forEach(p -> System.out.println(p.getName()));
    System.out.println("List of fruits sorted by color");
    fruits.stream().sorted(new Comparator<Fruit>() {
      @Override
      public int compare(Fruit o1, Fruit o2) {

        return o1.getColor().compareTo(o2.getColor());
      }
    }).forEach(p -> System.out.println(p.getName()));
    System.out.println("List of fruits whose color red sorted by price");
    fruits.stream().filter(p -> p.getColor().equalsIgnoreCase("Red"))
        .sorted((Fruit o1, Fruit o2) -> o1.getPrice() - o2.getPrice()).forEach(p -> System.out.println(p.getName()));

  }
}
