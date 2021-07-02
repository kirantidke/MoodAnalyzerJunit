package com.demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("sad Mood");
		String mood = moodAnalyser.analyseMood();
		// assertTrue( true );
		Assertions.assertEquals("SAD", mood);
	}

	@Test
	public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}
	 @Test
	    public void givenHappyMessage_WhenAnalysed_Message_ShouldReturnSad(){
		 MoodAnalyzer moodAnalyser = new MoodAnalyzer(" happy Mood");
	        String mood = moodAnalyser.analyseMood();
	        Assertions.assertEquals("SAD", mood);
	    }

}
