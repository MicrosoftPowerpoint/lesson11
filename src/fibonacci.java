import TerminalIO.*;

public class fibonacci {
    static int fib = 0;
    static int fibonacci=0;
     public static void main(String[] args){
        KeyboardReader k = new KeyboardReader();
        int fib = k.readInt("Enter a number between 1 to 15: ");
 
        if(fib < 1 || fib >15)
        {
            
             System.out.println("Invalid number");
             return ;
        }
        System.out.println("Fibonacci of " + fib + " = " + fibonacci(fib));
    }
   
         static int fibonacci(int n){
        if (n <= 2)
            return 1;
        else 
            return fibonacci(n - 1) + fibonacci (n - 2);
        
     }
    }
