package com.entity.vo;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishi")
public class MeishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 美食名称
     */

    @TableField(value = "meishi_name")
    private String meishiName;


    /**
     * 美食图片
     */

    @TableField(value = "meishi_photo")
    private String meishiPhoto;


    /**
     * 单价
     */

    @TableField(value = "meishi_new_money")
    private Double meishiNewMoney;


    /**
     * 美食详情
     */

    @TableField(value = "meishi_content")
    private String meishiContent;


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
	 * 设置：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 获取：美食名称
	 */

    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 设置：美食图片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 获取：美食图片
	 */

    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 设置：单价
	 */
    public Double getMeishiNewMoney() {
        return meishiNewMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setMeishiNewMoney(Double meishiNewMoney) {
        this.meishiNewMoney = meishiNewMoney;
    }
    /**
	 * 设置：美食详情
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 获取：美食详情
	 */

    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
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
