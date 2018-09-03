package com.example.demo.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-08-30 19:30:20
 */
@TableName("tb_mall_order")
public class MallOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String orderId;
	/**
	 * 
	 */
	private String tradeno;
	/**
	 * 
	 */
	private String openId;
	/**
	 * 
	 */
	private Long productId;
	/**
	 * 
	 */
	private String productName;
	/**
	 * 
	 */
	private BigDecimal payMoney;
	/**
	 * 
	 */
	private String prepayId;
	/**
	 * 
	 */
	private String orderStatus;
	/**
	 * 
	 */
	private Date createdDate;
	/**
	 * 
	 */
	private Date updatedDate;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置：
	 */
	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}
	/**
	 * 获取：
	 */
	public String getTradeno() {
		return tradeno;
	}
	/**
	 * 设置：
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * 获取：
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * 设置：
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：
	 */
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	/**
	 * 设置：
	 */
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}
	/**
	 * 获取：
	 */
	public String getPrepayId() {
		return prepayId;
	}
	/**
	 * 设置：
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * 获取：
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * 设置：
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * 获取：
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
}
