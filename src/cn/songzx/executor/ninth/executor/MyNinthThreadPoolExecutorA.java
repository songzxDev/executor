/**   
* @Title: MyNinthThreadPoolExecutorA.java 
* @Package cn.songzx.executor.ninth.executor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:40:41 
* @version V1.0   
*/
package cn.songzx.executor.ninth.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.ninth.myrunnable.MyNinthRunnableB;

/**
 * @ClassName: MyNinthThreadPoolExecutorA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:40:41
 * 
 */
public class MyNinthThreadPoolExecutorA extends ThreadPoolExecutor {

	/**
	 * @Date: 2017年11月29日下午8:40:52
	 * @Title: MyNinthThreadPoolExecutorA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param corePoolSize
	 * @param maximumPoolSize
	 * @param keepAliveTime
	 * @param unit
	 * @param workQueue
	 */
	public MyNinthThreadPoolExecutorA(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	/**
	 * @Date: 2017年11月29日下午8:41:34
	 * @Title: beforeExecute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param t
	 * @param r
	 * @return 返回值类型
	 */
	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		super.beforeExecute(t, r);
		System.out.println("准备执行：" + ((MyNinthRunnableB) r).getUsername());
	}

	/**
	 * @Date: 2017年11月29日下午8:41:34
	 * @Title: afterExecute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @param t
	 * @return 返回值类型
	 */
	@Override
	protected void afterExecute(Runnable r, Throwable t) {
		super.afterExecute(r, t);
		System.out.println(((MyNinthRunnableB) r).getUsername() + " 执行完了！");
	}

}
