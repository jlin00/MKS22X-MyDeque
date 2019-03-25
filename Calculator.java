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
        //System.out.println(value); //for debugging purposes;
        String value = split[i];
        if (value.equals("+")){
          stack.addLast(stack.removeLast() + stack.removeLast());
          System.out.println("plus");
        }
        else if (value.equals("-")){
          stack.addLast(stack.removeLast() - stack.removeLast());
          System.out.println("minus");
        }
        else if (value.equals("*")){
          stack.addLast(stack.removeLast() * stack.removeLast());
          System.out.println("times");
        }
        else if (value.equals("/")){
          stack.addLast(stack.removeLast() / stack.removeLast());
          System.out.println("divide");
        }
        else if (value.equals("%")){
          stack.addLast(stack.removeLast() % stack.removeLast());
          System.out.println("remainder");
        }
        else{
          stack.addLast(Double.parseDouble(value));
          System.out.println("number");
        }
      }
      return stack.getLast();
    }

    public static void main(String[] args) {
      System.out.println(eval("9 9 +"));
    }
}
