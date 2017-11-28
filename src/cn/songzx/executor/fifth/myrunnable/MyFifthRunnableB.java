/**   
* @Title: MyFifthRunnableB.java 
* @Package cn.songzx.executor.fifth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午6:51:20 
* @version V1.0   
*/
package cn.songzx.executor.fifth.myrunnable;

/**
 * @ClassName: MyFifthRunnableB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午6:51:20
 * 
 */
public class MyFifthRunnableB implements Runnable {

	/**
	 * @Date: 2017年11月28日下午6:51:20
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
		String abc = null;
		abc.indexOf(0);
		System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
	}

}
