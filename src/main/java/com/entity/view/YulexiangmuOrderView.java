package com.entity.view;

import com.entity.YulexiangmuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 娱乐项目订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yulexiangmu_order")
public class YulexiangmuOrderView extends YulexiangmuOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

		//级联表 yulexiangmu
			/**
			* 娱乐项目名称
			*/
			private String yulexiangmuName;
			/**
			* 娱乐项目图片
			*/
			private String yulexiangmuPhoto;
			/**
			* 单价
			*/
			private Double yulexiangmuNewMoney;
			/**
			* 娱乐项目详情
			*/
			private String yulexiangmuContent;

	public YulexiangmuOrderView() {

	}

	public YulexiangmuOrderView(YulexiangmuOrderEntity yulexiangmuOrderEntity) {
		try {
			BeanUtils.copyProperties(this, yulexiangmuOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}









































				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


				//级联表的get和set yulexiangmu
					/**
					* 获取： 娱乐项目名称
					*/
					public String getYulexiangmuName() {
						return yulexiangmuName;
					}
					/**
					* 设置： 娱乐项目名称
					*/
					public void setYulexiangmuName(String yulexiangmuName) {
						this.yulexiangmuName = yulexiangmuName;
					}
					/**
					* 获取： 娱乐项目图片
					*/
					public String getYulexiangmuPhoto() {
						return yulexiangmuPhoto;
					}
					/**
					* 设置： 娱乐项目图片
					*/
					public void setYulexiangmuPhoto(String yulexiangmuPhoto) {
						this.yulexiangmuPhoto = yulexiangmuPhoto;
					}
					/**
					* 获取： 单价
					*/
					public Double getYulexiangmuNewMoney() {
						return yulexiangmuNewMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setYulexiangmuNewMoney(Double yulexiangmuNewMoney) {
						this.yulexiangmuNewMoney = yulexiangmuNewMoney;
					}
					/**
					* 获取： 娱乐项目详情
					*/
					public String getYulexiangmuContent() {
						return yulexiangmuContent;
					}
					/**
					* 设置： 娱乐项目详情
					*/
					public void setYulexiangmuContent(String yulexiangmuContent) {
						this.yulexiangmuContent = yulexiangmuContent;
					}










}
