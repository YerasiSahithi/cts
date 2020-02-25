package com.cts.project.pojo;
import javax.persistence.Id;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name="stockprice")
public class StockPrice {
	@Id

    private Integer companyCode;
    private String stockExchange;
	  private Integer currentPrice ;
      Date date = new Date();

	@Override
	public String toString() {
		return "StockPrice [company_Code=" + companyCode + ", stockexchange=" + stockExchange + ", current_Price="
				+ currentPrice + "]";
	}
	public Integer getCompanycode() {
		return companyCode;
	}
	public void setCompanycode(Integer companycode) {
		this.companyCode = companycode;
	}
	public String getStockexchange() {
		return stockExchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockExchange = stockexchange;
	}
	public Integer getCurrentprice() {
		return currentPrice;
	}
	public void setCurrentprice(Integer currentprice) {
		this.currentPrice = currentprice;
	}

}
