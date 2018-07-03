package org.gudetama;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import java.util.Map;

import org.gudetama.TemplateService;

import org.apache.commons.io.IOUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
public class ApiController {
	
	@Autowired
	TemplateService templateService;
	
	
	@RequestMapping(value="/testMyTemplate", method=RequestMethod.POST)
	public ResponseEntity<String> testMyTemplate(@ModelAttribute FormModel formModel) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		
		String output;
		output = templateService.testMyTemplate(formModel);		
			
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
	
	@RequestMapping(value="/testMyTemplateJSON", method=RequestMethod.POST)
	public ResponseEntity<String> testMyTemplateJSON(@RequestParam String templateHTML, @RequestParam String templateModelJSONString) throws Exception {
		
		String output = templateModelJSONString;
		System.out.println(templateModelJSONString);
		
		ObjectMapper mapper = new ObjectMapper();
				
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map = mapper.readValue(templateModelJSONString, new TypeReference<Map<String, Object>>(){});
		System.out.println(map);
				
		output = templateService.testMyTemplate(templateHTML, map);		
				
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}

	@RequestMapping(value="/image.gif", method=RequestMethod.GET, produces=MediaType.IMAGE_GIF_VALUE)
	public @ResponseBody byte[] track(@RequestParam String action, String tid, String jid) throws IOException {
		
		System.out.println(action + " " + tid + " " + jid);
		
		InputStream in = getClass().getResourceAsStream("/static/image.gif");
		System.out.println(in.toString());
		
		
		return IOUtils.toByteArray(in);		
	}
	
	
	
	
	
}
