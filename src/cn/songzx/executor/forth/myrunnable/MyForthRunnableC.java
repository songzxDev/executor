/**   
* @Title: MyForthRunnableC.java 
* @Package cn.songzx.executor.forth.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月27日 下午8:02:55 
* @version V1.0   
*/
package cn.songzx.executor.forth.myrunnable;

/** 
* @ClassName: MyForthRunnableC 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Songzx songzx_2326@163.com 
* @date 2017年11月27日 下午8:02:55 
*  
*/
public class MyForthRunnableC implements Runnable {

	/**
	 * @Date: 2017年11月27日下午8:02:55
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return  返回值类型
	 */
	@Override
	public void run() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
