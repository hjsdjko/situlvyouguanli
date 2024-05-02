package com.entity.vo;

import com.entity.YulexiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 娱乐项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yulexiangmu")
public class YulexiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1  show2 photoShow
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
	 * 设置：创建时间  show1  show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1  show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
