package com.xworkz.restaurent;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Value;

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

public class Restaurent {
	@NonNull
	private LinkedHashSet<String> name;
	
	@NonNull
	private Integer noOfWorkers;
	
	@NonNull
	private int noOfBranches;
	
	private String tablesAvailable;
	
	@NonNull
	private LinkedHashMap<Integer, String> address;
	
	@NonNull
	private ArrayList<String> ownerName;
	
	
	

}
