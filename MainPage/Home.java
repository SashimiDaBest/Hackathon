import java.util.*;
//simple formula by https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
public class Home{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("User Input (MONTHLY)");

    String[] aspect = {"electric bill: ", "gas bill: ", "oil bill: ", "car millage: ", "number of flights in hours: ", "recycle paper(true/false)? ", "recycle aluminum and tin(true/false)? "};

    boolean[] two = new boolean[2];
    double[] five = new double[5];
    double[] list = new double[7];
          
    for(int i = 0; i < aspect.length; i++){
      if(i >= 5){
        System.out.print(aspect[i]);
        boolean ans = in.nextBoolean();
        two[i-5] = ans;
      }
      else{
        System.out.print(aspect[i]);
        double value = in.nextDouble();
        five[i] = value;
      }
    }

    //list = Home.createList(list);
    for(int i = 0; i < five.length; i++){
      if(i == 0 || i == 1){
        list[i] = i * 105;
      }
      if(i == 2){
        list[i] = i * 113;
      }
      if(i == 3){
        list[i] = i * 12 * 0.79;
      }
      if(i == 4 && five[i] <= 4){
        list[i] = i * 1100; 
      }
      else{
        list[i] = i * 4400;
      }
    }
    for(int i = 0; i < two.length; i++){
      if(i == 0){
        list[3] = i + 184;
      }
      else{
        list[4] = i + 166;
      }
    }

    double total = 0;
    for(double x:list){
      total += x;
    }

    System.out.println("User Annual Carbon Footprint: "+total);
    
  }
  public double[] createList(double[] arr){
    
    return arr;
  }
}