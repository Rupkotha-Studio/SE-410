package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {
    private static final String url="jdbc:mysql://localhost:3306/FinalLab";
    private static final String user="root";
    private static final String password="Test@123";
    private Connection connection = null;

    public Employee() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(url,user,password);
    }
    public void insertData() throws SQLException {
       var cs= connection.prepareCall("{CALL insert_data(?,?,?,?,?)}");
        cs.setInt(1,1925102002);
        cs.setString(2,"Durjoy");
        cs.setString(3,"Project Manager");
        cs.setString(4,"RUST DEV");
        cs.setInt(5,70000);
        cs.execute();
        System.out.println("ROW INSERTED...!!!");
    }
    public void update() throws SQLException {
       var cs= connection.prepareCall("{CALL update_data(?,?)}");
        cs.setInt(1,101);
        cs.setString(2,"Ayesha");
        cs.executeUpdate();
        System.out.println("ROW UPDATED...!!!");
    }
    public void selectAll() throws SQLException {
      var cs=  connection.prepareCall("{CALL select_data()}");
      cs.execute();
      System.out.println(cs.getString(1)+" "
              +cs.getString(2)+""
              +cs.getString(3));
    }
    public void deleteRecord() throws SQLException {
        var csd=connection.prepareCall("{CALL delete_data()}");
        csd.execute();
        System.out.println("RECORD DELETE...!!!");
        connection.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Employee().insertData();
    }
}
