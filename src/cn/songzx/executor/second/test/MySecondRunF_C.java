/**   
* @Title: MySecondRunF_A.java 
* @Package cn.songzx.executor.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月25日 下午2:28:23 
* @version V1.0   
*/
package cn.songzx.executor.second.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MySecondRunF_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月25日 下午2:28:23
 * 
 */
public class MySecondRunF_C {

	/**
	 * @Date: 2017年11月25日下午2:28:23
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * 队列使用SynchronousQueue类，并且线程数量>corePoolSize时将其余的任务放入队列中，
		 * 并且线程数量>maximumPoolSize，所以出现异常
		 * 
		 */
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " run！" + System.currentTimeMillis());
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		executor.execute(runnable);// 1
		executor.execute(runnable);// 2
		executor.execute(runnable);// 3
		executor.execute(runnable);// 4
		executor.execute(runnable);// 5
		executor.execute(runnable);// 6
		executor.execute(runnable);// 7
		executor.execute(runnable);// 8
		executor.execute(runnable);// 9
		try {
			Thread.sleep(300L);
			System.out.println("A：" + executor.getCorePoolSize());// 车中可载人的标准人数
			System.out.println("A:" + executor.getPoolSize());// 车中正在载的人数
			System.out.println("A：" + executor.getQueue().size());// 扩展车中正在载的人数
			Thread.sleep(10000L);
			System.out.println("B：" + executor.getCorePoolSize());
			System.out.println("B:" + executor.getPoolSize());
			System.out.println("B：" + executor.getQueue().size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
