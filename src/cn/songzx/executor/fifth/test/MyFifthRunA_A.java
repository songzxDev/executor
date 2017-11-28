/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.executor.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午6:45:35 
* @version V1.0   
*/
package cn.songzx.executor.fifth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.fifth.myrunnable.MyFifthRunnableA;
import cn.songzx.executor.fifth.mythreadfactory.MyFifthThreadFactoryA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午6:45:35
 * 
 */
public class MyFifthRunA_A {

	/**
	 * @Date: 2017年11月28日下午6:45:35
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFifthRunnableA myRunnable = new MyFifthRunnableA();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.setThreadFactory(new MyFifthThreadFactoryA());
		pool.execute(myRunnable);
	}

}
