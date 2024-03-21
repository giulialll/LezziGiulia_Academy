package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Database {
	private Connection connection;
	private String url="jdbc:mysql://localhost:3306/experis";
	private String user = "giulia";
	private String password="Root123-";
	// un oggetto che serve per eseguire le query, un livello di astrazione
	private Statement stmt;
	
	/**
	 * 
	 * <p>costruttore Database</p>
	 * @throws SQLException
	 * @author giulia
	 */
	public Database() throws SQLException{
		this.connection=DriverManager.getConnection(url, user, password);
		this.stmt= connection.createStatement();
	}
	
	/**
	 * <p>metodo test per query</p>
	 * @throws SQLException
	 * @author giulia
	 */
	
	public void test() throws SQLException{
		 ResultSet rs = this.stmt.executeQuery("SELECT order_number,quantity FROM orders");
		 while(rs.next()){
			 System.out.println(rs.getString("order_number")); 
			 System.out.println(rs.getString("quantity"));
		 }
		 int riga = this.stmt.executeUpdate("UPDATE orders SET quantity =30,total_price =15.50 WHERE id=2;");
		 System.out.println(riga);
		 int rigaInsert = this.stmt.executeUpdate("INSERT INTO orders(order_number,today,quantity,total_price,order_status)"
		 		+ "VALUES(\"DE8543845845\",now(),25,20.75,1);");		
	}
	
	/**
	 * <p>questo metodo sere per racchiudere i record dentro ad un array di tipo Order</p>
	 * @throws SQLException
	 * @author giulia
	 */
	
	public void getOrdini() throws SQLException{
		ArrayList<Order> ordini = new ArrayList();
		ResultSet rs = this.stmt.executeQuery("SELECT * FROM orders");
		while(rs.next()){
			ordini.add(new Order(rs.getInt("id"),rs.getString("order_number"),rs.getString("today"),rs.getInt("quantity"),rs.getDouble("total_price"),rs.getString("order_status")));
		 }
		for(Order o : ordini){
			System.out.println(o.getId()
					           +o.getOrderNumber()
					           + o.getToday()
					           + o.getQuantity()
					           + o.getTotalPrice()
					           + o.getOrderStatus());
		}
	}
	
	
	
	
	
}
