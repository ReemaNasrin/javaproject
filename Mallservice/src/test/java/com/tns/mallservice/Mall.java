package com.tns.mallservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mall {
	private Integer Mall_id;
	private String Mall_name;
	private String Mall_location;
	private Integer Mall_no_of_stores;
	private String Mall_starting_date;
	private String Mall_tax;
	private String Mall_square_feet;
	public Mall() {
		super();
	}
 
	public Mall(Integer mall_id, String mall_name, String mall_location, Integer mall_no_of_stores,
			String mall_starting_date, String mall_tax, String mall_square_feet) {
		super();
		Mall_id = mall_id;
		Mall_name = mall_name;
		Mall_location = mall_location;
		Mall_no_of_stores = mall_no_of_stores;
		Mall_starting_date = mall_starting_date;
		Mall_tax = mall_tax;
		Mall_square_feet = mall_square_feet;
	}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMall_id() {
		return Mall_id;
	}
	public void setMall_id(Integer mall_id) {
		Mall_id = mall_id;
	}
	public String getMall_name() {
		return Mall_name;
	}
	public void setMall_name(String mall_name) {
		Mall_name = mall_name;
	}
	public String getMall_location() {
		return Mall_location;
	}
	public void setMall_location(String mall_location) {
		Mall_location = mall_location;
	}
	public Integer getMall_no_of_stores() {
		return Mall_no_of_stores;
	}
	public void setMall_no_of_stores(Integer mall_no_of_stores) {
		Mall_no_of_stores = mall_no_of_stores;
	}
	public String getMall_starting_date() {
		return Mall_starting_date;
	}
	public void setMall_starting_date(String mall_starting_date) {
		Mall_starting_date = mall_starting_date;
	}
	public String getMall_tax() {
		return Mall_tax;
	}
	public void setMall_tax(String mall_tax) {
		Mall_tax = mall_tax;
	}
	public String getMall_square_feet() {
		return Mall_square_feet;
	}
	public void setMall_square_feet(String mall_square_feet) {
		Mall_square_feet = mall_square_feet;
	}
	public String toString() {
		return "Mall id=" + Mall_id + ", Mall name=" + Mall_name + ", Mall location=" + Mall_location
				+ ", Mall no of stores=" + Mall_no_of_stores + ", Mall startingdate=" + Mall_starting_date
				+ ", Mall tax=" + Mall_tax + ", Mall squarefeet=" + Mall_square_feet;
	}
	

}
