package com.shethwala.pyramidCheck.models;

public class PyramidCheckResponse {
	
	private String word;
	private boolean isPyramid;
	
	public String getInputValue() {
		return word;
	}
	public void setInputValue(String inputValue) {
		this.word = inputValue;
	}
	public boolean isPyramid() {
		return isPyramid;
	}
	public void setPyramid(boolean isPyramid) {
		this.isPyramid = isPyramid;
	}
	
}
