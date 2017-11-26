/**   
* @Title: MyThirdRunC.java 
* @Package cn.songzx.executor.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午8:03:23 
* @version V1.0   
*/
package cn.songzx.executor.third.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.third.myrunnable.MyThirdRunnableC;

/**
 * @ClassName: MyThirdRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午8:03:23
 * 
 */
public class MyThirdRunD {

	/**
	 * @Date: 2017年11月26日下午8:03:23
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyThirdRunnableC myRunnable = new MyThirdRunnableC();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(myRunnable);
			pool.execute(myRunnable);
			pool.execute(myRunnable);
			pool.execute(myRunnable);
			Thread.sleep(1000L);
			pool.shutdownNow();
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
