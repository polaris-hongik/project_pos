package client;

import java.util.Scanner;

public class PaperPayment implements Payment{
	@Override
	public boolean pay(int price) {
		Scanner sc = new Scanner(System.in);
		System.out.print("<class PaperPayment>º’¥‘¿∏∑Œ∫Œ≈Õ πﬁ¿∫ µ∑ : ");
		int money = sc.nextInt(); 
		sc.close();
		if(money >= price) {
			System.out.println("<class PaperPayment> ∞≈Ω∫∏ßµ∑ : "+(money - price));
			return true;
		}else {
			System.out.println("<class PaperPayment>µ∑¿Ã ∫Œ¡∑«’¥œ¥Ÿ.");
			return false;
		}
	}

}
