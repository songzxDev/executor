/**   
* @Title: MyTenthRunA.java 
* @Package cn.songzx.executor.tenth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:52:02 
* @version V1.0   
*/
package cn.songzx.executor.tenth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.tenth.myrunnable.MyTenthRunnableA;

/**
 * @ClassName: MyTenthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:52:02
 * 
 */
public class MyTenthRunA {

	/**
	 * @Date: 2017年11月29日下午8:52:02
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		for (int i = 0; i < 50; i++) {
			MyTenthRunnableA myRunnable = new MyTenthRunnableA("username" + (i + 1));
			// 接口Runnable在ThreadPoolExecutor的队列中是按照顺序取出的，执行却是乱序的
			executor.execute(myRunnable);
		}
	}

}
