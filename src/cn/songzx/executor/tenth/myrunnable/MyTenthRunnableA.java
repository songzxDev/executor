/**   
* @Title: MyTenthRunnableA.java 
* @Package cn.songzx.executor.tenth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:50:57 
* @version V1.0   
*/
package cn.songzx.executor.tenth.myrunnable;

/**
 * @ClassName: MyTenthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:50:57
 * 
 */
public class MyTenthRunnableA implements Runnable {

	private String username;

	/**
	 * @Date: 2017年11月29日下午8:51:18
	 * @Title: MyTenthRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MyTenthRunnableA(String username) {
		super();
		this.username = username;
	}

	/**
	 * @Date: 2017年11月29日下午8:50:57
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println(username);
	}

}
