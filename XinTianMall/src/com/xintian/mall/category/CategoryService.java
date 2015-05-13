package com.xintian.mall.category;

import java.util.List;

import com.xintian.mall.product.Product;

/**
 * @author qiuaijun
 *
 * @date 2015年4月25日
 */
public interface CategoryService {

	/**
	 * 增加分类信息
	 * 
	 * @param category
	 *            分类信息
	 */
	public void addCategory(Category category);

	/**
	 * 更新分类信息
	 * 
	 * @param id
	 * @param category
	 */
	public void updateCategory(long id, Category category);

	/**
	 * 删除指定的分类信息
	 * 
	 * @param id
	 *            分类ID
	 */
	public void removeCategory(long id);

	/**
	 * 获取某个类别下的所有产品信息
	 * 
	 * @param id
	 *            分类ID 
	 * @return 该类别下的所有产品信息
	 */
	public List<Product> getProductsByCategory(long id);

}
