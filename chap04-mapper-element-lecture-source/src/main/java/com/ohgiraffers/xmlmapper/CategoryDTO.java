package com.ohgiraffers.xmlmapper;

public class CategoryDTO {
    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;

    public CategoryDTO() {
    }

    public CategoryDTO(int cateoryCode, String cateoryName, Integer refCateoryCode) {
        this.categoryCode = cateoryCode;
        this.categoryName = cateoryName;
        this.refCategoryCode = refCateoryCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int cateoryCode) {
        this.categoryCode = cateoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String cateoryName) {
        this.categoryName = cateoryName;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCateoryCode) {
        this.refCategoryCode = refCateoryCode;
    }

    @Override
    public String toString() {
        return "CateoryDTO{" +
                "cateoryCode=" + categoryCode +
                ", cateoryName='" + categoryName + '\'' +
                ", refCateoryCode=" + refCategoryCode +
                '}';
    }
}
