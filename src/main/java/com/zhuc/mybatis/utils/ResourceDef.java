/**
 * 
 */
package com.zhuc.mybatis.utils;

/**
 * 
 * @title 		
 * @description	定义所有的常量资源类
 * @usage		
 * @copyright	Copyright 2011  SHCMCT Corporation. All rights reserved.
 * @company		上海中移通信技术工程有限公司
 * @author		John.Yao
 * @create		2012-11-15 上午10:55:49
 */
public interface ResourceDef {

	//异常提示信息
	String EXCEPTION_ERROR_MESSAGE = "服务器处理异常，请稍后再试！";
	//操作成功
	String OPERATE_STATUS_CODE_SUCCESS = "200";
	//操作失败
	String OPERATE_STATUS_CODE_ERROR = "300";
	//重新登录
	String OPERATE_STATUS_CODE_UNAUTH = "403";
	//关闭当前tab
	String RESPONSE_CALLBACKTYPE_ACTION = "closeCurrent";

	/**********************************分页参数定义************************************/
	/**
	 * 定义每页显示的记录数
	 */
	int PAGE_SIZE = 20;

	/**
	 * 排序--升序
	 */
	String PAGE_SORT_TYPE_ASC = "ASC";
	/**
	 * 排序--降序
	 */
	String PAGE_SORT_TYPE_DESC = "DESC";

	/**
	 * 页面查询字段前缀
	 */
	String PAGE_QUERY_PARAM_PREFIX = "search_";

	//默认成功操作返回信息
	String DEFAULT_MESSAGE_SUCCESS = "当前操作已成功!";

	//默认操作失败返回信息
	String DEFAULT_MESSAGE_ERROR = "当前操作失败!";

	//未登录或者会话已经失效
	String DEFAULT_MESSAGE_UNAUTH = "当前操作失败!";

	//转专业
	String CONTYPE_TYPEONE = "转专业";

	//留级
	String CONTYPE_TYPETWO = "留级";

	//复学
	String CONTYPE_TYPETHREE = "复学";

	String JT_USER = "集团用户";

	String GR_USER = "个人用户";

	/**
	 * 管理员角色名称
	 */
	String ROLE_SUPER = "超级管理员";

	String ROLE_FENKONG = "分控管理员";

	String ROLE_FLEET = "车队管理员";

	String ROLE_USER = "普通用户";

	String ADMIN_ID = "-1";

	// ------------------------------------------------------------
	/**
	 * 离线类型-正常判定离线-1
	 */
	Integer TYPE_DOWNLINE_1 = 1;

	/**
	 * 离线类型-tcp断开离线-2
	 */
	Integer TYPE_DOWNLINE_2 = 2;

	/**
	 * 全局状态-在线-1
	 */
	Integer GLOBAL_STATUS_1 = 1;
	String GLOBAL_STATUS_1_INFO = "在线";

	/**
	 * 全局状态-未使用-2
	 */
	Integer GLOBAL_STATUS_2 = 2;
	String GLOBAL_STATUS_2_INFO = "未使用";

	/**
	 * 休眠-是
	 */
	Integer XIUMIAN_1 = 1;

	/**
	 * 休眠-否
	 */
	Integer XIUMIAN_0 = 0;

	/**
	 * 全局状态-离线-4
	 */
	Integer GLOBAL_STATUS_4 = 4;
	String GLOBAL_STATUS_4_INFO = "离线";

	// ------------------------------------------------------------

    /**
     * 通知公告-阅读状态-已读
     */
    Integer ANNOUNCEMENT_STATUS_READ = 1;
    String ANNOUNCEMENT_STATUS_READ_STR = "已读";
    /**
     * 通知公告-阅读状态-未读
     */
    Integer ANNOUNCEMENT_STATUS_NOT_READ = 0;
    String ANNOUNCEMENT_STATUS_NOT_READ_STR = "未读";

