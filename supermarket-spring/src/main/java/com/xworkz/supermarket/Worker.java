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
public class Worker {
	
	@NonNull
	private String name;
	
	@NonNull
	private int age;
	
	@NonNull
	private int id;
	
	@NonNull
	private long phoneNo;
	

}
