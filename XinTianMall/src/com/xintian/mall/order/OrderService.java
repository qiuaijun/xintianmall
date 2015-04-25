package com.xintian.mall.order;

/**
 * @author qiuaijun
 *
 * @date 2015年4月25日
 */
public interface OrderService {

	/**
	 * 创建一个订单
	 * 
	 * @param order
	 */
	public void createOrder(Order order);

	/**
	 * 完成一个订单
	 * 
	 * @param id
	 */
	public void finishOrder(long id);

}
