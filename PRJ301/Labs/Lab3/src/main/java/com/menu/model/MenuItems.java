package com.menu.model;

import java.util.*;

public class MenuItems {

    private int id;
    private String nameCategories;
    private int parentId;
    private List<MenuItems> child;

    public MenuItems() {
    }

    public MenuItems(int id, String nameCategories, int parentId) {
        this.id = id;
        this.nameCategories = nameCategories;
        this.parentId = parentId;
    }

    public MenuItems(int id, String nameCategories, int parentId, List<MenuItems> child) {
        this.id = id;
        this.nameCategories = nameCategories;
        this.parentId = parentId;
        this.child = child;
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

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<MenuItems> getChild() {
        return child;
    }

    public void setChild(List<MenuItems> child) {
        this.child = (List<MenuItems>) child;
    }

    @Override
    public String toString() {
        return "CategoriesModel{" + "ID = " + id + ", Name Categories = " + nameCategories + ", Parent Id = " + parentId + '}' + "\n";
    }
}
