package com.xworkz.sanitizer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@RequiredArgsConstructor


public class Ingredients {
	
	@NonNull
	private String alcohol;
	@NonNull
	private double alcoholPercentage;
	@NonNull
	private String peroxide;
	@NonNull
	private double peroxidePercentage;
	@NonNull
	private double distilledWaterPercentage;
	

}