	// ------------------------------------------------------------
	String ONLINE_STATUS_1 = "在线";
	String ONLINE_STATUS_2 = "未使用";
	String ONLINE_STATUS_4 = "离线";

	// ------------------------指令日志功能名称-----------------------------

	String FUNCTION_POSITION = "下发定位";
	String FUNCTION_SET_DEFENCE = "设防";
	String FUNCTION_DEL_DEFENCE = "撤防";
	String FUNCTION_GET_PARAM = "查询参数";
	String FUNCTION_SET_PARAM = "设置参数";
	String FUNCTION_REMOTE_CONTROL = "远程控制";
	String FUNCTION_REMOTE_SMS = "远程短信";
	String FUNCTION_REMOTE_BATCH_SET_PARAM = "批量设置";
	String FUNCTION_REBOOT = "重启终端";

	// ------------------------操作日志功能名称-----------------------------
	String FUNCTION_MODIFY_PASSWD = "修改密码";
	String FUNCTION_ADD_FENCE = "添加电子围栏";
	String FUNCTION_MODIFY_FENCE = "修改电子围栏";
	String FUNCTION_DELETE_FENCE = "删除电子围栏";
	String FUNCTION_RELIEVE_ALARM = "解除报警";
	String FUNCTION_RELIEVE_ALL = "解除全部报警";
	String FUNCTION_MODIFY_FLEET = "修改车队";
	String FUNCTION_MODIFY_BICYCLE = "修改车辆";
	String FUNCTION_ADD_FLEET = "添加车队";
	String FUNCTION_DEL_FLEET = "删除车队";
	String FUNCTION_HUABO = "划拨";
	String FUNCTION_GROUP_HUABO = "批量划拨";
	String FUNCTION_STOLEN_STOLEN = "失窃";
	String FUNCTION_STOLEN_CANCEL = "消警";

	// ------------------------操作日志主体名称-----------------------------
	String SUBJECT_USERNAME = "用户名";
	String SUBJECT_DEVICENO = "设备号";
	String SUBJECT_FLEET = "车队账号";

	// ------------------------手机端通讯-----------------------------
	// 手机端通讯结果--成功
	int COMMUNICATION_CLIENT_RESULT_SUCCESS = 100;

	// 手机端通讯结果--失败
	int COMMUNICATION_CLIENT_RESULT_FAIL = 101;

	String COMMUNICATION_TEXT_LOGIN_ERROR = "用户名或者密码错误!";

	String COMMUNICATION_TEXT_LOGIN_SUCCESS = "登录成功！";

	String COMMUNICATION_TEXT_BICYCLELIST_SUCCESS = "获取车辆列表成功！";

	String COMMUNICATION_TEXT_BICYCLELIST_ERROR = "获取车辆列表失败!";

	String COMMUNICATION_TEXT_BICYCLE_SUCCESS = "获取车辆成功！";

	String COMMUNICATION_TEXT_BICYCLE_ERROR = "获取车辆失败!";

	String COMMUNICATION_TEXT_HISTORY_SUCCESS = "获取历史记录成功！";

	String COMMUNICATION_TEXT_HISTORY_ERROR = "获取历史记录失败!";

	String COMMUNICATION_TEXT_HISTORY_NULL = "历史记录为空!";

	String COMMUNICATION_TEXT_LAST_LOCATION_SUCCESS = "获取当前位置成功！";

	String COMMUNICATION_TEXT_LAST_LOCATION_ERROR = "获取当前位置失败!";

	String COMMUNICATION_TEXT_DEVICE_OUTLINE_ERROR = "设备离线!";

	String COMMUNICATION_TEXT_DEVICENO_NULL = "设备号为空!";

	String COMMUNICATION_TEXT_USERNAME_NULL = "用户名为空!";

	String COMMUNICATION_TEXT_BICYCLEID_NULL = "车辆id为空!";

	String COMMUNICATION_TEXT_PARAM_NULL = "参数为空!";
}
