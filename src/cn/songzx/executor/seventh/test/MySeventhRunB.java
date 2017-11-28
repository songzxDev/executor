/**   
* @Title: MySeventhRunB.java 
* @Package cn.songzx.executor.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:42:59 
* @version V1.0   
*/
package cn.songzx.executor.seventh.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MySeventhRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:42:59
 * 
 */
public class MySeventhRunB {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000L);
					System.out.println("打印了！" + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		try {
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			Thread.sleep(1000L);
			System.out.println(executor.getCompletedTaskCount());// 获取已执行完成的任务数目
			Thread.sleep(1000L);
			System.out.println(executor.getCompletedTaskCount());// 获取已执行完成的任务数目
			Thread.sleep(1000L);
			System.out.println(executor.getCompletedTaskCount());// 获取已执行完成的任务数目
			Thread.sleep(1000L);
			System.out.println(executor.getCompletedTaskCount());// 获取已执行完成的任务数目
			Thread.sleep(1000L);
			System.out.println(executor.getCompletedTaskCount());// 获取已执行完成的任务数目
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
