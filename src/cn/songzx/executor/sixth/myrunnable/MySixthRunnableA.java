/**   
* @Title: MySixthRunnableA.java 
* @Package cn.songzx.executor.sixth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月28日 下午7:05:50 
* @version V1.0   
*/
package cn.songzx.executor.sixth.myrunnable;

/**
 * @ClassName: MySixthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月28日 下午7:05:50
 * 
 */
public class MySixthRunnableA implements Runnable {

	private String username;

	/**
	 * @Date: 2017年11月28日下午7:06:17
	 * @Title: MySixthRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MySixthRunnableA(String username) {
		super();
		this.username = username;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @Date: 2017年11月28日下午7:05:50
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
