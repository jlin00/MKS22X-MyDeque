import java.util.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<Double> stack = new MyDeque<Double>();

      String[] split = s.split(" "); //split the parameter
      //System.out.println(Arrays.toString(split)); //for debugging purposes

      for (String value: split){
        //System.out.println(value); //for debugging purposes;
        if (value.equals("+")){
          stack.addLast(stack.removeLast() + stack.removeLast());
          //System.out.println("plus");
        }
        else if (value.equals("-")){
          double second = stack.removeLast();
          double first = stack.removeLast();
          stack.addLast(first - second);
          //System.out.println("minus");
        }
        else if (value.equals("*")){
          stack.addLast(stack.removeLast() * stack.removeLast());
          //System.out.println("times");
        }
        else if (value.equals("/")){
          double second = stack.removeLast();
          double first = stack.removeLast();
          stack.addLast(first / second);
          //System.out.println("divide");
        }
        else if (value.equals("%")){
          double second = stack.removeLast();
          double first = stack.removeLast();
          stack.addLast(first % second);
          //System.out.println("remainder");
        }
        else{
          stack.addLast(Double.parseDouble(value));
          //System.out.println("number");
        }
      }
      return stack.getFirst();
    }


    public static void main(String[] args) {
      System.out.println(eval("9 9 +")); //18.0
      System.out.println(eval("10 2.0 +")); //12.0
      System.out.println(eval("11 3 - 4 + 2.5 *")); //30.0
      System.out.println(eval("8 2 + 99 9 - * 2 + 9 -")); //893.0
      System.out.println(eval("1 2 3 4 5 + * - -")); //26.0
      System.out.println(eval("9 8 -")); //1.0

    }
}
