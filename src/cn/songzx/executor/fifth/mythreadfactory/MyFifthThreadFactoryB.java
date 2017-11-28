/**   
* @Title: MyFifthThreadFactoryB.java 
* @Package cn.songzx.executor.fifth.mythreadfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午6:55:16 
* @version V1.0   
*/
package cn.songzx.executor.fifth.mythreadfactory;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * @ClassName: MyFifthThreadFactoryB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午6:55:16
 * 
 */
public class MyFifthThreadFactoryB implements ThreadFactory {

	/**
	 * @Date: 2017年11月28日下午6:55:16
	 * @Title: newThread
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @return
	 * @return 返回值类型
	 */
	@Override
	public Thread newThread(Runnable r) {
		Thread newThread = new Thread(r);
		newThread.setName("我的新名称：" + new Date());
		newThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("自定义处理异常启用：" + t.getName() + " " + e.getMessage());
				e.printStackTrace();
			}

		});
		return newThread;
	}

}
