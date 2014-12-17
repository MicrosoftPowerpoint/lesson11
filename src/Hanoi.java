
import TerminalIO.*;
public class Hanoi {
static int nummoves = 0;
static int move =0;
public static void main(String[] args){
    KeyboardReader k = new KeyboardReader();
        int numrings = k.readInt("Enter number of rings 3 to 12: ");
        
        if(numrings < 3 || numrings > 12)
        {
            System.out.println("Invalid input - program will now end.");
            return;
          
        }
            move(numrings, 1, 3, 2);
            System.out.println("Total moves = " + nummoves);
    }
        
        public static void move(int n, int i, int j, int k){
            if (n>0){
                nummoves++;
                move (n-1, i, k , j);
                System.out.println("Move ring " + n + " from peg " + i + " to peg " + j);
                move (n-1, k, j, i);
            }
        }
        }
    
    