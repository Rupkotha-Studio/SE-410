package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDb {
//    insert into student values("Durjoy Acharya","10","Savar"),("Sojol Sarkar","12","Gazipur"),("Ayesha","15","Novinogor");


    private static final String url="jdbc:mysql://localhost:3306/FinalLab";
    private static final String user="root";
    private static final String password="Test@123";
    private Connection connection = null;

    public StudentDb() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(url,user,password);
    }
    public void insertValues() throws SQLException {
        String sql="insert into student " +
                "values(\"Durjoy Acharya\",\"10\",\"Savar\")," +
                "(\"Sojol Sarkar\",\"12\",\"Gazipur\")," +
                "(\"Ayesha\",\"15\",\"Novinogor\")";
        var rs=connection.prepareStatement(sql);
        var value=rs.executeUpdate();
        if (value!=-1)
            System.out.println("Row Inserted");
        else System.out.println("Failed");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new StudentDb().insertValues();
    }
}
