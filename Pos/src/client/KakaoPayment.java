package client;

public class KakaoPayment implements Payment{
	@Override
	public boolean pay(int price) {
		Barcode bar = new Barcode();
		int kakao = bar.read();
		System.out.println("<class KaKaoPayment>īī������ ������ �����...");
		System.out.println("īī������ : "+kakao);
		boolean server = true;
		if(server) {
			return true;
		}else {
			return false;
		}
	}

}
