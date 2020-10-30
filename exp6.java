import java.io.*;
public class exp6 {

  public static void main(String[] args) {
    int number=20 ;
    System.out.print("Factors of a no are: ");
    
    for (int i = 1; i<= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}