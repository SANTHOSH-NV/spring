package com.xworkz.chocolate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor


public class Chocolate {
	
	
	@NonNull
	private String name;
	
	@NonNull
	private String brand;
	
	
	private String size;
	
	
	private double price;

	
	public void taste() {
		System.out.println("Invoked taste method");
		System.out.println("Chocolates are very tasty");
	}
	
	
	public void stressReliver() {
		System.out.println("Invoked stressReliver method");
		System.out.println("Eating Chocolate decreases stresslevel");
	}
	
	
	

}
