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
 * 卖家用户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 11:06:52
 */
@TableName("maijiayonghu")
public class MaijiayonghuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MaijiayonghuEntity() {
		
	}
	
	public MaijiayonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 卖家账号
	 */
					
	private String maijiazhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 卖家姓名
	 */
					
	private String maijiaxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学校
	 */
					
	private String xuexiao;
	
	/**
	 * 卖家手机
	 */
					
	private String maijiashouji;
	
	/**
	 * 联系邮箱
	 */
					
	private String lianxiyouxiang;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：卖家账号
	 */
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	/**
	 * 获取：卖家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：卖家姓名
	 */
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	/**
	 * 获取：卖家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学校
	 */
	public void setXuexiao(String xuexiao) {
		this.xuexiao = xuexiao;
	}
	/**
	 * 获取：学校
	 */
	public String getXuexiao() {
		return xuexiao;
	}
	/**
	 * 设置：卖家手机
	 */
	public void setMaijiashouji(String maijiashouji) {
		this.maijiashouji = maijiashouji;
	}
	/**
	 * 获取：卖家手机
	 */
	public String getMaijiashouji() {
		return maijiashouji;
	}
	/**
	 * 设置：联系邮箱
	 */
	public void setLianxiyouxiang(String lianxiyouxiang) {
		this.lianxiyouxiang = lianxiyouxiang;
	}
	/**
	 * 获取：联系邮箱
	 */
	public String getLianxiyouxiang() {
		return lianxiyouxiang;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}

}
