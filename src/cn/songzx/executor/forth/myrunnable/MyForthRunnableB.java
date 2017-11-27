/**   
* @Title: MyRunnableB.java 
* @Package cn.songzx.executor.forth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午7:53:30 
* @version V1.0   
*/
package cn.songzx.executor.forth.myrunnable;

/**
 * @ClassName: MyRunnableB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:53:30
 * 
 */
public class MyForthRunnableB implements Runnable {

	/**
	 * @Date: 2017年11月27日下午7:53:30
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
			Thread.sleep(4000L);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
