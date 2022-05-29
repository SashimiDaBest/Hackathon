import java.util.*;
//simple formula by https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
public class Home{ //Calculate and mkke double array from user's input to make pie chart
  public double[] list = new double[7];
  private String[] aspect = {"electric bill: ", "gas bill: ", "oil bill: ", "car millage: ", "number of flights in hours: ", "recycle paper(true/false)? ", "recycle aluminum and tin(true/false)? "};
  
  public double[] createList(double[] arr2, boolean[] arr3){
    for(int i = 0; i < arr2.length; i++){
      if(i == 0){
        list[0] = i * 105;
      }
      if(i == 1){
        list[1] = i * 105;
      }      
      if(i == 2){
        list[i] = i * 113;
      }
      if(i == 3){
        list[i] = i * 12 * 0.79;
      }
      if(i == 4 && arr2[i] <= 4){
        list[i] = i * 1100; 
      }
      else{
        list[i] = i * 4400;
      }
    } 
    for(int i = 0; i < arr3.length; i++){
      if(i == 0 && (!arr3[0])){
        list[5] = 184;
      }
      else if((!arr3[1])){
        list[6] = 166;
      }
    }
    return list;
  }

  public double[] getArr(){
    return list;
  }
  public String[] getAspect(){
    return aspect;
  }
}
