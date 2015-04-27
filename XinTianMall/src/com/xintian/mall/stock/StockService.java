package com.xintian.mall.stock;

/**
 * @author qiuaijun
 *
 * @date 2015年4月27日
 */
public interface StockService {

	/**
	 * 增加库存
	 * 
	 * @param productId
	 *            产品ID
	 * @param count
	 *            增加库存量
	 */
	public void addStock(long productId, int count);

	/**
	 * 减少库存
	 * 
	 * @param productId
	 * @param count
	 */
	public void reduceStock(long productId, int count);

}
