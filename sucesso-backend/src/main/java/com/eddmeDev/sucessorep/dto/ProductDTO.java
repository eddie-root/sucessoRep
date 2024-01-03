package com.eddmeDev.sucessorep.dto;


import java.util.ArrayList;
import java.util.List;

import com.eddmeDev.sucessorep.entities.Product;


public class ProductDTO {

	private Long id;
	private String name;
	private String description;
	private String imgUrl;
	
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public ProductDTO() {		
	}
	
	public ProductDTO(Long id, String name, String description, String imgUrl, List<CategoryDTO> categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imgUrl = imgUrl;
		this.categories = categories;
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		imgUrl = entity.getImgUrl();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}
	
	
}
