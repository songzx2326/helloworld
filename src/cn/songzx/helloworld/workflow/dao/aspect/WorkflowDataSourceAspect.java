/**
* @Title: DataSourceAspect.java
* @Package cn.songzx.helloworld.workflow.dao.aspect
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Songzx songzx_2326@163.com
* @date 2017��10��19�� ����5:14:23
* @version V1.0
*/
package cn.songzx.helloworld.workflow.dao.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

import cn.songzx.helloworld.workflow.dao.holder.DataSourceContextHolder;

/**
 * @ClassName: WorkflowDataSourceAspect
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��19�� ����5:14:23
 *
 */
@Component
public class WorkflowDataSourceAspect {

	public void setBpmDataSource(JoinPoint jp) {
		DataSourceContextHolder.setCustomerType("activitiDataSourceVXviii");
	}

	public void setBizDataSource(JoinPoint jp) {
		DataSourceContextHolder.setCustomerType("bizDataSource");
	}

}
