/**   
* @Title: MyNinthRunnableA.java 
* @Package cn.songzx.executor.ninth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:18:37 
* @version V1.0   
*/
package cn.songzx.executor.ninth.myrunnable;

/**
 * @ClassName: MyNinthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:18:37
 * 
 */
public class MyNinthRunnableB implements Runnable {

	private String username;

	/**
	 * @Date: 2017年11月29日下午8:19:02
	 * @Title: MyNinthRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MyNinthRunnableB(String username) {
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
	 * @Date: 2017年11月29日下午8:18:37
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println(" 打印了！begin " + username + " " + System.currentTimeMillis());
			Thread.sleep(5000L);
			System.out.println(" 打印了！      end " + username + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
