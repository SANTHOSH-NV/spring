package com.xworkz.chocolate;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class DataBase {
	
	@NonNull
	private String url;
	
	@NonNull
	private String userName;
	
	
	@NonNull
	private String password;
	
	
	private String name;
	
	public void init() {
		System.out.println("Data Base Class is Created");
	}

}
