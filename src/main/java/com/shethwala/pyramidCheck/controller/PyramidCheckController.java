package com.shethwala.pyramidCheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shethwala.pyramidCheck.exception.InputDataValidationException;
import com.shethwala.pyramidCheck.models.PyramidCheckResponse;
import com.shethwala.pyramidCheck.service.PyramidCheckService;
import com.shethwala.pyramidCheck.validator.PyramidCheckValidator;

@RestController
public class PyramidCheckController {
	
	@Autowired
	PyramidCheckService pyramidCheckService;
	
	@RequestMapping(value = "/pyramidCheck/{word}", method = RequestMethod.GET)
	@ResponseBody
	public PyramidCheckResponse index(
			@PathVariable String word) throws InputDataValidationException {
		
		// Validate if the input word only contains alphabet. If not, it will throw user friendly exception
		PyramidCheckValidator.validateInput(word);
		
		return pyramidCheckService.checkPyramid(word);
	}

}
