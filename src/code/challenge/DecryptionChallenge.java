package code.challenge;

import java.util.ArrayList;
import java.util.List;

public class DecryptionChallenge {

	public static void main(String[] args) {
		
		String str = "world hel2o";
		String str0 = "hel2o";
		String str1 = "ba3";
		String str2 = "mis2is2ip2i";
		String str3 = "seaside the to sent be to ne2ds army ten of team a";
		System.out.println(decrypt(str3));
		

	}
	
	public static String decrypt(String s) {
		
		String numStr = "0123456789";
		
		String [] strArr = s.split(" ");
		List<String> list = new ArrayList<String>();
				
		for(int i = 0; i < strArr.length; i++) {
			String decryptStr = "";
			String decryptSubStr = "";
			for(int j = 0; j < strArr[i].length(); j++) {
				String subArr = strArr[i];
				if(numStr.indexOf(subArr.charAt(j)) != -1) {
					int multiplier = Integer.parseInt(subArr.charAt(j) + "");
					for(int k = 0; k < multiplier-1; k++) {
						decryptSubStr = decryptSubStr + subArr.charAt(j - 1);
					}
					decryptStr = decryptStr + decryptSubStr;
					if(decryptStr.length() > subArr.length() - 1) {
						break;
						
					}
					decryptSubStr = "";
					j = j + (multiplier - 1);
				}
				decryptStr = decryptStr + subArr.charAt(j);
			}
			list.add(decryptStr);
		}
		
		String decryptStrResult = "";
		for(int i = list.size() - 1; i >= 0; i--) {
			decryptStrResult = decryptStrResult + list.get(i) + " ";
		}
		String decryptFinal = decryptStrResult.trim();
		return decryptFinal;
	}

}
