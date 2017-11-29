/**   
* @Title: MyNinthRunA.java 
* @Package cn.songzx.executor.ninth 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:53:54 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.ninth.extthread.MyNinthThreadA;

/**
 * @ClassName: MyNinthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:53:54
 * 
 */
public class MyNinthRunB {

	/**
	 * @Date: 2017年11月29日下午7:53:54
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyNinthThreadA threadA = new MyNinthThreadA();
		LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
		// CallerRunsPolicy策略是当任务添加到线程池中被拒绝时，会使用线程池的Thread线程对象处理被拒绝的任务
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, deque, new ThreadPoolExecutor.CallerRunsPolicy());
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		System.out.println("ThreadA end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
	}

}
