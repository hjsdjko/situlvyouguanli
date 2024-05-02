package com.entity.view;

import com.entity.MeishiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 美食收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishi_collection")
public class MeishiCollectionView extends MeishiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 meishi
			/**
			* 美食名称
			*/
			private String meishiName;
			/**
			* 美食图片
			*/
			private String meishiPhoto;
			/**
			* 单价
			*/
			private Double meishiNewMoney;
			/**
			* 美食详情
			*/
			private String meishiContent;

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

	public MeishiCollectionView() {

	}

	public MeishiCollectionView(MeishiCollectionEntity meishiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, meishiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set meishi
					/**
					* 获取： 美食名称
					*/
					public String getMeishiName() {
						return meishiName;
					}
					/**
					* 设置： 美食名称
					*/
					public void setMeishiName(String meishiName) {
						this.meishiName = meishiName;
					}
					/**
					* 获取： 美食图片
					*/
					public String getMeishiPhoto() {
						return meishiPhoto;
					}
					/**
					* 设置： 美食图片
					*/
					public void setMeishiPhoto(String meishiPhoto) {
						this.meishiPhoto = meishiPhoto;
					}
					/**
					* 获取： 单价
					*/
					public Double getMeishiNewMoney() {
						return meishiNewMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setMeishiNewMoney(Double meishiNewMoney) {
						this.meishiNewMoney = meishiNewMoney;
					}
					/**
					* 获取： 美食详情
					*/
					public String getMeishiContent() {
						return meishiContent;
					}
					/**
					* 设置： 美食详情
					*/
					public void setMeishiContent(String meishiContent) {
						this.meishiContent = meishiContent;
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












}
