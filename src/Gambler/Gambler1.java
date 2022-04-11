package Gambler;

public class Gambler1 {

	public static void main(String[] args) {
			
			int bet = 1;
			int total_win_amount = 0;
			int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

			for (int i = 0; i <= arr.length; i++) {
				int month_win_amount = 0;
				int month_win_days = 0;
				int month_loss_days = 0;
				for (int j = i + 1; j <= arr.length; j++) {

					int stake = 100;
					while (stake <= 150 && stake >= 50) {
						int random_value = (int) Math.floor(Math.random() * 10) % 2;
						int currentStack = stake;
						if (random_value == 0) {
							stake = stake - bet;
						} else {
							stake = stake + bet;
						}
					}
					int day_win_amount = stake - 100;
					System.out.println(" Amount won for day " + j + " is " + day_win_amount);
					total_win_amount = total_win_amount + day_win_amount;

					System.out.println("total amount " + total_win_amount);

					if (day_win_amount < 0) {
						month_loss_days = month_loss_days + 1;
					} else {
						month_win_days = month_win_days + 1;
					}

					month_win_amount = month_win_amount + day_win_amount;
					int sos = month_win_days - month_loss_days;
					System.out.print(month[i] + ": Total win days is:" + month_win_days + " Total loss days is: "
							+ month_loss_days);
					System.out.println("The difference between the no. of days won and lost is: " + sos);
					System.out.println(month[i] + ": Total win amount is: " + month_win_amount);
				}
		}
}
