/**
* @Title: WorkflowBizI.java
* @Package cn.songzx.helloworld.workflow.biz
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Songzx songzx_2326@163.com
* @date 2017��10��19�� ����9:42:22
* @version V1.0
*/
package cn.songzx.helloworld.workflow.biz;

import java.util.List;

import cn.songzx.helloworld.workflow.pagemodel.WorkflowTask;

/**
 * @ClassName: WorkflowBizI
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��19�� ����9:42:22
 *
 */
public interface WorkflowBizI {

	/**
	 *
	 * @Date: 2017��10��19������9:54:01
	 * @Title: startProcessInstanceByKey
	 * @Description: TODO(�������̶����key��������ʵ��)
	 * @param processKey
	 * @throws Exception
	 * @return void ����ֵ����
	 */
	public void startProcessInstanceByKey(String processDefinitionKey) throws Exception;

	/**
	 *
	 * @Date: 2017��10��19������10:00:44
	 * @Title: completeTask
	 * @Description: TODO(����taskId�ύ��������)
	 * @param taskId
	 * @throws Exception
	 * @return void ����ֵ����
	 */
	public void completeTask(String taskId) throws Exception;

	/**
	 *
	 * @Date: 2017��10��19������10:56:04
	 * @Title: getTasksById
	 * @Description: TODO(����taskId��ȡ���������б�)
	 * @param taskId
	 * @return
	 * @throws Exception
	 * @return List<WorkflowTask> ����ֵ����
	 */
	public List<WorkflowTask> getTasksById(String taskId) throws Exception;
}
