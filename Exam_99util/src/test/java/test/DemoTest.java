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
		String t3 = Demoutil.t3("9月5日一大早，又有了新情况\n\r\r上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\n\r\r\n9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。\n\r\r\n");
		System.out.println(t3);
	}
}
