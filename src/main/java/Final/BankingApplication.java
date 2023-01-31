package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankingApplication {
    private static final String url="jdbc:mysql://localhost:3306/FinalLab";
    private static final String user="root";
    private static final String password="Test@123";
    private Connection connection = null;
    public BankingApplication() throws SQLException, ClassNotFoundException {
        injector();
    }
    private void injector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(url,user,password);
    }
    public void insertion(long acc,String name,long balance,String phone,String address) throws SQLException {
        String sql="insert into bank values (?,?,?,?,?)";
        var rs=connection.prepareStatement(sql);//"select riding from User where userid = '"+ id + "';"
        //var value=rs.executeQuery(sql);
        rs.setString(1, String.valueOf(acc));
        rs.setString(2,name);
        rs.setString(3, String.valueOf(balance));
        rs.setString(4,phone);
        rs.setString(5,address);
        var value= rs.executeUpdate();
        if (value!=-1)
            System.out.println("Row Inserted");
        else System.out.println("Failed");
    }
    public void deletion(long acc) throws SQLException {
        String sql = "delete from bank  "+"where account_no='"+acc+"'";
        var rs=connection.prepareStatement(sql);
        var value=rs.executeUpdate();
        if (value!=-1)
            System.out.println("Row Deleted");
        else System.out.println("Failed");
    }
    public void update(long acc,String name,long balance,String phone,String address) throws SQLException {
        String sql = "update bank set customer_name='"+name+"',balance = '"+balance+"'," +
                "phone='"+phone+"',address='"+address+"' where account_no='"+acc+"'";
        var rs=connection.prepareStatement(sql);
        var value=rs.executeUpdate();
        if (value!=-1)
            System.out.println("Row Updated");
        else System.out.println("Failed");
    }
    public void PrintGreaterThanAmount() throws SQLException {
        String sql="select * from bank where balance>20000";
        var ss=connection.createStatement();
        var rs= ss.executeQuery(sql);
        while (rs.next())
        {
            System.out.println("Account Number: "+rs.getString("account_no"));
            System.out.println("Name: "+rs.getString("customer_name"));
            System.out.println("Balance: "+rs.getString("balance"));
            System.out.println("Phone: "+rs.getString("phone"));
            System.out.println("Address: "+rs.getString("address"));
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        var obj=new BankingApplication();
        //obj.insertion(1925102002,"Durjoy",2550,"01876068550","Dhaka");
        obj.PrintGreaterThanAmount();
    }

}
