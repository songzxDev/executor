/**   
* @Title: MyThirdRunnableD.java 
* @Package cn.songzx.executor.third.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午8:18:59 
* @version V1.0   
*/
package cn.songzx.executor.third.myrunnable;

/**
 * @ClassName: MyThirdRunnableD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午8:18:59
 * 
 */
public class MyThirdRunnableD implements Runnable {
	private String username;

	/**
	 * @Date: 2017年11月26日下午8:19:25
	 * @Title: MyThirdRunnableD.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MyThirdRunnableD(String username) {
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
	 * @Date: 2017年11月26日下午8:18:59
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE / 500; i++) {
			String newStringA = new String();
			String newStringB = new String();
			String newStringC = new String();
			String newStringD = new String();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println(Thread.currentThread().getName() + "任务完成！");
	}

}
