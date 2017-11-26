/**   
* @Title: MyThirdRunnableE.java 
* @Package cn.songzx.executor.third.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午8:28:34 
* @version V1.0   
*/
package cn.songzx.executor.third.myrunnable;

/**
 * @ClassName: MyThirdRunnableE
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午8:28:34
 * 
 */
public class MyThirdRunnableE implements Runnable {
	private String username;

	/**
	 * @Date: 2017年11月26日下午8:29:10
	 * @Title: MyThirdRunnableE.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MyThirdRunnableE(String username) {
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
	 * @Date: 2017年11月26日下午8:28:34
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE / 500; i++) {
			String newString1 = new String();
			String newString2 = new String();
			String newString3 = new String();
			String newString4 = new String();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println(Thread.currentThread().getName() + "任务完成！");
	}

}
