package p4;

public class Employee<T1, T2, T3, T4> {
  private T1 id;

  private T2 name;

  private T3 salary;

  private T4 dept;

  Employee(T1 id, T2 name, T3 salary, T4 dept) {

    this.id = id;
    this.name = name;
    this.salary = salary;
    this.dept = dept;
  }

  public void displayDetails() {

    System.out.println("Employee Id: " + this.id);
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Salary: " + this.salary);
    System.out.println("Employee Department: " + this.dept);
    System.out.println();
  }
}
