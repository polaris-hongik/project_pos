package client;

public class KakaoPayment implements Payment{
	@Override
	public boolean pay(int price) {
		Barcode bar = new Barcode();
		int kakao = bar.read();
		System.out.println("<class KaKaoPayment>카카오페이 서버와 통신중...");
		System.out.println("카카오페이 : "+kakao);
		boolean server = true;
		if(server) {
			return true;
		}else {
			return false;
		}
	}

}
