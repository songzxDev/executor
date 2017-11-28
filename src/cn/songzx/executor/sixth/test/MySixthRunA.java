/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.executor.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:07:55 
* @version V1.0   
*/
package cn.songzx.executor.sixth.test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.sixth.myrunnable.MySixthRunnableA;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:07:55
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017年11月28日下午7:07:55
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MySixthRunnableA runnableA = new MySixthRunnableA("中国A！");
		MySixthRunnableA runnableB = new MySixthRunnableA("中国B！");
		MySixthRunnableA runnableC = new MySixthRunnableA("中国C！");
		MySixthRunnableA runnableD = new MySixthRunnableA("中国D！");
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 9999L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		pool.execute(runnableA);
		pool.execute(runnableB);
		pool.execute(runnableC);
		pool.execute(runnableD);
	}

}
