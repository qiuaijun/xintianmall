package com.xintian.mall.order;

import java.sql.Date;
import java.util.List;

/**
 * 订单信息模型
 * 
 * @author qiuaijun
 *
 * @date 2015年4月25日
 */
public class Order {
	// 订单ID
	private long orderId;
	// 订单所属人
	private long userId;
	// 订单生成时间
	private Date createDate;
	// 订单所属产品
	private List<OrderItem> items;
	// 下面是地址信息
	private String city;
	private String address;
	// 邮编
	private String zip;

	// 总价格
	private double totalPrice;
	// 发货时间
	private Date sendDate;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}
