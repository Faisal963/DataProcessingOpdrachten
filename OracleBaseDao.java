package inleveropdracht1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;

public class OracleBaseDao {

    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String DB_USER = "FAISAL";
    private static final String DB_PASS = "12345";
    private Connection conn;

    public OracleBaseDao() {

    }

    protected static Connection getConnection() throws SQLException, ParseException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public void closeConnection() throws SQLException {
        this.conn.close();
    }
}
