package org.gudetama;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

@SuppressWarnings("unused")
@Service
public class TemplateService {
	
    @Autowired
    private Configuration freemarkerConfig;
    
    public String generateTemplateUsingMap(Map<String, Object> model) throws TemplateNotFoundException, 
    	MalformedTemplateNameException, ParseException, IOException, TemplateException {
    	String output;
    	        
        freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/templates");
        
        Template t = freemarkerConfig.getTemplate("email-template.ftl");
        output = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
            	
    	return output;
    	
    }
    
    public String generateTemplateUsingObject(TemplateModel templateModel) throws TemplateNotFoundException, 
	MalformedTemplateNameException, ParseException, IOException, TemplateException {
	String output;
	    
    freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/templates");
    
    Template t = freemarkerConfig.getTemplate("email-template.ftl");
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("templateModel", templateModel);
    System.out.println(map.toString());
    output = FreeMarkerTemplateUtils.processTemplateIntoString(t, map);
        	
	return output;
	
    } 

}
