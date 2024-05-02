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
 * 娱乐项目
 *
 * @author 
 * @email
 */
@TableName("yulexiangmu")
public class YulexiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YulexiangmuEntity() {

	}

	public YulexiangmuEntity(T t) {
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
     * 娱乐项目名称
     */
    @TableField(value = "yulexiangmu_name")

    private String yulexiangmuName;


    /**
     * 娱乐项目图片
     */
    @TableField(value = "yulexiangmu_photo")

    private String yulexiangmuPhoto;


    /**
     * 单价
     */
    @TableField(value = "yulexiangmu_new_money")

    private Double yulexiangmuNewMoney;


    /**
     * 娱乐项目详情
     */
    @TableField(value = "yulexiangmu_content")

    private String yulexiangmuContent;


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
	 * 设置：娱乐项目名称
	 */
    public String getYulexiangmuName() {
        return yulexiangmuName;
    }


    /**
	 * 获取：娱乐项目名称
	 */

    public void setYulexiangmuName(String yulexiangmuName) {
        this.yulexiangmuName = yulexiangmuName;
    }
    /**
	 * 设置：娱乐项目图片
	 */
    public String getYulexiangmuPhoto() {
        return yulexiangmuPhoto;
    }


    /**
	 * 获取：娱乐项目图片
	 */

    public void setYulexiangmuPhoto(String yulexiangmuPhoto) {
        this.yulexiangmuPhoto = yulexiangmuPhoto;
    }
    /**
	 * 设置：单价
	 */
    public Double getYulexiangmuNewMoney() {
        return yulexiangmuNewMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setYulexiangmuNewMoney(Double yulexiangmuNewMoney) {
        this.yulexiangmuNewMoney = yulexiangmuNewMoney;
    }
    /**
	 * 设置：娱乐项目详情
	 */
    public String getYulexiangmuContent() {
        return yulexiangmuContent;
    }


    /**
	 * 获取：娱乐项目详情
	 */

    public void setYulexiangmuContent(String yulexiangmuContent) {
        this.yulexiangmuContent = yulexiangmuContent;
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
        return "Yulexiangmu{" +
            "id=" + id +
            ", yulexiangmuName=" + yulexiangmuName +
            ", yulexiangmuPhoto=" + yulexiangmuPhoto +
            ", yulexiangmuNewMoney=" + yulexiangmuNewMoney +
            ", yulexiangmuContent=" + yulexiangmuContent +
            ", createTime=" + createTime +
        "}";
    }
}
