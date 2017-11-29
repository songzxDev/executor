/**   
* @Title: MyNinthRunA.java 
* @Package cn.songzx.executor.ninth 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:53:54 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyNinthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:53:54
 * 
 */
public class MyNinthRunA {

	/**
	 * @Date: 2017年11月29日下午7:53:54
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
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
		// AbortPolicy：当任务添加到线程池中被拒绝时，抛出RejectedExecutionException异常
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), new ThreadPoolExecutor.AbortPolicy());
		executor.execute(runnable);// 不报错
		executor.execute(runnable);// 不报错
		executor.execute(runnable);// 不报错
		executor.execute(runnable);// 不报错
		executor.execute(runnable);// 不报错
		executor.execute(runnable);// 报错
	}

}
