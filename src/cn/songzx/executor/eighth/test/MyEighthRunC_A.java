/**   
* @Title: MyEighthRunC_A.java 
* @Package cn.songzx.executor.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:45:58 
* @version V1.0   
*/
package cn.songzx.executor.eighth.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.eighth.myrunnable.MyEighthRunnableA;

/**
 * @ClassName: MyEighthRunC_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:45:58
 * 
 */
public class MyEighthRunC_A {

	/**
	 * @Date: 2017年11月29日下午7:45:58
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		SynchronousQueue<Runnable> linked = new SynchronousQueue<Runnable>();
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linked);
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		System.out.println(pool.getPoolSize() + " " + linked.size());// 直接执行3个任务
	}

}
