package com.example.demo.dto;

public class FavouriteDto {
	private String mode;
	private String from_point_name = "Hello world";
	private String departure_time;
	private String to_point_name = "to point name";
	private String arrival_time;
	private String distance;
	private String distance_desc;
	private String duration;
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getStarting_location() {
		return this.from_point_name;
	}
	public void setStarting_location(String starting_location) {
		this.from_point_name = starting_location;
	}
	public String getStarting_time() {
		return departure_time;
	}
	public void setStarting_time(String starting_time) {
		this.departure_time = starting_time;
	}
	public String getEnding_location() {
		return to_point_name;
	}
	public void setEnding_location(String ending_location) {
		this.to_point_name = ending_location;
	}
	public String getEnding_time() {
		return arrival_time;
	}
	public void setEnding_time(String ending_time) {
		this.arrival_time = ending_time;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance_desc() {
		return distance_desc;
	}
	public void setDistance_desc(String distance_desc) {
		this.distance_desc = distance_desc;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
