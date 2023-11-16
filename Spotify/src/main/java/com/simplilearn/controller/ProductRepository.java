package com.simplilearn.controller;

import java.util.List;

// ProductRepository.java
	public interface ProductRepository extends JpaRepository<ProductService, Long> {

		List<ProductService> findAll11();
	    // Additional methods for querying products

		List<ProductService> findAll1111();

		List<ProductService> findAll111();

		Object findById(Long id);

		List<ProductService> findAll();

		List<ProductService> findAll1();
	}


