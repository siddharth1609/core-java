package java8.optional.sampl;

import java.util.Optional;

public class Mobile {

	
	private Long id;
	private String brand;
	private String name;
	private Optional<DisplayFeatures>dfeature;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Mobile(Long id, String brand, String name, Optional<DisplayFeatures> dfeature) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.dfeature = dfeature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<DisplayFeatures> getDfeature() {
		return dfeature;
	}
	public void setDfeature(Optional<DisplayFeatures> dfeature) {
		this.dfeature = dfeature;
	}
	
	
}
