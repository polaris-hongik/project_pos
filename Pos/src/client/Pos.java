package client;

public abstract class Pos {
    private Payment payment;
    private int price = 1000;
    public void pay() {
    	if(payment.pay(price)) {
    		System.out.println("<class Pos>���� �Ϸ�");
    	}else {
    		System.out.println("<class Pos>���� ����");
    	}
    }
    
    public void setPaymentMethod(Payment payment) {
    	this.payment = payment;
    }
}
