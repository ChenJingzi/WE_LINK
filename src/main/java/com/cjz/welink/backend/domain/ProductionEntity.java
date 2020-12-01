package com.cjz.welink.backend.domain;


import javax.persistence.*;

@Entity
@Table(name = "production")
public class ProductionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Override
    public String toString() {
        return "ProductionEntity{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
