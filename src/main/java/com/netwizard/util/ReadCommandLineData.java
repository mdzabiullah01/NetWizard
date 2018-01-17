package com.netwizard.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadCommandLineData {
	public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        try {
            Process proc = rt.exec("java -jar D:/NetWizard/NetWizard/src/main/resources/generateToken.jar --key=aa433e93870449ec9f24c5a738628a3e --appID=84df89.vidyo.io --userName=demoNaveen_12 --expiresInSecs=10000");
            InputStream inputStream = proc.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
	        StringBuffer buffer = new StringBuffer();
	        String line = null;
	        while ( (line = br.readLine()) != null) {
	            buffer.append(line);
	        }
	        String buffer1 = buffer.toString();
	        
	        String array[] = buffer1.split(":");
	        
	        for (String string : array) {
				System.out.println(string);
			}
	        
	        String tokenOBJ = array[array.length-1];
	        System.out.println(tokenOBJ.substring(26, tokenOBJ.length()));
	        
        } catch (IOException e) {
                    e.printStackTrace();
        }
 }
}
