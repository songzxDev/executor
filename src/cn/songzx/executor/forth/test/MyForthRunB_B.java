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

import cn.songzx.executor.forth.myrunnable.MyForthRunnableC;

/**
 * @ClassName: MyForthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:55:05
 * 
 */
public class MyForthRunB_B {

	/**
	 * @Date: 2017年11月27日下午7:55:05
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyForthRunnableC runnable = new MyForthRunnableC();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(runnable);
			pool.execute(runnable);
			pool.execute(runnable);
			pool.execute(runnable);

			pool.shutdown();

			/*
			 * awaitTermination()方法被执行时，如果线程池中有任务被执行时，则调用awaitTermination()
			 * 方法出现阻塞， 等待指定的时间，如果没有任务则不再阻塞
			 * 其作用是查看在指定的时间之间，线程池是否已经终止工作，也就是最多等待多少时间后去判断线程池是否已经终止工作，
			 * 此方法需要有shutdown()方法的配合。
			 */
			System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("C=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("D=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("E=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("F=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
			System.out.println("G=" + pool.awaitTermination(1, TimeUnit.SECONDS) + " " + System.currentTimeMillis());// awaitTermination()方法具有阻塞性
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
