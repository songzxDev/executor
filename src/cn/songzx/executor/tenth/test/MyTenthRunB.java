/**   
* @Title: MyTenthRunB.java 
* @Package cn.songzx.executor.tenth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午9:39:47 
* @version V1.0   
*/
package cn.songzx.executor.tenth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyTenthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午9:39:47
 * 
 */
public class MyTenthRunB {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		for (int i = 0; i < 10; i++) {
			executor.execute(runnable);
		}
		System.out.println("activeCount=" + executor.getActiveCount());// 取得有多少个线程正在执行任务
		System.out.println("线程池中有：" + executor.getPoolSize() + "个线程！");// 取得池中有多少个线程
		System.out.println("有：" + executor.getTaskCount() + "任务发送给了线程池！");// getTaskCount()方法作用是取得有多少个任务发送给了线程池
		System.out.println("maximumPoolSize=" + executor.getMaximumPoolSize());
		System.out.println("corePoolSize=" + executor.getCorePoolSize());
		System.out.println("completedTaskCount=" + executor.getCompletedTaskCount());// 取得有多少个线程已经执行完成了
	}
}
