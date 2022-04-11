package Gambler;

public class Gambler1 {

	static int stake=100;
		static final int bet=1;
	    
		
			public static void main(String[] args) 
			{
				System.out.println("available Stack :" + stake + "$");
	      			  System.out.println("Person Betting Every Game :" + bet + "$");
	        
	       			 int betPrice = (int) Math.floor(Math.random() * 10) % 2;
			
	    			  	  if (betPrice == 1) 
					{
	       			 	    System.out.println("Won then Get :" + betPrice + "$");
	    			   
				 	 } else 
			          	    System.out.println("loose then Get:" + betPrice + "$");
	     		   }
             
		}
}
