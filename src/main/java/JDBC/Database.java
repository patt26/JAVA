package JDBC;

import java.sql.*;

public class Database {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://127.0.0.1:3306/prat";
        String userName="root";
        String password="master123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,userName,password);
        Statement statement=con.createStatement();
        ResultSet rs= statement.executeQuery("select * from dept");
        int deptNo;
        String dname;

        while(rs.next()){
            deptNo=rs.getInt("deptno");
            dname=rs.getNString("dname");
            System.out.println(deptNo+" "+dname);
        }

    }

}
