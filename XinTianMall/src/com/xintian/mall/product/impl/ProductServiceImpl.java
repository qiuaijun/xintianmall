package com.xintian.mall.product.impl;

import java.util.List;

import com.xintian.mall.product.Product;
import com.xintian.mall.product.ProductException;
import com.xintian.mall.product.ProductService;

/**
 * @author qiuaijun
 *
 * @date 2015年5月10日
 */
public class ProductServiceImpl implements ProductService {

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#addProducts(java.util.List)
	 */
	@Override
	public void addProducts(List<Product> products) throws ProductException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#getAllProducts()
	 */
	@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#getProductsByStatus(int)
	 */
	@Override
	public List<Product> getProductsByStatus(int status)
			throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#getProductsByCategory(int)
	 */
	@Override
	public List<Product> getProductsByCategory(int categoryId)
			throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#removeProduct(long)
	 */
	@Override
	public void removeProduct(long productId) throws ProductException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.xintian.mall.product.ProductService#updateProductStatus(long, int)
	 */
	@Override
	public void updateProductStatus(long id, int status)
			throws ProductException {
		// TODO Auto-generated method stub

	}

}
