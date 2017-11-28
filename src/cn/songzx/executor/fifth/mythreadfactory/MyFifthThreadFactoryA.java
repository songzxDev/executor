/**   
* @Title: MyFifthThreadFactoryA.java 
* @Package cn.songzx.executor.fifth.mythreadfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午6:44:14 
* @version V1.0   
*/
package cn.songzx.executor.fifth.mythreadfactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * @ClassName: MyFifthThreadFactoryA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午6:44:14
 * 
 */
public class MyFifthThreadFactoryA implements ThreadFactory {

	/**
	 * @Date: 2017年11月28日下午6:44:14
	 * @Title: newThread
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @return
	 * @return 返回值类型
	 */
	@Override
	public Thread newThread(Runnable r) {
		Thread newThread = new Thread(r);
		newThread.setName("宋桢熙：" + new Date());
		return newThread;
	}

}
