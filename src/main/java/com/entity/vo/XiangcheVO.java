package com.entity.vo;

import com.entity.XiangcheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 相册
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangche")
public class XiangcheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 相册名
     */

    @TableField(value = "xiangche_name")
    private String xiangcheName;


    /**
     * 相册类型
     */

    @TableField(value = "xiangche_types")
    private Integer xiangcheTypes;


    /**
     * 上传用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 相册图
     */

    @TableField(value = "xiangche_photo")
    private String xiangchePhoto;


    /**
     * 相册详情
     */

    @TableField(value = "xiangche_content")
    private String xiangcheContent;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：相册名
	 */
    public String getXiangcheName() {
        return xiangcheName;
    }


    /**
	 * 获取：相册名
	 */

    public void setXiangcheName(String xiangcheName) {
        this.xiangcheName = xiangcheName;
    }
    /**
	 * 设置：相册类型
	 */
    public Integer getXiangcheTypes() {
        return xiangcheTypes;
    }


    /**
	 * 获取：相册类型
	 */

    public void setXiangcheTypes(Integer xiangcheTypes) {
        this.xiangcheTypes = xiangcheTypes;
    }
    /**
	 * 设置：上传用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：上传用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：相册图
	 */
    public String getXiangchePhoto() {
        return xiangchePhoto;
    }


    /**
	 * 获取：相册图
	 */

    public void setXiangchePhoto(String xiangchePhoto) {
        this.xiangchePhoto = xiangchePhoto;
    }
    /**
	 * 设置：相册详情
	 */
    public String getXiangcheContent() {
        return xiangcheContent;
    }


    /**
	 * 获取：相册详情
	 */

    public void setXiangcheContent(String xiangcheContent) {
        this.xiangcheContent = xiangcheContent;
    }
    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
