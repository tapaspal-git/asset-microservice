package com.example.microservices.asset.assetmicroservice.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="asset")
@JsonIgnoreProperties(value = { "assetid" })
@JsonPropertyOrder({ "type", "name", "model" })
public class Asset {

    @jakarta.persistence.Id
    @Column(name = "assetid", nullable = false)
    private Integer assetid;

    @JsonProperty("name")
    @Column(name = "itemname", nullable = false)
    private String name;

    @JsonProperty("model")
    @Column(name = "itemmodel", nullable = false)
    private String itemmodel;

    @Transient
    @JsonProperty("type")
    private String item;

    public Asset(String item, String name, String itemmodel)  {
        this.item = item;
        this.name = name;
        this.itemmodel = itemmodel;
    }

    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemmodel() {
        return itemmodel;
    }

    public void setItemmodel(String itemmodel) {
        this.itemmodel = itemmodel;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Asset() {
    }
}
