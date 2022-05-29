import java.util.*;

public class Progress{ 
  public static int goalSet(double[] arr){
    Scanner in = new Scanner(System.in);

    System.out.println("How much carbon reduction? ");
    int diff = in.nextInt();
    
    int total = 0;
    for(double x: arr){
      total += x;
    }
    return (int)total - diff;
  }
  public static void main(String[] args){
    double[] list = Home.getArr();
  }
}