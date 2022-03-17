package minimarketShop;

public class Product implements Comparable <Product>{

	private String name;
	private double price;
	private String item;
	private int code;
	
		
	public Product(String name, double price, String item, int code) {
		super();
		this.name = name;
		this.price = price;
		this.item = item;
		this.code = code;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code != other.code)
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "name:" + name + ", price:" + price + ", item:" + item + ", code:" + code + "]";
	}



	@Override
	public int compareTo(Product other) {
		
		int res = this.name.compareToIgnoreCase(other.name);
		if(res==0) {
			res = this.item.compareToIgnoreCase(other.item);
		}
		if(res==0) {
			res = Double.compare(this.price, other.price);
		}
		if(res==0) {
			res = Integer.compare(this.code, other.code);
		}
		
		
		return res;
	}
	

	
	
	
	
	
	
	
	
	
	
}
