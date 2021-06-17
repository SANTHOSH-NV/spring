package com.xworkz.sanitizer;

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

public class Sanitizer {
	
	@NonNull
	@Value("Lifebouy")
	private String name;
	
	@NonNull
	@Value("200ML")
	private String quantity;
	
	@NonNull
	@Value("Blue")
	private String color;
	
	@NonNull
	@Value("200")
	private double price;
	
	@NonNull
	@Autowired
	private Ingredients ingredients;
	
	@NonNull
	@Value("False")
	private boolean isAyurvedic;
	
	
}
