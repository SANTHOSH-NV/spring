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
@NoArgsConstructor
@RequiredArgsConstructor

public class Doctor {

	@NonNull
	@Value("Appu")
	private String name;

	@NonNull
	@Value("24")
	private int age;
	
	@NonNull
	@Value("Male")
	private String gender;
	
	@NonNull
	@Value("8097")
	private int id;

	@NonNull
	@Value("996541145")
	private long phoneNo;
	

}
