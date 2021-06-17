package com.xworkz.sanitizer;

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
@NoArgsConstructor
@ToString
@RequiredArgsConstructor

public class Ingredients {

	@NonNull
	@Value("Isopropyl Alcohol")
	private String alcohol;

	@NonNull
	@Value("79")
	private double alcoholPercentage;

	@NonNull
	@Value("Hydrogen Peroxide")
	private String peroxide;

	@NonNull
	@Value("0.125")
	private double peroxidePercentage;

	@NonNull
	@Value("20")
	private double distilledWaterPercentage;

}
