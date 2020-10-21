package com.data;


/**
 * @author: wangkangxi
 * @description: 状态码
 * @create: 2019/8/22 21:08
 **/
public class StatusCode {
    public static final int SUCCESS_CODE = 2000;
    public static final String SUCCESS_MSG = "操作成功";

    public static final int FAILURE_CODE = 2100;
    public static final String FAILURE_MSG = "操作失败";

    public static final int FAILURE_SYSTEM_CODE = 2101;
    public static final String FAILURE_SYSTEM_MSG = "系统异常";

    public static final int TOKEN_ERROR_CODE = 2102;
    public static final String TOKEN_ERROR_MSG = "access_token错误";

    public static final int OPENID_ERROR_CODE = 2103;
    public static final String OPENID_ERROR_MSG = "openid错误";

    /**
     * 网关调用其他服务触发
     */
    public static final int GATEWAY_ERROR_CODE = 2104;
    public static final String GATEWAY_ERROR_MSG = "网关调用其他服务失败";


    public static final int USER_ERROR_CODE = 2105;
    public static final String USER_ERROR_MSG = "用户不存在";

    /**
     * 微服务调用触发
     */
    public static final int SERVICE_ERROR_CODE = 2106;
    public static final String SERVICE_ERROR_MSG = "微服务调用失败";

    /**
     * 赠送样本提示
     */
    public static final int SAMPLE_FREE_ERROR_CODE=2110;

    public static final String SAMPLE_FREE_ERROR_MSG="本编号为免费检测的赠品编号，您登陆本系统的手机号已经绑定过该类型的编号，请更换其他手机号(更换其他微信)进行绑定，如有疑问请咨询400-163-5588，感谢您的合作。";


    //下面为业务状态码
    /**
     * 订单不存在
     */
    public static final int ORDER_NOT_EXIST_CODE=3100;
    public static final String ORDER_NOT_EXIST_MSG="订单不存在";



    /**
     * 订单失效
     */
    public static final int ORDER_INVALID_CODE=3101;
    public static final String ORDER_INVALID_MSG="订单已失效";


    /**
     * 获取微信token失败
     */
    public static final int WX_TOKEN_ERROR_CODE=3110;
    public static final String WX_TOKEN_ERROR_MSG="微信授权token失败";


    /**
     * 获取微信ticket失败
     */
    public static final int WX_TICKET_ERROR_CODE=3111;
    public static final String WX_TICKET_ERROR_MSG="微信授权ticket失败";


    /**
     * 活动不存在
     */
    public static final int ACTIVITY_NOT_EXIST_CODE=3120;
    public static final String ACTIVITY_NOT_EXIST_MSG="活动不存在";

    /**
     * 商品不存在
     */
    public static final int GOOD_NOT_EXIST_CODE=3121;
    public static final String GOOD_NOT_EXIST_MSG="商品不存在";
    /**
     * 用户名重复
     */
    public static final int USERNAME_REPETITION_CODE = 3130;
    public static final String USERNAME_REPETITION_MSG = "用户名重复";
    /**
     * 产品线不存在
     */
    public static final int PRODUCT_NOT_EXIST_CODE = 3131;
    public static final String PRODUCT_NOT_EXIST_MSG = "产品线不存在";
    /**
     * 单项不存在
     */
    public static final int ITEM_NOT_EXIST_CODE = 3132;
    public static final String ITEM_NOT_EXIST_MSG = "单项不存在";

    /**
     * 短信验证码失败
     */
    public static final int AUTHCODE_ERROR_CODE=3112;
    public static final String AUTHCODE_ERROR_MSG="短信验证码失败";


    /**
     * 样本不存在
     */
    public static final int SAMPLE_ERROR_CODE=3113;
    public static final String SAMPLE_ERROR_MSG="条形码样本不存在,请重新扫描";


    /**
     * 样本已绑定
     */
    public static final int SAMPLE_BINDING_ERROR_CODE=3114;
    public static final String SAMPLE_BINDING_ERROR_MSG="样本条形码已经绑定";

    /**
     *参数错误
     */
    public static final int PARAMETER_ERROR_CODE=3115;
    public static final String PARAMETER_ERROR_MSG="参数错误";

    /**
     * 短信发送失败
     */
    public static final int SMS_ERROR_CODE=3116;
    public static final String SMS_ERROR_MSG="短信发送失败";


    /**
     * 添加条形码已经存在错误
     */
    public static final int BARCODE_EXIST_ERROR_CODE=3117;
    public static final String BARCODE_EXIST_ERROR_MSG="条形码已经存在";


