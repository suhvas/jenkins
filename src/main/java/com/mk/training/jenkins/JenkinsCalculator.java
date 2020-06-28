package com.mk.training.jenkins;

public class JenkinsCalculator {
	//Method to add 2 numbers
	public int addNumbers(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
	
	//Method 2 subtract 2 numbers
	public int subtractNumbers(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	public static void main(String[] args){
		JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();
		System.out.println(jenkinsCalculator.addNumbers(5, 9));
	}

}
