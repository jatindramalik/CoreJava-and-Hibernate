package com.jua.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.jua.web.model.Alien;
import java.sql.Statement;

public class AlienDao {

    public Alien getAlien(int aid){
        Alien alien = new Alien();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jatin","root","password");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
            if(rs.next()){
                alien.setAid(rs.getInt("aid"));
                alien.setAname(rs.getString("aname"));
                alien.setTech(rs.getString("tech"));
            }
            
        } catch (Exception e) {
            
        }

        return alien;
    }
    
}
