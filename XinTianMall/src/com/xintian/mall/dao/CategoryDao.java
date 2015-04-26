package com.xintian.mall.dao;

import com.xintian.mall.category.Category;

/**
 * 
 * 分类信息的Dao类
 * 
 * @author qiuaijun
 *
 * @date 2015年4月26日
 */
public interface CategoryDao {

	/**
	 * 保存分类信息到数据库中
	 * 
	 * @param category
	 */
	public void insertCategory(Category category);

	/**
	 * 更新数据库中的分类信息
	 * 
	 * @param category
	 */
	public void updateCategory(Category category);

	/**
	 * 删除数据库中分类信息
	 * 
	 * @param id
	 */
	public void deleteCategory(long id);

}
