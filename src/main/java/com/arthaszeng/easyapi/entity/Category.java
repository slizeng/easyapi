package com.arthaszeng.easyapi.entity;

import javax.persistence.*;


@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    private String description;

    private String detailedDescription;

    public Category() {
    }

    public Category(String description, String detailedDescription) {
        this.description = description;
        this.detailedDescription = detailedDescription;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }
}
