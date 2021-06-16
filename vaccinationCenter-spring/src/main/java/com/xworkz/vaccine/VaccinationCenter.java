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
@NoArgsConstructor
@RequiredArgsConstructor

public class VaccinationCenter {
	
	
	
	@NonNull
	private String centerName;
	@NonNull
	private Doctor doctors;
	@NonNull
	private int noOfDoctors;
	@NonNull
	private Address address;
	@NonNull
	private String vaccines;
	@NonNull
	private int noOfVaccinesAvailable;

}
