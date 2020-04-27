package com.zua.howzhi.model;

public class Category {
    private Integer categoryId;

    private String name;

    private String PhotoUrl;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() { return PhotoUrl; }

    public void setPhotoUrl(String photoUrl) { this.PhotoUrl = photoUrl; }
}