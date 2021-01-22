package client;

public abstract class Pos {
    private Payment payment;
    private AssetManager am = new AssetManager();
    private int price = 1000;
    public void pay() {
    	if(payment.pay(price)) {
    		System.out.println("<class Pos>���� �Ϸ�");
    		am.earn(payment, price);
    	}else {
    		System.out.println("<class Pos>���� ����");
    	}
    }
    
    public void setPaymentMethod(Payment payment) {
    	this.payment = payment;
    }
    
    public void assetStat() {
    	am.stat();
    }
}
