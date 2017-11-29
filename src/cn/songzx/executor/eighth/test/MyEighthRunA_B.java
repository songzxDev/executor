/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.executor.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:30:32 
* @version V1.0   
*/
package cn.songzx.executor.eighth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.eighth.myrunnable.MyEighthRunnableA;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:30:32
 * 
 */
public class MyEighthRunA_B {

	/**
	 * @Date: 2017年11月29日下午7:30:32
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		// LinkedBlockingDeque使用无参构造，Max值被忽略
		LinkedBlockingDeque<Runnable> linked = new LinkedBlockingDeque<Runnable>();
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linked);
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		pool.execute(new MyEighthRunnableA());
		// 放入队列2个任务，执行3个任务，有一个任务被拒绝
		System.out.println(pool.getPoolSize() + " " + linked.size());
	}

}
