package com.shethwala.pyramidCheck.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.shethwala.pyramidCheck.models.PyramidCheckResponse;
import com.shethwala.pyramidCheck.service.PyramidCheckService;

@Service
public class PyramidCheckServiceImpl implements PyramidCheckService {
	
	@Override
	public PyramidCheckResponse checkPyramid(String inputWord) {
		
		PyramidCheckResponse pyramidCheckResponse = new PyramidCheckResponse();
			
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	    char[] wordCharArray = inputWord.toCharArray();
	    
	    int numberofKeysTotal = 0;
	    int valueTotal = inputWord.length();
	        
	    for (char c : wordCharArray)
	    {
	        if(map.containsKey(c))
	        	map.put(c, map.get(c)+1);
	        else
	        	map.put(c, 1);
	    }
	    
	    int numberOfKeys = map.size();
	    
	    for(int i=numberOfKeys; i>0; i--) {
	    	numberofKeysTotal += i;
	    }
	    
	    boolean isPyramid = numberofKeysTotal == valueTotal;
	    
	    pyramidCheckResponse.setWord(inputWord);
	    pyramidCheckResponse.setPyramid(isPyramid);
		
		return pyramidCheckResponse;
	}

}
