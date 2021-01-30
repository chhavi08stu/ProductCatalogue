package com.stest.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryI extends JpaRepository<ProductBean,Long>{
	public List<ProductBean> getProductListByColor(String color);
	public List<ProductBean> getProductListBySize(String size);
	public List<ProductBean> getProductListByBrandName(String name);
	public List<ProductBean> getProductListBySKU(String sku);

}
