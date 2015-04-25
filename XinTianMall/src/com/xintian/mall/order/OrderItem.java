package com.xintian.mall.order;

import com.xintian.mall.product.Product;

/**
 * 订单中某条信息
 * 
 * @author qiuaijun
 *
 * @date 2015年4月25日
 */
public class OrderItem {
	// 订单ID
	private long orderId;
	// 产品
	private Product product;
	// 该产品的真实价格
	private double realPrice;
	// 该订单中该产品的数量
	private int size;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(double realPrice) {
		this.realPrice = realPrice;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
