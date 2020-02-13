package com.shethwala.pyramidCheck.service;

import org.springframework.stereotype.Component;

import com.shethwala.pyramidCheck.models.PyramidCheckResponse;

@Component
public interface PyramidCheckService {
	
	public PyramidCheckResponse checkPyramid(String word);

}
