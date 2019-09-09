package test;

import org.junit.Test;

import com.xl.util.Demoutil;

/**
 * @作者 XSs
 * @最终实现效果: 測試的
 * @时间 2019年9月9日
 */
public class DemoTest {
	@Test
	public void test1(){
		String t1 = Demoutil.t1("你好\r\n我好\r");
		System.out.println(t1);
	}
}
