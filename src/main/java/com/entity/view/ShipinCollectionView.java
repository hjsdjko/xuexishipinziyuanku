package com.entity.view;

import com.entity.ShipinCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipin_collection")
public class ShipinCollectionView extends ShipinCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shipinCollectionValue;



		//级联表 shipin
			/**
			* 视频编号
			*/
			private String shipinUuidNumber;
			/**
			* 视频名称
			*/
			private String shipinName;
			/**
			* 视频照片
			*/
			private String shipinPhoto;
			/**
			* 视频
			*/
			private String shipinVideo;
			/**
			* 视频类型
			*/
			private Integer shipinTypes;
				/**
				* 视频类型的值
				*/
				private String shipinValue;
			/**
			* 热度
			*/
			private Integer shipinClicknum;
			/**
			* 视频详情
			*/
			private String shipinContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shipinDelete;

		//级联表 yonghu
			/**
			* 用户编号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public ShipinCollectionView() {

	}

	public ShipinCollectionView(ShipinCollectionEntity shipinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shipinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShipinCollectionValue() {
				return shipinCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShipinCollectionValue(String shipinCollectionValue) {
				this.shipinCollectionValue = shipinCollectionValue;
			}













				//级联表的get和set shipin

					/**
					* 获取： 视频编号
					*/
					public String getShipinUuidNumber() {
						return shipinUuidNumber;
					}
					/**
					* 设置： 视频编号
					*/
					public void setShipinUuidNumber(String shipinUuidNumber) {
						this.shipinUuidNumber = shipinUuidNumber;
					}

					/**
					* 获取： 视频名称
					*/
					public String getShipinName() {
						return shipinName;
					}
					/**
					* 设置： 视频名称
					*/
					public void setShipinName(String shipinName) {
						this.shipinName = shipinName;
					}

					/**
					* 获取： 视频照片
					*/
					public String getShipinPhoto() {
						return shipinPhoto;
					}
					/**
					* 设置： 视频照片
					*/
					public void setShipinPhoto(String shipinPhoto) {
						this.shipinPhoto = shipinPhoto;
					}

					/**
					* 获取： 视频
					*/
					public String getShipinVideo() {
						return shipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setShipinVideo(String shipinVideo) {
						this.shipinVideo = shipinVideo;
					}

					/**
					* 获取： 视频类型
					*/
					public Integer getShipinTypes() {
						return shipinTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setShipinTypes(Integer shipinTypes) {
						this.shipinTypes = shipinTypes;
					}


						/**
						* 获取： 视频类型的值
						*/
						public String getShipinValue() {
							return shipinValue;
						}
						/**
						* 设置： 视频类型的值
						*/
						public void setShipinValue(String shipinValue) {
							this.shipinValue = shipinValue;
						}

					/**
					* 获取： 热度
					*/
					public Integer getShipinClicknum() {
						return shipinClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setShipinClicknum(Integer shipinClicknum) {
						this.shipinClicknum = shipinClicknum;
					}

					/**
					* 获取： 视频详情
					*/
					public String getShipinContent() {
						return shipinContent;
					}
					/**
					* 设置： 视频详情
					*/
					public void setShipinContent(String shipinContent) {
						this.shipinContent = shipinContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShipinDelete() {
						return shipinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShipinDelete(Integer shipinDelete) {
						this.shipinDelete = shipinDelete;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户编号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 用户编号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
