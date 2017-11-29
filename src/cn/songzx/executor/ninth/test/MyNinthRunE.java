/**   
* @Title: MyNinthRunE.java 
* @Package cn.songzx.executor.ninth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:29:43 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyNinthRunE
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:29:43
 * 
 */
public class MyNinthRunE {
	public static void main(String[] args) {
		try {
			Runnable runnable = new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000L);
						System.out.println(Thread.currentThread().getName() + " run end！");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(2);
			// DiscardPolicy策略是当任务添加到线程池中被拒绝时，线程池将丢弃被拒绝的任务
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.DiscardPolicy());

			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);
			executor.execute(runnable);

			Thread.sleep(8000L);
			System.out.println(executor.getPoolSize() + " " + queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
