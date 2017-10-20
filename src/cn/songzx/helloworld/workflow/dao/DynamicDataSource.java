/**
* @Title: DynamicDataSource.java
* @Package cn.songzx.helloworld.workflow.dao
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Songzx songzx_2326@163.com
* @date 2017��10��19�� ����4:54:06
* @version V1.0
*/
package cn.songzx.helloworld.workflow.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import cn.songzx.helloworld.workflow.dao.holder.DataSourceContextHolder;

/**
 * @ClassName: DynamicDataSource
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��19�� ����4:54:06
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	/**
	 * @Date: 2017��10��19������4:54:06
	 * @Title: determineCurrentLookupKey
	 * @Description: TODO(������һ�仰�����������������)
	 * @return
	 * @return ����ֵ����
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getCustomerType();
	}

}
