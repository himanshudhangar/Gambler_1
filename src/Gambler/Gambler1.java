package Gambler;

public class Gambler1 {

	public static void main(String[] args) {

		System.out.println("Welcome To Gambling Game");

	        int stake = 100;
	        int bet = 1;

	        System.out.println("Person Having Stack :" + stake + "$");
	        System.out.println("Person Betting Every Game :" + bet + "$");

			while (stake <= 150 && stake >= 50) {
			    int betPrice = (int) Math.floor(Math.random() * 10) % 2;
			    if (betPrice == 1) {
				System.out.println("Won He Get :" + betPrice + "$");
				stake++;
				System.out.println("Total stake :" + stake);
			    } else {
				System.out.println("loose He Get:" + betPrice + "$");
				stake--;
				System.out.println("Total stake :" + stake);
	            }
	        }
	        int TotalStake = stake;
	        System.out.println("Total Stake For Resign A Day is :" + TotalStake);
	    }
}
