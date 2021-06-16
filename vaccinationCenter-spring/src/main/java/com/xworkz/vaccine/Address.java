package com.xworkz.vaccine;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor

public class Address {

	@NonNull
	private int buildingNo;


	@NonNull
	private String area;

	@NonNull
	private String city;

	@NonNull
	private long pincode;

}
