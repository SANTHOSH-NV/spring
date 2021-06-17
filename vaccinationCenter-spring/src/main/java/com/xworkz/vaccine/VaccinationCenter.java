package com.xworkz.vaccine;
import org.springframework.beans.factory.annotation.Autowired;
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
@NoArgsConstructor
@RequiredArgsConstructor

public class VaccinationCenter {
	
	
	@NonNull
	@Value("Government School")
	private String centerName;
	
	@NonNull
	@Autowired
	private Doctor doctors;
	
	
	@NonNull
	@Value("4")
	private int noOfDoctors;
	
	@NonNull
	@Autowired
	private Address address;
	
	@NonNull
	@Value("Covidshield")
	private String vaccines;
	
	@NonNull
	@Value("100")
	private int noOfVaccinesAvailable;

}
