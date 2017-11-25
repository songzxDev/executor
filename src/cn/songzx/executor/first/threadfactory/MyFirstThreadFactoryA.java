/**   
* @Title: MyFirstThreadFactoryA.java 
* @Package cn.songzx.executor.first.threadfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月17日 下午8:48:03 
* @version V1.0   
*/
package cn.songzx.executor.first.threadfactory;

import java.util.concurrent.ThreadFactory;

/**
 * @ClassName: MyFirstThreadFactoryA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月17日 下午8:48:03
 * 
 */
public class MyFirstThreadFactoryA implements ThreadFactory {

	/**
	 * @Date: 2017年11月17日下午8:48:03
	 * @Title: newThread
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @return
	 * @return 返回值类型
	 */
	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("定制池中的线程对象的名称：" + Math.random());
		return thread;
	}

}
