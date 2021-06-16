package com.xworkz.supermarket;

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

public class SuperMarket {
	
	
	@NonNull
	private String name;
	
	@NonNull
	private int noOFCounters;
	
	@NonNull
	private Address address;
	
	
	@NonNull
	private int noOfBranches;
	
	@NonNull
	private Worker worker;
	
	
	
	
	
}
