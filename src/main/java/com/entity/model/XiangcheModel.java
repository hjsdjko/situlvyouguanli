package com.entity.model;

import com.entity.XiangcheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 相册
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangcheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 相册名
     */
    private String xiangcheName;


    /**
     * 相册类型
     */
    private Integer xiangcheTypes;


    /**
     * 上传用户
     */
    private Integer yonghuId;


    /**
     * 相册图
     */
    private String xiangchePhoto;


    /**
     * 相册详情
     */
    private String xiangcheContent;


    /**
     * 创建时间 show2 photoShow
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
	 * 获取：相册名
	 */
    public String getXiangcheName() {
        return xiangcheName;
    }


    /**
	 * 设置：相册名
	 */
    public void setXiangcheName(String xiangcheName) {
        this.xiangcheName = xiangcheName;
    }
    /**
	 * 获取：相册类型
	 */
    public Integer getXiangcheTypes() {
        return xiangcheTypes;
    }


    /**
	 * 设置：相册类型
	 */
    public void setXiangcheTypes(Integer xiangcheTypes) {
        this.xiangcheTypes = xiangcheTypes;
    }
    /**
	 * 获取：上传用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：上传用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：相册图
	 */
    public String getXiangchePhoto() {
        return xiangchePhoto;
    }


    /**
	 * 设置：相册图
	 */
    public void setXiangchePhoto(String xiangchePhoto) {
        this.xiangchePhoto = xiangchePhoto;
    }
    /**
	 * 获取：相册详情
	 */
    public String getXiangcheContent() {
        return xiangcheContent;
    }


    /**
	 * 设置：相册详情
	 */
    public void setXiangcheContent(String xiangcheContent) {
        this.xiangcheContent = xiangcheContent;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
