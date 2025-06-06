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
 * 兼职信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 11:06:52
 */
@TableName("jianzhixinxi")
public class JianzhixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianzhixinxiEntity() {
		
	}
	
	public JianzhixinxiEntity(T t) {
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
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 兼职地点
	 */
					
	private String jianzhididian;
	
	/**
	 * 职位名称
	 */
					
	private String zhiweimingcheng;
	
	/**
	 * 职位要求
	 */
					
	private String zhiweiyaoqiu;
	
	/**
	 * 职位薪资
	 */
					
	private String zhiweixinzi;
	
	/**
	 * 工作时间
	 */
					
	private String gongzuoshijian;
	
	/**
	 * 工作地点
	 */
					
	private String gongzuodidian;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 公司图片
	 */
					
	private String gongsitupian;
	
	
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
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
	/**
	 * 设置：兼职地点
	 */
	public void setJianzhididian(String jianzhididian) {
		this.jianzhididian = jianzhididian;
	}
	/**
	 * 获取：兼职地点
	 */
	public String getJianzhididian() {
		return jianzhididian;
	}
	/**
	 * 设置：职位名称
	 */
	public void setZhiweimingcheng(String zhiweimingcheng) {
		this.zhiweimingcheng = zhiweimingcheng;
	}
	/**
	 * 获取：职位名称
	 */
	public String getZhiweimingcheng() {
		return zhiweimingcheng;
	}
	/**
	 * 设置：职位要求
	 */
	public void setZhiweiyaoqiu(String zhiweiyaoqiu) {
		this.zhiweiyaoqiu = zhiweiyaoqiu;
	}
	/**
	 * 获取：职位要求
	 */
	public String getZhiweiyaoqiu() {
		return zhiweiyaoqiu;
	}
	/**
	 * 设置：职位薪资
	 */
	public void setZhiweixinzi(String zhiweixinzi) {
		this.zhiweixinzi = zhiweixinzi;
	}
	/**
	 * 获取：职位薪资
	 */
	public String getZhiweixinzi() {
		return zhiweixinzi;
	}
	/**
	 * 设置：工作时间
	 */
	public void setGongzuoshijian(String gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	/**
	 * 获取：工作时间
	 */
	public String getGongzuoshijian() {
		return gongzuoshijian;
	}
	/**
	 * 设置：工作地点
	 */
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：公司图片
	 */
	public void setGongsitupian(String gongsitupian) {
		this.gongsitupian = gongsitupian;
	}
	/**
	 * 获取：公司图片
	 */
	public String getGongsitupian() {
		return gongsitupian;
	}

}
