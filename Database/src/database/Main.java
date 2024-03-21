package database;

import java.sql.SQLException;

public class Main {

	/**
	 * <p>main</p>
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		Database db = new Database();
		db.getOrdini();
	}

}
