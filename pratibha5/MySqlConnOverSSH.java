package com.org.care;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

import java.sql.Statement;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.sql.Connection;
 
 
public class MySqlConnOverSSH {
 
    /**
     * Java Program to connect to remote database through SSH using port forwarding
     * @author Pankaj@JournalDev
     * @throws SQLException 
     */
	protected static Statement stmt =null;
	protected static ResultSet rs = null;
    protected static String sql = null;
    
    public static void main(String[] args) throws SQLException {
 
        int lport=22;
        String rhost="codefest.oflameo.com";
        String host="codefest.oflameo.com";
        int rport=3306;
        String user="pratibha";
        String password="11111111";
        String dbuserName = "root";
        String dbpassword = "EK2,MA>!9Z";
        String url = "jdbc:mysql://localhost:"+lport+"/careownership";
        String driverName="com.mysql.jdbc.Driver";
        Connection conn = null;
        Session session= null;
        try{
            //Set StrictHostKeyChecking property to no to avoid UnknownHostKey issue
            java.util.Properties config = new java.util.Properties(); 
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            session=jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");
            int assinged_port=session.setPortForwardingL(lport, rhost, rport);
            System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
            System.out.println("Port Forwarded");
             
            //mysql database connectivity
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection (url, dbuserName, dbpassword);
            System.out.println ("Database connection established");
            System.out.println("DONE");
            
            /*
            stmt = conn.createStatement();
            System.out.println("stmt success!");
            sql = "select * from staff";
            rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                String first_name = rs.getString("password");
                String last_name = rs.getString("last_name");
                String SSN = rs.getString("ssn");
                String sex = rs.getString("sex");
                String age = rs.getString("age");
                String maritial_status = rs.getString("maritial_status");
                String address = rs.getString("address");
                String Zipcode = rs.getString("Zipcode");
                String highest_education_level = rs.getString("highest_education_level");
                
                System.out.println(first_name);
            }
            rs.close();
            */
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(conn != null && !conn.isClosed()){
                System.out.println("Closing Database Connection");
                conn.close();
            }
            if(session !=null && session.isConnected()){
                System.out.println("Closing SSH Connection");
                session.disconnect();
            }
        }
    }
 
}
