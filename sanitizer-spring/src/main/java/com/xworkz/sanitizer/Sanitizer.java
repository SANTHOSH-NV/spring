package com.xworkz.sanitizer;

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

public class Sanitizer {
	@NonNull
	private String name;
	
	@NonNull
	private String quantity;
	
	@NonNull
	private String color;
	
	@NonNull
	private double price;
	
	@NonNull
	private Ingredients ingredients;
	
	@NonNull
	private boolean isAyurvedic;
	
	
}
