package com.bits.scalable.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long productId;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("vendor_id")
    private String vendorId;

    @JsonProperty("cost")
    private Double cost;

    @JsonProperty("inventory_id")
    private Long inventoryId;

}

