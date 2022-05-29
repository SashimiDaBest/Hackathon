import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Home one = new Home();
    double[] list1 = one.list;
    String[] list2 = one.getAspect();
    
    Scanner in = new Scanner(System.in);
    System.out.println("User Input (MONTHLY)");

    boolean[] two = new boolean[2];
    double[] five = new double[5];
//print and get input          
    for(int i = 0; i < list2.length; i++){
      if(i < 5){
        System.out.print(list2[i]);
        double value = in.nextDouble();
        five[i] = value;
        }
      else{
        System.out.print(list2[i]);
        boolean ans = in.nextBoolean();
        two[i-5] = ans;
      }
    }
    one.createList(five, two);
    
    for(double i:list1){
      System.out.println(i);
    }
    formatReturn(list1);
  }
  static void formatReturn(double[] list1){
    double total = 0;
    for(double x:list1){
      total += x;
    }
    System.out.println("User Annual Carbon Footprint: "+total);
  }
}