package com.xintian.mall.product;

import java.util.List;

/**
 * @author qiuaijun
 *
 * @date 2015年4月23日
 */
public interface ProductService {
	/**
	 * 产品入库：增加多个产品，但是需要是同一种类别的：比如增加樱桃、苹果、香蕉；
	 * 
	 * @param products
	 * @throws ProductException
	 */

	public void addProducts(List<Product> products) throws ProductException;

	/**
	 * 获取所有的产品
	 * 
	 * @return
	 */
	public List<Product> getAllProducts() throws ProductException;

	/**
	 * 删除某种产品：比如苹果
	 * 
	 * @param productId
	 * @throws ProductException
	 */
	public void removeProduct(long productId) throws ProductException;

	/**
	 * 售出指定数量的产品
	 * 
	 * @param id
	 *            产品标识
	 * @param count
	 *            售出的数量
	 * @throws ProductException
	 */
	public void soldProduct(long id, int count) throws ProductException;

}
