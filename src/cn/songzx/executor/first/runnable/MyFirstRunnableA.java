/**   
* @Title: MyFirstRunnableA.java 
* @Package cn.songzx.executor.first.runnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月17日 下午8:38:46 
* @version V1.0   
*/
package cn.songzx.executor.first.runnable;

/**
 * @ClassName: MyFirstRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月17日 下午8:38:46
 * 
 */
public class MyFirstRunnableA implements Runnable {

	private String username;

	/**
	 * @Date: 2017年11月17日下午8:39:16
	 * @Title: MyFirstRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MyFirstRunnableA(String username) {
		super();
		this.username = username;
	}

	/**
	 * @Date: 2017年11月17日下午8:38:46
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " username=" + username + " begin " + System.currentTimeMillis());
			Thread.sleep(2000L);
			System.out.println(Thread.currentThread().getName() + " username=" + username + "   end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