    /**
     * 非检测中状态样本不可变更为不合格
     */
    public static final int SAMPLE_UN_QUALIFIED_ERROR_CODE=3118;
    public static final String SAMPLE_UN_QUALIFIED_ERROR_MSG="当前状态样本不可以变更为不合格";

    /**
     * 样本不是已绑定状态，状态异常，不可进行回寄操作
     */
    public static final int SAMPLE_NOT_BINDING_OK_CODE=3119;
    public static final String SAMPLE_NOT_BINDING_OK_ERROR_MSG="样本状态异常，不可进行回寄操作";


    public static final int REPORT_NO_PERMISSION_CODE=3200;
    public static final String REPORT_NO_PERMISSION_ERROR_MSG="报告没有权限";

    public static final int REPORT_UPLOAD_NOT_EXIST_CODE=3201;
    public static final String REPORT_UPLOAD_NOT_EXIST_ERROR_MSG="报告数据上传状态不存在";


    /**
     * 客服不存在
     */
    public static final int CS_NOT_EXIST_CODE = 3202;
    public static final String CS_NOT_EXIST_MSG = "客服不存在";


    /**
     * 顾问不存在
     */
    public static final int CONSULTANT_NOT_EXIST_CODE = 3203;
    public static final String CONSULTANT_NOT_EXIST_MSG = "客服不存在";

    /**
     * 问卷调查活动结束
     */
    public static final int QUESTIONNAIRE_END_CODE = 3204;
    public static final String QUESTIONNAIRE_END_MSG = "抱歉，活动已经结束。如有疑问请致电400-163-5588。请您长按二维码关注”壹基因“ 公众号，了解最新基因健康资讯。";


    /**
     * 验证码错误
     */
    public static final int VERIFY_ERROR_CODE = 3205;
    public static final String VERIFY_ERROR_MSG = "验证码错误";

    /**
     * 问卷调查手机号重复
     */
    public static final int QUESTIONNAIRE_PHONE_REPEAT_CODE = 3206;
    public static final String QUESTIONNAIRE_PHONE_REPEAT_MSG = "该手机号已经申请过了,请不要重复申请";

    /**
     * 验证码错误
     */
    public static final int QUESTIONNAIRE_NOT_EXIST_CODE = 3207;
    public static final String QUESTIONNAIRE_NOT_EXIST_MSG = "问卷不存在";


    /**
     * 实验室编号不存在
     */
    public static final int SAMPLE_LABORATORY_NO_NOT_EXIST_CODE=3208;
    public static final String SAMPLE_LABORATORY_NO_NOT_EXIST_MSG = "实验室编号不存在";


    public static final int PACKAGE_HAS_SAMPLE_CODE = 3209;
    public static final String PACKAGE_HAS_SAMPLE_MSG = "该套餐已创建过样本";

    public static final int CHANNELNO_EXIST_CODE = 3210;
    public static final String CHANNELNO_EXIST_MSG = "渠道编号已经存在";

    public static final int SAMPLE_STATE_ERROR_CODE=3211;

    public static final String SAMPLE_STATE_ERROR_MSG="样本状态错误";

    public static final int REPORT_NOT_EXIST_ERROR_CODE = 3212;
    public static final String REPORT_NOT_EXIST_ERROR_MSG = "报告不存在";

    public static final int SAMPLE_EXIST_ERROR_CODE=3500;
    public static final String SAMPLE_EXIST_ERROR_MSG="已经上传检测数据，若要上传请授权重传数据";

    public static final int SAMPLE_NOT_EXIST_ERROR_CODE=3501;
    public static final String SAMPLE_NOT_EXIST_ERROR_MSG="样本不存在";

    public static final int UNLOCK_ITEM_EXIST_ERROR_CODE=3502;
    public static final String UNLOCK_ITEM_EXIST_ERROR_MSG="待解锁项冲突，存在解锁项在其它待支付订单";

    public static final int CART_NOT_EXIST_ERROR_CODE=3503;
    public static final String CART_NOT_EXIST_ERROR_MSG="购物车已失效，请返回重新下单";

    public static final int  UULOCKGOOD_NOT_EXIST_ERROR_CODE=3504;
    public static final String UULOCKGOOD_NOT_EXIST_ERROR_MSG="解锁商品不存在";


    public static final int  UULOCK_ORDER_NUM_ERROR_CODE=3505;
    public static final String UULOCK_ORDER_NUM_ERROR__MSG="解锁商品数量错误";

    public static final int  UULOCK_ITEM_NUM_ERROR_CODE=3506;
    public static final String UULOCK_ITEM_NUM_ERROR__MSG="解锁商品单项数量超过限制";
}
