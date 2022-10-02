package com.sambit.model;

import javax.persistence.*;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 2:42 PM
 */
@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	private String categoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category{" +
			   "categoryId=" + categoryId +
			   ", categoryName='" + categoryName + '\'' +
			   '}';
	}
}
