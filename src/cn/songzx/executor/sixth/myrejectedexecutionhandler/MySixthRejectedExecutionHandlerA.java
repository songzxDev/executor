/**   
* @Title: MySixthRejectedExecutionHandlerA.java 
* @Package cn.songzx.executor.sixth.myrejectedexecutionhandler 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:15:34 
* @version V1.0   
*/
package cn.songzx.executor.sixth.myrejectedexecutionhandler;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import cn.songzx.executor.sixth.myrunnable.MySixthRunnableA;

/**
 * @ClassName: MySixthRejectedExecutionHandlerA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:15:34
 * 
 */
public class MySixthRejectedExecutionHandlerA implements RejectedExecutionHandler {

	/**
	 * @Date: 2017年11月28日下午7:15:34
	 * @Title: rejectedExecution
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @param executor
	 * @return 返回值类型
	 */
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((MySixthRunnableA) r).getUsername() + " 被拒绝执行！");
	}

}
