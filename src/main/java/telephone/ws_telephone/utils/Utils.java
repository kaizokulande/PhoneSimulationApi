package telephone.ws_telephone.utils;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class Utils {
	
	
	public static String hashpassword(String password)throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		byte[] hashedpass = md.digest(password.getBytes(StandardCharsets.UTF_8));
		String hashedpassword = Base64.getEncoder().encodeToString(hashedpass);
		return hashedpassword;
	}
	public static String generatetoken(String password,String name)throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		String passname = password + name;
		byte[] hashedpass = md.digest(passname.getBytes(StandardCharsets.UTF_8));
		String token = Base64.getEncoder().encodeToString(hashedpass);
		return token;
	}
	
}
