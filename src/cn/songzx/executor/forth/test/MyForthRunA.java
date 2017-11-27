/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.executor.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午7:46:50 
* @version V1.0   
*/
package cn.songzx.executor.forth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.forth.myrunnable.MyForthRunnableA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:46:50
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017年11月27日下午7:46:50
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyForthRunnableA runnable = new MyForthRunnableA();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 99999, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(runnable);
			pool.execute(runnable);
			pool.execute(runnable);
			pool.execute(runnable);

			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
			pool.shutdown();
			Thread.sleep(1000L);
			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
			Thread.sleep(1000L);
			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
			Thread.sleep(1000L);
			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
			Thread.sleep(1000L);
			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
			Thread.sleep(1000L);
			System.out.println("门是否正在关闭：" + pool.isTerminating() + " ，门是否已经关闭：" + pool.isTerminated());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
