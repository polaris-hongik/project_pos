package client;

public class CardPayment implements Payment{
	@Override
	public boolean pay(int price) {
		CardReader cr = new CardReader();
		int card_num = cr.read_card();
		System.out.println("<class CardPayment>카드 서버와 통신중...");
		System.out.println("카드번호 : "+card_num);
		boolean server = true;
		if(server) {
			System.out.println("<class CardPayment>결제 정보 서버에 전송 ...");
			System.out.println("카드번호 : "+card_num);
			return true;
		} else {
			System.out.println("<class CardPayment>결제 실패...");
			return false;
		}
	}
}
