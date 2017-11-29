/**   
* @Title: MyNinthThreadA.java 
* @Package cn.songzx.executor.ninth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:03:37 
* @version V1.0   
*/
package cn.songzx.executor.ninth.extthread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyNinthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:03:37
 * 
 */
public class MyNinthThreadA_A extends Thread {

	public void run() {
		MyNinthThreadA threadA = new MyNinthThreadA();
		LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
		// CallerRunsPolicy策略是当任务添加到线程池中被拒绝时，会使用线程池的Thread线程对象处理被拒绝的任务
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, deque, new ThreadPoolExecutor.CallerRunsPolicy());
		System.out.println("ThreadA_A begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		pool.execute(threadA);
		System.out.println("ThreadA_A   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		System.out.println("ThreadA_A   end " + System.currentTimeMillis());

	}
}
