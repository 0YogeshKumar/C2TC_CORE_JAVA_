package com.example.inheritance.multilevel;

public class State extends Country{
	private String stateName;
	private String stateCapital;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateCapital=" + stateCapital + ", getCountryName()="
				+ getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	

}
