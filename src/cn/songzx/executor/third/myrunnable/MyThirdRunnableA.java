/**   
* @Title: MyThirdRunnableA.java 
* @Package cn.songzx.executor.third.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月26日 下午7:49:37 
* @version V1.0   
*/
package cn.songzx.executor.third.myrunnable;

/**
 * @ClassName: MyThirdRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月26日 下午7:49:37
 * 
 */
public class MyThirdRunnableA implements Runnable {

	/**
	 * @Date: 2017年11月26日下午7:49:37
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
			Thread.sleep(4000L);
			System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
