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
	//判斷不爲空
	public static boolean t2(String strr){
		return strr!=null && !"".equals(strr);
	}
	/*(1)	将\n\r替换成一个\n。（2分）
	(2)	将\n结尾的这行文本用<p></p>标签包起来。（6分）
	(3)	将单个\r字符使用<br/>标签替换。（2分）*/
	public static String t3(String strr){
		String replaceAll = strr.replaceAll("\\\\n\\\\r","\n");
		String replaceAll2 = replaceAll.replaceAll("\\\\n","<p></p>");
		String replaceAll3 = replaceAll2.replaceAll("\\\\r","<br>");
		return replaceAll3;
	}
	//判斷手機號
	public static boolean t4(String iphone){
		String i = "^1(3|5|7)\\d{9}$";
		boolean b = iphone.matches(i);
		return b;
		
	}
	//判斷郵箱
	public static boolean t5(String email) {
		String e = "^\\w*@\\w*.(com|cn)$";
		boolean c = email.matches(e);
		return c;
		
	}
}
