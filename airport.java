package Mitsogo;
import java.util.*;
class airport
{
  static int weightMachine (int N, int weights[],int T)
  {
    int amount = 0, i;
    for (i = 0; i < N; i++) { 
    	
    	amount++;
    	
    	if (weights[i] > T)
	   {
	      amount++;
	    }
    }
    return amount;
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter No  of Luggages: ");
    int n = sc.nextInt ();
    int weights[]= new int[n];    
    for(int i=0; i<n; i++) {
    	System.out.print("Enter Weight of Luggage "+ (i+1) + ": ");
          weights[i] = sc.nextInt(); 
    }
    System.out.print("Enter the Threshhold: ");
    int t = sc.nextInt ();
    System.out.print ("Your Amount: $"+weightMachine(n, weights, t));      
  }
}