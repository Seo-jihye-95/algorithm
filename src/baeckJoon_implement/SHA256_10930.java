package baeckJoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256_10930 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String ms = br.readLine();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.update(ms.getBytes());
			byte[] byteData = digest.digest();
	
			for(int i=0; i<byteData.length; i++) {
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
			}

			System.out.println(sb.toString());
		
		} catch(NoSuchAlgorithmException e){
			e.printStackTrace(); 
			ms = null; 
		}
		
	}
}
