package telephone.ws_telephone.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;

public class Helper {
	public static Connection toConnect() throws Exception{
        Connection con=null;
        try{
        	Class.forName("org.postgresql.Driver"); 
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/telephone", "telephone", "123456");
		} catch (ClassNotFoundException e) {
			System.out.println("PostgreSQL JDBC driver not found.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
        return con;
    } 
	public static String hashpassword(String password)throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		byte[] hashedpass = md.digest(password.getBytes(StandardCharsets.UTF_8));
		String hashedpassword = Base64.getEncoder().encodeToString(hashedpass);
		return hashedpassword;
	}
}
