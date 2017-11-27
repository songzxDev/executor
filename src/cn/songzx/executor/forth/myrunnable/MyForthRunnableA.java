/**   
* @Title: MyForthRunnableA.java 
* @Package cn.songzx.executor.forth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午7:44:42 
* @version V1.0   
*/
package cn.songzx.executor.forth.myrunnable;

/**
 * @ClassName: MyForthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月27日 下午7:44:42
 * 
 */
public class MyForthRunnableA implements Runnable {

	/**
	 * @Date: 2017年11月27日下午7:44:42
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
			Thread.sleep(2000L);
			System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
