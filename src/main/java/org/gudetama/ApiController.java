package org.gudetama;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.gudetama.TemplateService;

import org.apache.commons.io.IOUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
public class ApiController {
	
	@Autowired
	TemplateService templateService;
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value="/api/lead", method=RequestMethod.POST)
	public ResponseEntity<CompositeResponse> getLead(@ModelAttribute CompositeRequest compositeRequest){
		
		CompositeResponse compositeResponse = new CompositeResponse();
		
		compositeResponse.setHttpStatusCode(201);
		CompositeResponseBody body = new CompositeResponseBody();
		body.setTotalSize(1);
		body.setSuccess(true);
		body.setId("id-1");
				
		return new ResponseEntity<CompositeResponse>(compositeResponse, HttpStatus.OK);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/services/data/v43.0/composite", method=RequestMethod.POST)
	public ResponseEntity<String> patchAccounts(String body) {
        URL url = Resources.getResource("sample.json");
        System.out.println(url.toString());
        try {
            String json= Resources.toString(url, Charsets.UTF_8);
            System.out.println("sample.json: " + json);
            return new ResponseEntity(json,HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
	/*
	public ResponseEntity<CompositeResponseObject> patchAccounts(CompositeRequestObject body) {
	        URL url = Resources.getResource("sample.json");
	        CompositeResponse compositeResponse = new CompositeResponse();
	        compositeResponse.setHttpStatusCode(201);
	        try {
	            String json= Resources.toString(url, Charsets.UTF_8);
	        	
	            ObjectMapper objectMapper = new ObjectMapper();
	            
	            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	            objectMapper.readValue(json, CompositeResponse.class);
	            
	            //File file = ResourceUtils.getFile("classpath:sample.json");
	            //objectMapper.writeValue(file, compositeResponse);
	            return new ResponseEntity<CompositeResponse>(compositeResponse, HttpStatus.OK);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	*/
	@RequestMapping(value="/services/data/v43.0/composite", method=RequestMethod.GET)
	public ResponseEntity<StubModel> getStub(){
		
		StubModel stub = new StubModel();
		stub.setStubId("demoId");
		stub.setStubName("demoName");
		stub.setStubDescription("stubDescription");
		
		return new ResponseEntity<StubModel>(stub, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/testMyTemplate", method=RequestMethod.POST)
	public ResponseEntity<String> testMyTemplate(@ModelAttribute FormModel formModel) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		
		String output;
		output = templateService.testMyTemplate(formModel);		
			
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
	
	@RequestMapping(value="/testMyTemplateJSON", method=RequestMethod.POST)
	public ResponseEntity<String> testMyTemplateJSON(@RequestParam String templateHTML, @RequestParam String templateModelJSONString) throws Exception {
		
		String output = templateModelJSONString;
		
		//String emailTo = "soon_lung_pong@manulife.com";
		
		System.out.println(templateModelJSONString);
		
		ObjectMapper mapper = new ObjectMapper();
				
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		
		map = mapper.readValue(templateModelJSONString, new TypeReference<Map<String, Object>>(){});
		System.out.println(map);
				
		output = templateService.testMyTemplate(templateHTML, map);
		
		//add send email to myself, hard code email address and smtp for demo
		
		Mail mail = new Mail();
		mail.setMailFrom("acmepongg@gmail.com");
		mail.setMailTo("soon_lung_pong@manulife.com");
		mail.setMailCc("soon_lung_pong@manulife.com");
		mail.setMailSubject("Spring Boot - Email with FreeMarker template");

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("firstName", "Ned");
		model.put("lastName", "Flanders");
		model.put("location", "Springfield");
		model.put("signature", "nedflanders");
		model.put("message", output);
		mail.setModel(model);
		mail.setMailContent(output);
		//emailService.sendEmail(mail);
		
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}

	@RequestMapping(value="/image.gif", method=RequestMethod.GET, produces=MediaType.IMAGE_GIF_VALUE)
	public @ResponseBody byte[] track(@RequestParam String action, String tid, String jid) throws IOException {
		
		System.out.println(action + " " + tid + " " + jid);
		
		InputStream in = getClass().getResourceAsStream("/static/image.gif");
		System.out.println(in.toString());		
		
		// <img src="https://<host>/image.gif?emailId=1234&action=open&jobId=12345">
		
		return IOUtils.toByteArray(in);		
	}
	
	@RequestMapping(value="/template/{id}", method=RequestMethod.GET)
	public ResponseEntity<String> getTemplate(@PathVariable("id") String id, HttpServletResponse response) {
		String templateOne = "<html><h1>Hello World</h1><p>Spring Boot is good.</p></html>";
		String templateTwo = "<html>Bye World</html>";
		String templateResponse = "";
		response.setHeader("Content-Type", "text/html");
		if (id=="templateOne") {
			templateResponse = templateOne;
		} else {
			templateResponse = templateTwo;
		}
		
		return new ResponseEntity<String>(templateResponse, HttpStatus.OK);		
	}
	
	@RequestMapping(value="/css/{id}", method=RequestMethod.GET)
	public ResponseEntity <String>getCSS(@PathVariable String id, HttpServletResponse response) {
		String cssOne = "body {background-color: powderblue;}h1{color: blue;}p{color: red;}";
		//String cssTwo = "body {background-color: powderblue;}h1{color: blue;}p{color: green;}";
		response.setHeader("Content-Type", "text/css");
		
		return new ResponseEntity<String>(cssOne, HttpStatus.OK);
		
	}
	
	
	
	
}
