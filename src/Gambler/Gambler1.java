package Gambler;

public class Gambler1 {

	public static void main(String[] args) {
			
			int stake = 100;
			int bet = 1;
			int TotalwinAmt = 0;

			
		        System.out.println("Person Having Stack :" + stake + "$");
		        System.out.println("Person Betting Every Game :" + bet + "$");

		        for(int day=1;day<=20;day++) {
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
				int day_win_amount = stake - 100;
				System.out.println(" Amount won for day " + day + " is " + day_win_amount);
				TotalwinAmt = TotalwinAmt + day_win_amount;

				System.out.println("total amount " + TotalwinAmt);
			}
		}
}
