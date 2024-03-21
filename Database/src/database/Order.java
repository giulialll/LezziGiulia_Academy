package database;

public class Order {
	private int id;
	private String orderNumber;
	private String today;
	private int quantity;
	private double totalPrice;
	private String orderStatus;
	
	/**
	 * @author giulia
	 * @param id
	 * @param orderNumber
	 * @param today
	 * @param quantity
	 * @param totalPrice
	 * @param orderStatus
	 * 
	 * <p>Questa costruttore è della classe Order che si riferisce all'entità order su mysql</p>
	 * 
	 *
	 */
	
	public Order(int id, String orderNumber, String today, int quantity, double totalPrice, String orderStatus) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.today = today;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
