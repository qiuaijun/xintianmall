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
	 * 根据状态获取产品列表
	 * 
	 * @param status
	 *            产品状态:0-下架, 1-上架
	 * @return 对应状态的产品列表
	 * @throws ProductException
	 */
	public List<Product> getProductsByStatus(int status)
			throws ProductException;

	/**
	 * 获取指定分类信息下的所有产品
	 * 
	 * @param categoryId
	 * @return
	 * @throws ProductException
	 */
	public List<Product> getProductsByCategory(int categoryId)
			throws ProductException;

	/**
	 * 删除某种产品：比如苹果
	 * 
	 * @param productId
	 * @throws ProductException
	 */
	public void removeProduct(long productId) throws ProductException;

	/**
	 * 商品上架或者下架
	 * 
	 * @param id
	 *            产品标识
	 * @param count
	 *            产品状态:0-下架, 1-上架
	 * @throws ProductException
	 */
	public void updateProductStatus(long id, int status)
			throws ProductException;

}
