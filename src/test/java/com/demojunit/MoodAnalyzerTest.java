package com.demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest 
{
    @Test
    public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad(){
    	MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyseMood("sad Mood");
        //assertTrue( true );
        Assertions.assertEquals("SAD", mood);
    }
  
   @Test
    public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy(){
	   MoodAnalyzer moodAnalyser = new MoodAnalyzer();
	   String mood = moodAnalyser.analyseMood("happy Mood");
       Assertions.assertEquals("HAPPY", mood);
    }
   

}


