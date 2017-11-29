/**   
* @Title: MyNinthThreadA.java 
* @Package cn.songzx.executor.ninth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:03:37 
* @version V1.0   
*/
package cn.songzx.executor.ninth.extthread;

/**
 * @ClassName: MyNinthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:03:37
 * 
 */
public class MyNinthThreadA extends Thread {

	public void run() {
		try {
			Thread.sleep(5000L);
			System.out.println(" end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
