/**   
* @Title: MyEighthRunB_A.java 
* @Package cn.songzx.executor.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:39:32 
* @version V1.0   
*/
package cn.songzx.executor.eighth.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.eighth.myrunnable.MyEighthRunnableA;

/**
 * @ClassName: MyEighthRunB_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:39:32
 * 
 */
public class MyEighthRunB_A {
	public static void main(String[] args) {
		// ArrayBlockingQueue使用带参构造，Max值被参考
		ArrayBlockingQueue<Runnable> array = new ArrayBlockingQueue<Runnable>(2);
		System.out.println(array.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, array);
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		System.out.println(pool.getPoolSize() + " " + array.size());// 放入队列2个任务，执行3个任务
	}
}
