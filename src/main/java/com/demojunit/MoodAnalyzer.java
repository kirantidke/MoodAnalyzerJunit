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

	public String analyseMood() throws MoodAnalyzerException {
		try {
			if (message.equals(null)) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.NULL_POINTER_EXCEPTION);
			} else if (message.isEmpty()) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionTypes.EMPTY_STRING_EXCEPTION);
			}
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			
			return "HAPPY";
		} catch (Exception e) {
			e.printStackTrace();
			
			return "HAPPY";
		}
	}
}
