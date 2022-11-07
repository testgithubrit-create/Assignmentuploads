package p9;

// java code for Stream.min() method to get
//the minimum element of the Stream
//according to the provided comparator,import java.util.*;
class GFG {
  public static void main(String args[]) {
    //creating a list of integers List<Integer> list = Arrays.asList(-9, -18,0, 25,4);
    //Using stream.min() to get minimum
    //element according to provided integer comparator
    Integer var = list.stream().min(Integer.:compare).get();
    System.out.println(var);
  }
}