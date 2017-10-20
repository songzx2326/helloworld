/**
* @Title: DataSourceContextHolder.java
* @Package cn.songzx.helloworld.workflow.dao.holder
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Songzx songzx_2326@163.com
* @date 2017��10��19�� ����4:56:03
* @version V1.0
*/
package cn.songzx.helloworld.workflow.dao.holder;

/**
 * @ClassName: DataSourceContextHolder
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��19�� ����4:56:03
 *
 */
public class DataSourceContextHolder {
	/**
	 * ע�⣺����Դ��ʶ�������̱߳����У�������̲߳�������Դʱ�������
	 */
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customerType) {
		contextHolder.set(customerType);
	}

	public static String getCustomerType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}
}
