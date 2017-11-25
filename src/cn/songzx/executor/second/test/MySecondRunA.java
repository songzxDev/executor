/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.executor.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月25日 下午1:32:55 
* @version V1.0   
*/
package cn.songzx.executor.second.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月25日 下午1:32:55
 * 
 */
public class MySecondRunA {
	public static void main(String[] args) {
		// 获取基本属性corePoolSize和maximumPoolSize
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
		System.out.println("");
		executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
	}
}
