/**
 * 
 */
package com.netwizard.util;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

	

/**
 * @author Rayulu Vemula
 *
 */
@Service
public class CommonUtils {
	
	private static Logger logger = Logger.getLogger(CommonUtils.class);
	
	public static String removeChar(String s, char c) {
		String returValue=null;
        StringBuffer buf = new StringBuffer(s.length());
        buf.setLength(s.length());
        int current = 0;
        
        for (int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(cur != c) buf.setCharAt(current++, cur);
        }
        
        if(buf.toString().contains("("))
        {
        	return	removeChar(buf.toString(),'(').trim();
        }
        else if(buf.toString().contains(")"))
        {
        	return	removeChar(buf.toString(),')').trim();
        } 
        else if(buf.toString().contains("\\"))
        {
        	return	removeChar(buf.toString(),'\\').trim();
        }
        else if(buf.toString().contains("{"))
        {
        	return	removeChar(buf.toString(),'{').trim();
        }
        else if(buf.toString().contains("}"))
        {
        	return	removeChar(buf.toString(),'}').trim();
        }
        else if(buf.toString().contains("}"))
        {
        	return	removeChar(buf.toString(),'}').trim();
        }
        else if(buf.toString().contains("?"))
        {
        	return	removeChar(buf.toString(),'?').trim();
        }
        else if(buf.toString().contains("+"))
        {
        	return	removeChar(buf.toString(),'+').trim();
        }
        else if(buf.toString().contains("["))
        {
        	return	removeChar(buf.toString(),'[').trim();
        }
        else if(buf.toString().contains("^"))
        {
        	return	removeChar(buf.toString(),'^').trim();
        }
        else if(buf.toString().contains("."))
        {
        	return	removeChar(buf.toString(),'.').trim();
        }
        
        return buf.toString().trim();
    }
 
	
	/**
	 * ---------------------------------------------------------------------
	 */
	/**
	 * Method to Encrypt given data.
	 * 
	 * @return String
	 */
	public static String encrypt(String str) {

		byte[] encodedBytes = Base64.encodeBase64(str.getBytes());

		return new String(encodedBytes);

	}
	
	/**
	 * ---------------------------------------------------------------------
	 */
	/**
	 * Method to Decrypt given data.
	 * 
	 * @param bytes
	 * @return String
	 */
	public static String decrypt(byte[] bytes) {


		byte[] decodedBytes = Base64.decodeBase64(bytes);

		return new String(decodedBytes).replaceAll("%20", " ");

	}
	
	public static void main(String args[]){
		
		
		
		System.out.println(System.currentTimeMillis());
		
		String password = encrypt("Care$123");
		String decrpassword= decrypt("Q2FyZUAxMjM=".getBytes());
		System.out.println(decrpassword);
		
	}
	
	/**
	 * 
	 * @param password
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String Md5Encrypt(String password) throws NoSuchAlgorithmException{
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
		messageDigest.update(password.getBytes(),0, password.length());  
		String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
		if (hashedPass.length() < 32) {
			hashedPass = "0" + hashedPass; 
		}
		return hashedPass;

	}
}
