package org.gudetama;

import java.io.IOException;

import org.gudetama.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
public class ApiController {
	
	@Autowired
	TemplateService templateService;
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/generateTemplateForm", method=RequestMethod.POST)
	public ResponseEntity<String> generateTemplateForm(@ModelAttribute TemplateModel model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		System.out.println(model.getMyString());
		//System.out.println(model.getMyBool().toString());
		String output;
		output = templateService.generateTemplateUsingObject(model);				
			
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="generateTemplateObject", method=RequestMethod.POST)
	public ResponseEntity<String> generateTemplateObject(@RequestBody TemplateModel model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		System.out.println(model.getMyString());
		//System.out.println(model.getMyBool().toString());
		String output;
		output = templateService.generateTemplateUsingObject(model);				
		return new ResponseEntity<String>(output, HttpStatus.OK);		
	}
	
	@PostMapping(value="generateTemplateMap")
	public ResponseEntity<String> generateTemplateMap(@RequestBody TemplateModel model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		String output;
		output = templateService.generateTemplateUsingObject(model);				
		return new ResponseEntity<String>(output, HttpStatus.OK);	
	}

}
