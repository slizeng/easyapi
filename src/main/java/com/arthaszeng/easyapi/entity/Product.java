package com.arthaszeng.easyapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "product_group")
    private String productGroup;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name = "source_id")
    private Source source;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}

