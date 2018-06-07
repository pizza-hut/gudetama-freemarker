package org.gudetama;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

@SuppressWarnings("unused")
@Service
public class TemplateService {
	
    @Autowired
    private Configuration freemarkerConfig;
    
    public String testMyTemplate(FormModel formModel) throws TemplateNotFoundException, 
    MalformedTemplateNameException, ParseException, IOException, TemplateException {
    	
    	String output;
    	
    	String templateString = formModel.getTemplateHTML();
    	Template t = new Template("testTemplate", new StringReader(templateString), freemarkerConfig);
    	Map<String, Object> map = new HashMap<String, Object>();
        map.put("templateData", formModel.getTemplateData());
    	System.out.println(map.values().toString());    	
    	output = FreeMarkerTemplateUtils.processTemplateIntoString(t, map);	
    	    			
    	return output;
    	
    }
    
    
}
