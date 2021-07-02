package com.demojunit;

/**
 * Analyze Mood happy or sad
 *
 */
public class MoodAnalyzer {

	 String message;

	    public MoodAnalyzer(String message) {
	        this.message = message;
	    }
	    MoodAnalyzer(){
	    }

	    public String analyseMood() {
	        if (message.toLowerCase().contains("sad")){
	            return "SAD";
	        }
	        if (message.toLowerCase().contains("happy")){
	            return "SAD";
	        }
	        if (message.toLowerCase().contains("any")){
	            return "HAPPY";

	        }else
	            return "HAPPY";
	        }
}
