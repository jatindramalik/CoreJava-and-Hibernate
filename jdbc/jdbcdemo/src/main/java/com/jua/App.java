package com.jua;


import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {   
        String url = "jdbc:mysql://localhost:3306/jatin";
        String user = "root";
        String password = "password";
        String query = "insert into alien values (?,?,?)";
        int aid = 115;
        String aname = "sukuta";
        String tech = "Driver";


        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, aid);
        st.setString(2, aname);
        st.setString(3, tech);
        int count = st.executeUpdate();

        System.out.println(count +"rows affected");

       
    
        st.close();
        con.close();

    }
}
