/**   
* @Title: MyEighthRunnableA.java 
* @Package cn.songzx.executor.eighth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午7:28:49 
* @version V1.0   
*/
package cn.songzx.executor.eighth.myrunnable;

/**
 * @ClassName: MyEighthRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午7:28:49
 * 
 */
public class MyEighthRunnableA implements Runnable {

	/**
	 * @Date: 2017年11月29日下午7:28:50
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		try {
			System.out.println("begin " + System.currentTimeMillis());
			Thread.sleep(1000L);
			System.out.println("  end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
