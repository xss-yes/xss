package com.xl.util;

/**
 * @作者 XSs
 * @最终实现效果:
 * @时间 2019年9月9日
 */
public class Demoutil {
	private Demoutil(){}
	//轉換工具類
	public static String t1(String str){
		String replaceAll = str.replaceAll("\\\\r\\\\n","<p></p>");
		String replaceAll2 = replaceAll.replaceAll("\\\\r","<br>");
		return replaceAll2;
	}
}
