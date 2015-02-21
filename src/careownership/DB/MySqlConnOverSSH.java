package careownership.DB;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.sql.Connection;

public class MySqlConnOverSSH {

	Connection conn = null;
    Session session= null;
	
	public Connection openConnection() throws JSchException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
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
            
		return conn;
	}
	
	public void closeConnection() throws SQLException
	{
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
