/**   
* @Title: MyThirdRunE.java 
* @Package cn.songzx.executor.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午8:22:44 
* @version V1.0   
*/
package cn.songzx.executor.third.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.third.myrunnable.MyThirdRunnableD;

/**
 * @ClassName: MyThirdRunE
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午8:22:44
 * 
 */
public class MyThirdRunE {

	/**
	 * @Date: 2017年11月26日下午8:22:44
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyThirdRunnableD a1 = new MyThirdRunnableD("A1");
			MyThirdRunnableD a2 = new MyThirdRunnableD("A2");
			MyThirdRunnableD a3 = new MyThirdRunnableD("A3");
			MyThirdRunnableD a4 = new MyThirdRunnableD("A4");

			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(a1);
			pool.execute(a2);
			pool.execute(a3);
			pool.execute(a4);

			Thread.sleep(1000L);
			// 调用shutdown()方法后，正在执行的任务和队列中的任务在后期正常执行
			pool.shutdown();
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
