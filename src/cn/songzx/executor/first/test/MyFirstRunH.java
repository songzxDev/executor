/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.executor.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月17日 下午8:30:04 
* @version V1.0   
*/
package cn.songzx.executor.first.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.songzx.executor.first.threadfactory.MyFirstThreadFactoryA;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月17日 下午8:30:04
 * 
 */
public class MyFirstRunH {

	/**
	 * @Date: 2017年11月17日下午8:30:04
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFirstThreadFactoryA threadFactory = new MyFirstThreadFactoryA();
		ExecutorService executorService = Executors.newSingleThreadExecutor(threadFactory);
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					System.out.println("begin 我在运行 " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
					Thread.sleep(3000L);
					System.out.println("  end 我在运行 " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
	}

}
