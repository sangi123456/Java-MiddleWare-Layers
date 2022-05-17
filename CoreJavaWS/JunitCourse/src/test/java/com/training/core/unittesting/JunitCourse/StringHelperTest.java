package com.training.core.unittesting.JunitCourse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.training.core.unittesting.StringHelper;

    public class StringHelperTest {
    	
    	 //AACD => CD ACD => CDEF=> CDEF CDAA => CDAA
    	
    	 //CREATE instance
  	  StringHelper helper ;
  	  
  	  @Before 
  	  public void before() {
  		  helper = new StringHelper();
  	  }
  	  
  	  @Test
     public void testTruncateAInFirst2Positions_AinFirst2Positions() {
    	   assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
      }
    	
       @Test
      public void testareFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){	
    	 assertFalse(
    			 helper.areFirstAndLastTwoCharactersTheSame("ABCD"));	
          //expected, actual
       }
       
     //ABCD => false, ABAB => True, AB => true, A => false
      
       @Test
       public void testareFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
    	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
       }
       
       }
   
    	
    
      
      
      

