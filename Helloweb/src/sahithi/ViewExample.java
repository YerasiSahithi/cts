package sahithi;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewExample {

  public static void main(String[] args) throws Exception {
    Connection conn = getHSQLConnection();
    System.out.println("Got Connection.");
    Statement st = conn.createStatement();
    st.executeUpdate("create table survey (id int,name varchar);");
    st.executeUpdate("create view surveyView as (select * from survey);");
    st.executeUpdate("insert into survey (id,name ) values (1,'nameValue')");

    ResultSet rs = null;
    DatabaseMetaData meta = conn.getMetaData();
    rs = meta.getTables(null, null, null, new String[]{"VIEW"});

    while (rs.next()) {
      String tableName = rs.getString("TABLE_NAME");
      System.out.println("tableName=" + tableName);
    }

    st.close();
    conn.close();
  }

  private static Connection getHSQLConnection() throws Exception {
    Class.forName("org.hsqldb.jdbcDriver");
    System.out.println("Driver Loaded.");
    String url = "jdbc:hsqldb:data/tutorial";
    return DriverManager.getConnection(url, "sa", "");
  }

  public static Connection getMySqlConnection() throws Exception {
    String driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://localhost/octopus";
    String username = "root";
    String password = "root";

    Class.forName(driver); // load MySQL driver
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static Connection getOracleConnection() throws Exception {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:caspian";
    String username = "mp";
    String password = "mp2";

    Class.forName(driver); // load Oracle driver
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

}