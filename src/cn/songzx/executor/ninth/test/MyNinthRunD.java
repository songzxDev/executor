/**   
* @Title: MyNinthRunD.java 
* @Package cn.songzx.executor.ninth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:20:20 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.ninth.myrunnable.MyNinthRunnableA;

/**
 * @ClassName: MyNinthRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:20:20
 * 
 */
public class MyNinthRunD {

	/**
	 * @Date: 2017年11月29日下午8:20:20
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(2);
			// DiscardOldestPolicy策略是当任务添加到线程池中被拒绝时，线程池会放弃等待队列中最旧的未处理任务，然后将被拒绝的任务添加到等待队列中
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.DiscardOldestPolicy());
			for (int i = 0; i < 5; i++) {
				MyNinthRunnableA runnable = new MyNinthRunnableA("Runnable" + (i + 1));
				executor.execute(runnable);
			}
			Thread.sleep(50L);
			Iterator iterator = queue.iterator();
			while (iterator.hasNext()) {
				Object runnable = iterator.next();
				System.out.println(((MyNinthRunnableA) runnable).getUsername());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
