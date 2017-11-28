/**   
* @Title: MySeventhRunA.java 
* @Package cn.songzx.executor.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:29:05 
* @version V1.0   
*/
package cn.songzx.executor.seventh.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MySeventhRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:29:05
 * 
 */
public class MySeventhRunA_A {

	/**
	 * @Date: 2017年11月28日下午7:29:05
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					System.out.println("打印了！begin " + Thread.currentThread().getName());
					Thread.sleep(4000L);
					System.out.println("打印了！      end " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("线程池中的线程数A：" + executor.getPoolSize());
		// prestartAllCoreThreads())作用是启动全部核心线程，返回值是启动核心线程的数量
		System.out.println("启动核心线程数量为：" + executor.prestartAllCoreThreads());
		System.out.println("线程池中的线程数B：" + executor.getPoolSize());
	}

}
