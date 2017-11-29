/**   
* @Title: MyTenthRunC.java 
* @Package cn.songzx.executor.tenth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午9:50:09 
* @version V1.0   
*/
package cn.songzx.executor.tenth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyTenthRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午9:50:09
 * 
 */
public class MyTenthRunC_B {
	public static void main(String[] args) {
		try {
			Runnable runnableA = new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName() + " begin！");
						Thread.sleep(5000L);
						System.out.println(Thread.currentThread().getName() + "   end！");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Runnable runnableB = new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName() + " begin！");
						Thread.sleep(5000L);
						System.out.println(Thread.currentThread().getName() + "   end！");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			executor.submit(runnableA);
			executor.submit(runnableB);
			System.out.println(executor.getPoolSize());
			Thread.sleep(1000L);
			executor.remove(runnableB);// 可以删除尚未执行的Runnable任务
			System.out.println(executor.getActiveCount());
			System.out.println("submit提交方式不能删除！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
