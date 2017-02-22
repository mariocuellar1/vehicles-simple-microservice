package io.mcore.myapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicles")
public class Vehicle {

	@Id
	public String id;

	public String plateNumber;
	public String type;
	public String model;
	public int year;

	public Vehicle() {

	}

	public Vehicle(String plateNumber, String type, String model, int year) {
		super();
		this.plateNumber = plateNumber;
		this.type = type;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", plateNumber=" + plateNumber + ", type=" + type + ", model=" + model + ", year="
				+ year + "]";
	}
	
	

}
