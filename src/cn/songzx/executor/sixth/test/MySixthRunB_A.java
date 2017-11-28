/**   
* @Title: MySixthRunB_A.java 
* @Package cn.songzx.executor.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:20:50 
* @version V1.0   
*/
package cn.songzx.executor.sixth.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.sixth.myrunnable.MySixthRunnableB;

/**
 * @ClassName: MySixthRunB_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:20:50
 * 
 */
public class MySixthRunB_A {

	/**
	 * @Date: 2017年11月28日下午7:20:50
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
			System.out.println(pool.allowsCoreThreadTimeOut());
			for (int i = 0; i < 4; i++) {
				MySixthRunnableB runnable = new MySixthRunnableB();
				pool.execute(runnable);
			}
			Thread.sleep(8000L);
			System.out.println(pool.getPoolSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
