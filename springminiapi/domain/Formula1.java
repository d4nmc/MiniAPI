package com.natwest.springminiapi.domain;

public class Formula1 {
	
		private String country;
		private String trackName;
		private double trackLength;
		private boolean streetTrack;
		private int noOfLaps;
		private int rating;
		
		public Formula1() {
			
		}
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTrackName() {
			return trackName;
		}
		public void setTrackName(String trackName) {
			this.trackName = trackName;
		}
		public double getTrackLength() {
			return trackLength;
		}
		public void setTrackLength(double trackLength) {
			this.trackLength = trackLength;
		}
		public boolean isStreetTrack() {
			return streetTrack;
		}
		public void setStreetTrack(boolean streetTrack) {
			this.streetTrack = streetTrack;
		}
		public int getNoOfLaps() {
			return noOfLaps;
		}
		public void setNoOfLaps(int noOfLaps) {
			this.noOfLaps = noOfLaps;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public Formula1(String country, String trackName, double trackLength, boolean streetTrack, int noOfLaps,
				int rating) {
			super();
			this.country = country;
			this.trackName = trackName;
			this.trackLength = trackLength;
			this.streetTrack = streetTrack;
			this.noOfLaps = noOfLaps;
			this.rating = rating;
		}
		
		
		
}
