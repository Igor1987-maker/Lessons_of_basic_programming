package minimarketShop;

public class MainMinimarket {

	public static void main(String[] args) {
		
		MinimarketShop mns = new MinimarketShop("Sun", "Hertzel 2, Rehovot");
		
		Product p1 = new Product("CoCa Cola", 7.30, "1 L", 123);
		Product p2 = new Product("Vodka", 55.0, "750 ml", 222);
		Product p3 = new Product("Yogurt", 5.5, "150 ml", 432);
		Product p4 = new Product("Potatoes", 8.9, "1 kg", 515);
		Product p5 = new Product("Ketchup", 11.0, "1 bottle", 771);
		
		mns.addProduct(p1, 2);
		mns.addProduct(p2, 10);
		mns.addProduct(p3, 30);
		mns.addProduct(p4, 440);
		mns.addProduct(p5, 23);
		
		mns.display();
		mns.removeProduct(515, 10);
		mns.display();
	}

}
