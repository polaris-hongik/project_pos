package client;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ī�� 2. ���� 3. īī������");
		System.out.print("���� ����� �����Ͻʽÿ� : ");
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
