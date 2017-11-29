/**   
* @Title: MyNinthRunF.java 
* @Package cn.songzx.executor.ninth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月29日 下午8:43:37 
* @version V1.0   
*/
package cn.songzx.executor.ninth.test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

import cn.songzx.executor.ninth.executor.MyNinthThreadPoolExecutorA;
import cn.songzx.executor.ninth.myrunnable.MyNinthRunnableB;

/** 
* @ClassName: MyNinthRunF 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Songzx songzx_2326@163.com 
* @date 2017年11月29日 下午8:43:37 
*  
*/
public class MyNinthRunF {

	/**
	 * @Date: 2017年11月29日下午8:43:37
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyNinthThreadPoolExecutorA executor = new MyNinthThreadPoolExecutorA(2,2,Integer.MAX_VALUE,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
		executor.execute(new MyNinthRunnableB("B1"));
		executor.execute(new MyNinthRunnableB("B2"));
		executor.execute(new MyNinthRunnableB("B3"));
		executor.execute(new MyNinthRunnableB("B4"));
	}

}
