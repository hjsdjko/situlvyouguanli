package com.entity.model;

import com.entity.YulexiangmuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 娱乐项目订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YulexiangmuOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 娱乐项目id
     */
    private Integer yulexiangmuId;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 人数
     */
    private Integer yulexiangmuNumber;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：娱乐项目id
	 */
    public Integer getYulexiangmuId() {
        return yulexiangmuId;
    }


    /**
	 * 设置：娱乐项目id
	 */
    public void setYulexiangmuId(Integer yulexiangmuId) {
        this.yulexiangmuId = yulexiangmuId;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：人数
	 */
    public Integer getYulexiangmuNumber() {
        return yulexiangmuNumber;
    }


    /**
	 * 设置：人数
	 */
    public void setYulexiangmuNumber(Integer yulexiangmuNumber) {
        this.yulexiangmuNumber = yulexiangmuNumber;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
