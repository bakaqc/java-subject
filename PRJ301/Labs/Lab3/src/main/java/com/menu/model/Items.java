package com.menu.model;

public class Items {

    private int id;
    private String nameCategories;
    private int status;
    private String slug;
    private int parentId;

    public Items() {
    }

    public Items(int id, String nameCategories, int status, String slug, int parentId) {
        this.id = id;
        this.nameCategories = nameCategories;
        this.status = status;
        this.slug = slug;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategories() {
        return nameCategories;
    }

    public void setNameCategories(String nameCategories) {
        this.nameCategories = nameCategories;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Categories{" + "id=" + id + ", nameCategories=" + nameCategories + ", status=" + status + ", slug=" + slug + ", parentId=" + parentId + '}' + "\n";
    }

}
