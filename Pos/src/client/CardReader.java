package client;

public class CardReader {
	private int card_num;
	public CardReader() {
		this.card_num = 00000000;
	}
	public int read_card() {
		return card_num;
	}
}
