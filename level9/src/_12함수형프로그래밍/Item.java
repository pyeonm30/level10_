package _12함수형프로그래밍;

public class Item {

	private int itemNo;
	private String category;
	private String name;
	private int price;
	
	public Item(int itemNo, String category, String name, int price) {
		super();
		this.itemNo = itemNo;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "%d %s %s %d원".formatted(itemNo,category,name,price);
	}
	
	
	
	
	
	
}
