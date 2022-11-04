package p1;

import java.util.Scanner;

public class AvgMarks {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter marks for Student 1: ");
    int a1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int a3 = scanner.nextInt();
    System.out.println("Enter marks for Student 2: ");
    int b1 = scanner.nextInt();
    int b2 = scanner.nextInt();
    int b3 = scanner.nextInt();
    System.out.println("Enter marks for Student 3: ");
    int c1 = scanner.nextInt();
    int c2 = scanner.nextInt();
    int c3 = scanner.nextInt();
    int s1 = a1 + a2 + a3;
    int s2 = b1 + b2 + b3;
    int s3 = c1 + c2 + c3;
    int totalMarks = s1 + s2 + s3;
    int avgMarks = (s1 + s2 + s3) / 3;
    System.out.println("Total marks scored by all students: " + totalMarks);
    System.out.println("Average marks scored by all students: " + avgMarks);
    System.out.println("Total marks scored by Student 1: " + s1);
    System.out.println("Total marks scored by Student 2: " + s2);
    System.out.println("Total marks scored by Student 3: " + s3);
    System.out.println("Average marks scored by Student 1: " + s1 / 3);
    System.out.println("Average marks scored by Student 2: " + s2 / 3);
    System.out.println("Average marks scored by Student 3: " + s3 / 3);
    System.out.println("Average marks scored in subject 1: " + (a1 + b1 + c1) / 3);
    System.out.println("Average marks scored in subject 2: " + (a2 + b2 + c2) / 3);
    System.out.println("Average marks scored in subject 3: " + (a3 + b3 + c3) / 3);
  }
}
