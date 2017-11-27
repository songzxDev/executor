/**   
* @Title: MyForthRunB.java 
* @Package cn.songzx.executor.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午7:55:05 
* @version V1.0   
*/
package cn.songzx.executor.forth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.forth.myrunnable.MyForthRunnableB;

/**
 * @ClassName: MyForthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:55:05
 * 
 */
public class MyForthRunB_A {

	/**
	 * @Date: 2017年11月27日下午7:55:05
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyForthRunnableB runnable = new MyForthRunnableB();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(runnable);
			pool.shutdown();

			System.out.println("Main Begin！" + System.currentTimeMillis());
			/*
			 * awaitTermination()方法被执行时，如果线程池中有任务被执行时，则调用awaitTermination()
			 * 方法出现阻塞， 等待指定的时间，如果没有任务则不再阻塞
			 */
			System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));// awaitTermination()方法具有阻塞性
			System.out.println("Main   End！" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
