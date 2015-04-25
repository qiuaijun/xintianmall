package com.xintian.mall.category;

/**
 * 产品分类信息
 * 
 * @author qiuaijun
 *
 * @date 2015年4月23日
 */
public class Category {
	// 产品分类ID
	private long id;
	// 产品分类名称
	private String name;
	// 产品分类描述
	private String desc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
