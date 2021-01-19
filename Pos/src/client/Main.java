package client;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 카드 2. 현금 3. 카카오페이");
		System.out.print("결제 방법을 선택하십시오 : ");
		int sel_payment = sc.nextInt();
		
		switch(sel_payment) {
		case 1:
			pos.setPaymentMethod(new CardPayment());
			break;
		case 2:
			pos.setPaymentMethod(new PaperPayment());
			break;
		case 3:
			pos.setPaymentMethod(new KakaoPayment());
			break;
		}
		pos.pay();
		
		sc.close();
	}

}
