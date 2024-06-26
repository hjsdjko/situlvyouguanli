package com.entity.view;

import com.entity.JiudianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 酒店购票
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiudian_order")
public class JiudianOrderView extends JiudianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jiudian
			/**
			* 酒店名称
			*/
			private String jiudianName;
			/**
			* 酒店星级
			*/
			private Integer jiudianTypes;
				/**
				* 酒店星级的值
				*/
				private String jiudianValue;
			/**
			* 酒店位置
			*/
			private String jiudianWeizhi;
			/**
			* 酒店缩略图
			*/
			private String jiudianPhoto;
			/**
			* 单价
			*/
			private Double jiudianNewMoney;
			/**
			* 酒店详情
			*/
			private String jiudianContent;

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

	public JiudianOrderView() {

	}

	public JiudianOrderView(JiudianOrderEntity jiudianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, jiudianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set jiudian
					/**
					* 获取： 酒店名称
					*/
					public String getJiudianName() {
						return jiudianName;
					}
					/**
					* 设置： 酒店名称
					*/
					public void setJiudianName(String jiudianName) {
						this.jiudianName = jiudianName;
					}
					/**
					* 获取： 酒店星级
					*/
					public Integer getJiudianTypes() {
						return jiudianTypes;
					}
					/**
					* 设置： 酒店星级
					*/
					public void setJiudianTypes(Integer jiudianTypes) {
						this.jiudianTypes = jiudianTypes;
					}


						/**
						* 获取： 酒店星级的值
						*/
						public String getJiudianValue() {
							return jiudianValue;
						}
						/**
						* 设置： 酒店星级的值
						*/
						public void setJiudianValue(String jiudianValue) {
							this.jiudianValue = jiudianValue;
						}
					/**
					* 获取： 酒店位置
					*/
					public String getJiudianWeizhi() {
						return jiudianWeizhi;
					}
					/**
					* 设置： 酒店位置
					*/
					public void setJiudianWeizhi(String jiudianWeizhi) {
						this.jiudianWeizhi = jiudianWeizhi;
					}
					/**
					* 获取： 酒店缩略图
					*/
					public String getJiudianPhoto() {
						return jiudianPhoto;
					}
					/**
					* 设置： 酒店缩略图
					*/
					public void setJiudianPhoto(String jiudianPhoto) {
						this.jiudianPhoto = jiudianPhoto;
					}
					/**
					* 获取： 单价
					*/
					public Double getJiudianNewMoney() {
						return jiudianNewMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setJiudianNewMoney(Double jiudianNewMoney) {
						this.jiudianNewMoney = jiudianNewMoney;
					}
					/**
					* 获取： 酒店详情
					*/
					public String getJiudianContent() {
						return jiudianContent;
					}
					/**
					* 设置： 酒店详情
					*/
					public void setJiudianContent(String jiudianContent) {
						this.jiudianContent = jiudianContent;
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
