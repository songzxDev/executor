/**   
* @Title: MyNinthRunC.java 
* @Package cn.songzx.executor.ninth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:15:49 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import cn.songzx.executor.ninth.extthread.MyNinthThreadA_A;

/**
 * @ClassName: MyNinthRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月29日 下午8:15:49
 * 
 */
public class MyNinthRunC {
	public static void main(String[] args) {
		MyNinthThreadA_A threadA_A = new MyNinthThreadA_A();
		threadA_A.setName("AA");
		threadA_A.start();
		System.out.println("Main End！");
	}
}
