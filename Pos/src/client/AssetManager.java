package client;

public class AssetManager {
	private int kakao,cash,card,pay;
	public AssetManager() {
		this.card = 0;
		this.cash = 0;
		this.kakao = 0;
		this.pay = 0;
	}
	
	public void stat() {
		System.out.println("<class AssetManager> �ڻ� ���");
		System.out.println("���� : "+cash);
		System.out.println("ī��� : "+card);
		System.out.println("īī������ : "+kakao);
		System.out.println("--------------------");
		System.out.println("���� : "+(cash + card + kakao));
		System.out.println("���� : "+pay);
		System.out.println("====================");
		System.out.println("������ : "+(cash+card+kakao - pay));
	}
	
	public boolean payment(int cost) {
		if(cash >= cost) {
			cash -= cost;
			pay += cost;
			System.out.println("<class AssetManager> ���� �Ϸ�");
			return true;
		}else {
			System.out.println("<class AssetManager> ���� ����");
			return false;
		}
	}
	
	public void earn(Payment p, int cost) {
		if(p instanceof PaperPayment) {
			cash += cost;
		} else if(p instanceof CardPayment) {
			card += cost;
		} else if(p instanceof KakaoPayment) {
			kakao += cost;
		}
	}
}
