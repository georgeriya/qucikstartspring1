package com.training;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString 

public class Product {

	private long productCode;
	private String productName;
	private double quantity;
	private double ratePerUnit;
}
