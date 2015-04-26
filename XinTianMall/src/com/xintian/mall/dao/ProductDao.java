package com.xintian.mall.dao;

import java.util.List;

import com.xintian.mall.product.Product;
import com.xintian.mall.product.ProductException;

/**
 * @author qiuaijun
 *
 * @date 2015年4月26日
 */
public interface ProductDao {

	/**
	 * 增加多个产品，但是需要是同一种类别的：比如增加樱桃、苹果、香蕉；
	 * 
	 * @param products
	 * @throws ProductException
	 */

	public void insertProducts(List<Product> products) throws ProductException;

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
	public void removeProduct(String productId) throws ProductException;

	/**
	 * 更新某种产品的属性，比如库存量
	 * 
	 * @param product
	 * @throws ProductException
	 */
	public void updateProduct(Product product) throws ProductException;

}
