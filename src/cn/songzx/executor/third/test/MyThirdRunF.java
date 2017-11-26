/**   
* @Title: MyThirdRunF.java 
* @Package cn.songzx.executor.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午8:31:55 
* @version V1.0   
*/
package cn.songzx.executor.third.test;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.third.myrunnable.MyThirdRunnableE;

/**
 * @ClassName: MyThirdRunF
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午8:31:55
 * 
 */
public class MyThirdRunF {

	/**
	 * @Date: 2017年11月26日下午8:31:55
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyThirdRunnableE a1 = new MyThirdRunnableE("A1");
			MyThirdRunnableE a2 = new MyThirdRunnableE("A2");
			MyThirdRunnableE a3 = new MyThirdRunnableE("A3");
			MyThirdRunnableE a4 = new MyThirdRunnableE("A4");
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			pool.execute(a1);
			pool.execute(a2);
			pool.execute(a3);
			pool.execute(a4);
			Thread.sleep(1000L);
			// shutdownNow()方法调用后，队列中的任务被取消运行，方法shutdownNow()的返回值是List<Runnable>，List对象存储的是被取消的任务。
			List<Runnable> list = pool.shutdownNow();
			for (int i = 0; i < list.size(); i++) {
				MyThirdRunnableE myRunnable = (MyThirdRunnableE) list.get(i);
				System.out.println(myRunnable.getUsername() + " 任务被取消！");
			}
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
