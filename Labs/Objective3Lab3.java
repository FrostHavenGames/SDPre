public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third, sum;
    first = (int)(Math.random() * 6) + 1;
    second = (int)(Math.random() * 6) + 1;
    third = (int)(Math.random() * 6) + 1;
    sum = first + second + third;

    System.out.println(first + " + " + second + " + " + third + " = " + sum);
  }
}
