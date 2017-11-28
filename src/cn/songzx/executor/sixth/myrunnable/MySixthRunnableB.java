/**   
* @Title: MySixthRunnableB.java 
* @Package cn.songzx.executor.sixth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:19:34 
* @version V1.0   
*/
package cn.songzx.executor.sixth.myrunnable;

/**
 * @ClassName: MySixthRunnableB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:19:34
 * 
 */
public class MySixthRunnableB implements Runnable {

	/**
	 * @Date: 2017年11月28日下午7:19:34
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
	}

}
