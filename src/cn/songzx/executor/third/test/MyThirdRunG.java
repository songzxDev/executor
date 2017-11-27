/**   
* @Title: MyThirdRunG.java 
* @Package cn.songzx.executor.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午7:24:00 
* @version V1.0   
*/
package cn.songzx.executor.third.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyThirdRunG
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:24:00
 * 
 */
public class MyThirdRunG {

	/**
	 * @Date: 2017年11月27日下午7:24:01
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
					Thread.sleep(1000L);
					System.out.println("打印了！      end " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(runnable);
		System.out.println("A=" + executor.isShutdown());
		executor.shutdown();
		System.out.println("B=" + executor.isShutdown());// 只要调用了shutdown()方法，isShutdown()方法返回值就是true
	}

}
