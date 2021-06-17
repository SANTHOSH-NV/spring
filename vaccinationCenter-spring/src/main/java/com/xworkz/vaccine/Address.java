package com.xworkz.vaccine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Component
@Setter
@Getter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor

public class Address {

	@NonNull
	@Value("123")
	private int buildingNo;


	@NonNull
	@Value("Rajajinagar")
	private String area;

	@NonNull
	@Value("Bangalore")
	private String city;

	@NonNull
	@Value("560021")
	private long pincode;
	
	

}
