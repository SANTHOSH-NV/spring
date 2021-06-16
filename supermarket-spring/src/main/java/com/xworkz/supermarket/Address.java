package com.xworkz.supermarket;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor

public class Address {
	
	@NonNull
	private int buildingNo;
	
	@NonNull
	private int doorNo;
	
	@NonNull
	private String area;
	
	@NonNull
	private String city;
	
	@NonNull
	private long pincode;
	
	

}
