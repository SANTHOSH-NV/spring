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

public class Doctor {

	@NonNull
	private String name;

	@NonNull
	private int age;
	
	@NonNull
	private String gender;
	
	@NonNull
	private int id;

	@NonNull
	private long phoneNo;
	

}
