package minimarketShop;

import java.util.Set;
import java.util.TreeMap;

public class MinimarketShop {

    private String name;
    private String address;
    private TreeMap<Product, Integer> stock = new TreeMap<>();

    public MinimarketShop(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addProduct(Product pr, int quantity) {

        boolean isExist = stock.containsKey(pr);
        if (isExist == false) {
            stock.put(pr, quantity);
        } else {
            int value = stock.get(pr);
            value += quantity;
            stock.replace(pr, value);
        }

    }

    public void display() {

        System.out.println("------------------------------------");
        System.out.println("Minimarket :" + name);
        System.out.println("Address :" + address);
        System.out.println("Stock :");

        for (Product s : stock.keySet()) {

            System.out.println(s + " = " + stock.get(s));
        }

    }

    public void removeProduct(int code, int quanity) {

        int flag = 0;
        for (Product pr : stock.keySet()) {

            if (pr.getCode() == code) {
                flag++;
                int value = stock.get(pr);
                value -= quanity;
                stock.replace(pr, value);
            }

        }
        if (flag == 0) {
            System.out.println("Product is not available");
        }
    }

    public void returnProduct(int code, int quantity) {

        Set<Product> keys = stock.keySet();
        for (Product pr : keys) {
            int pcode = pr.getCode();
            if (pcode == code) {
                int value = stock.get(pr);
                value += quantity;
                stock.replace(pr, value);
                return;
            }
            System.out.println("Error: wrong code:" + code);
        }

    }

    public void findProduct(int code) {
        for (Product pr : stock.keySet()) {
            if (pr.getCode() == code) {
                System.out.println("Product");
                System.out.println(pr);
                System.out.println("Quanity: " + stock.get(pr));

            }
        }

    }

    public double calculateTotalPrice() {

        double priceOfQuanity = 0;
        double totalPrice = 0;
        for (Product p : stock.keySet()) {
            priceOfQuanity = p.getPrice() * stock.get(p);
            totalPrice += priceOfQuanity;

        }
        return totalPrice;
    }

}
