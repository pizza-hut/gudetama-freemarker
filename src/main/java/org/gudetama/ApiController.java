package org.gudetama;

import java.io.IOException;

import org.gudetama.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@RestController
public class ApiController {
	
	@Autowired
	TemplateService templateService;
	
	@PostMapping(value="generateTemplateObject")
	public String generateTemplateObject(@RequestBody TemplateModel model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		System.out.println(model.getMyString());
		//System.out.println(model.getMyBool().toString());
		String output;
		output = templateService.generateTemplateUsingObject(model);				
		return output;		
	}
	
	@PostMapping(value="generateTemplateMap")
	public String generateTemplateMap(@RequestBody TemplateModel model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		String output;
		output = templateService.generateTemplateUsingObject(model);				
		return output;	
	}

}
