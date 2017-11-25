/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.executor.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月17日 下午8:30:04 
* @version V1.0   
*/
package cn.songzx.executor.first.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月17日 下午8:30:04
 * 
 */
public class MyFirstRunB {

	/**
	 * @Date: 2017年11月17日下午8:30:04
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {
				public void run() {
					System.out.println("run！");
				}
			});
		}

	}

}
