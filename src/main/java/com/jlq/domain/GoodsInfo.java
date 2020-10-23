package com.jlq.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 20:22
 */

public class GoodsInfo {

    @Id
    @Column(name = "id")
    private Integer goodId;
    private String goodName;
    private Float goodPrice;
    private String goodDesc;
    private String goodArea;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @Column(name = "quality")
    private Float goodQuality;
    @Column(name = "stock")
    private Integer goodStock;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Float getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Float goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public String getGoodArea() {
        return goodArea;
    }

    public void setGoodArea(String goodArea) {
        this.goodArea = goodArea;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Float getGoodQuality() {
        return goodQuality;
    }

    public void setGoodQuality(Float goodQuality) {
        this.goodQuality = goodQuality;
    }

    public Integer getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(Integer goodStock) {
        this.goodStock = goodStock;
    }

    @Override
    public String toString() {
        return "GoodInfo{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodDesc='" + goodDesc + '\'' +
                ", goodArea='" + goodArea + '\'' +
                ", createDate=" + createDate +
                ", goodQuality=" + goodQuality +
                ", goodStock=" + goodStock +
                '}';
    }
}


