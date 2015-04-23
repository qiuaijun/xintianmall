package com.xintian.mall.product;

import java.util.List;

/**
 * @author qiuaijun
 *
 * @date 2015年4月23日
 */
public interface ProductService {
	/**
	 * 增加多类产品：比如增加樱桃、苹果、香蕉；
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
	 * 删除某类产品：比如苹果
	 * 
	 * @param productId
	 * @throws ProductException
	 */
	public void removeProduct(String productId) throws ProductException;
	
	/**
	 * 更新某类产品的属性，比如库存量
	 * @param product
	 * @throws ProductException
	 */
	public void updateProduct(Product product)throws ProductException;

}
