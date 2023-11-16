package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//ProductController.java
@Controller
@RequestMapping("/products")
public class ProductController {

 private static Object product = null;
@Autowired
 private ProductService productService;

 @GetMapping
 public String getAllProducts(Model model) {
     List<ProductService> products = productService.getAllProducts();
     model.addAttribute("products", products);
     return "productList";
 }

 @GetMapping("/{productId}")
 public String getProductDetails(@PathVariable Long productId, Model model) {
     product = productService.getProductById(productId);
     model.addAttribute("product", product);
     return "productDetails";
 }
}
