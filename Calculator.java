import java.util.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<Double> stack = new MyDeque<Double>();

      String[] split = s.split(" "); //split the parameter
      System.out.println(Arrays.toString(split)); //for debugging purposes

      for (int i = 0; i < split.length; i++){
        //System.out.println(split[i]); //for debugging purposes;
        if (split[i].equals("+")){
          System.out.println("plus");
        }
        if (split[i].equals("-")){
          System.out.println("minus");
        }
        if (split[i].equals("*")){
          System.out.println("times");
        }
        if (split[i].equals("/")){
          System.out.println("divide");
        }
        if (split[i].equals("%")){
          System.out.println("remainder");
        }
        else{
          System.out.println("number");
        }
      }
      return 0.0;
    }

    public static void main(String[] args) {
      System.out.println(eval("9 9 +"));
    }
}
