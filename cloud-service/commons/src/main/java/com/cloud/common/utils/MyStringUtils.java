package com.cloud.common.utils;

public class MyStringUtils {
	
	/**
	 * 将驼峰式转为下划线形式
	 * @param word
	 * @return
	 */
	public static String CoverLineStr(String word) {
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < word.length(); i++) { 
			char c = word.charAt(i);
			if (!Character.isLowerCase(c)){ 
				sbf.append("_");
			}
			sbf.append(c);
		}
		return sbf.toString();
	}
	
	/**
	 * 将下划线形式转为驼峰式
	 * @param word
	 * @return
	 */
	public static String CoverLowerStr(String word) {
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < word.length(); i++) { 
			char c = word.charAt(i);
			if (c=='_'){
				i++;
				sbf.append(String.valueOf(word.charAt(i)).toUpperCase());
			} else {
				sbf.append(String.valueOf(c).toLowerCase());
			}
		}
		return sbf.toString();
	}
	
}
