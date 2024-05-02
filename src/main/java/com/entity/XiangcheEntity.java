package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 相册
 *
 * @author 
 * @email
 */
@TableName("xiangche")
public class XiangcheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangcheEntity() {

	}

	public XiangcheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiangche{" +
            "id=" + id +
            ", xiangcheName=" + xiangcheName +
            ", xiangcheTypes=" + xiangcheTypes +
            ", yonghuId=" + yonghuId +
            ", xiangchePhoto=" + xiangchePhoto +
            ", xiangcheContent=" + xiangcheContent +
            ", createTime=" + createTime +
        "}";
    }
}
