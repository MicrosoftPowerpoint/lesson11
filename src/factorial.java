import TerminalIO.*;
public class factorial {
    static int fact = 0;
    static int factorial=0;
    public static void main(String[] args){
        KeyboardReader k = new KeyboardReader();
        int fact = k.readInt("Enter a number between 1 to 15: ");
         
        if(fact < 1 || fact >15)
        {
            
             System.out.println("Invalid number");
             return ;
        }
        System.out.println("Factorial " + fact + " = " + factorial(fact));
    }
    
       static int factorial (int n){
        if(n==1)
            return 1;
        else
            return n* factorial (n-1);
                     
                     }
                   
        
        
        
          
        }
            
            
    
        
        
       
    
    

