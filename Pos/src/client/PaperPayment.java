package client;

import java.util.Scanner;

public class PaperPayment implements Payment{
	@Override
	public boolean pay(int price) {
		Scanner sc = new Scanner(System.in);
		System.out.print("<class PaperPayment>�մ����κ��� ���� �� : ");
		int money = sc.nextInt(); 
		sc.close();
		if(money >= price) {
			System.out.println("<class PaperPayment> �Ž����� : "+(money - price));
			return true;
		}else {
			System.out.println("<class PaperPayment>���� �����մϴ�.");
			return false;
		}
	}

}
