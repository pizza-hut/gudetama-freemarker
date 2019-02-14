package org.gudetama;

//import freemarker.cache.WebappTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.io.font.FontProgramFactory;
//import com.itextpdf.io.source.
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;

@Service
public class TemplateService {
	
    @Autowired
    private Configuration freemarkerConfig;
    
    @Autowired 
    private ServletContext context;
    
    @Autowired
    private URLTemplateLoader urlTemplateLoader;
    
    public String testMyTemplate(FormModel formModel) throws TemplateNotFoundException, 
    MalformedTemplateNameException, ParseException, IOException, TemplateException {
    	
    	String output;
    	    	
    	freemarkerConfig.setTagSyntax(Configuration.SQUARE_BRACKET_TAG_SYNTAX);
    	freemarkerConfig.setTemplateLoader(urlTemplateLoader);
    	//WebappTemplateLoader templateLoader = new WebappTemplateLoader(servletContext, "WEB-INF/templates");
    	//templateLoader.setURLConnectionUsesCaches(false);
    	//templateLoader.setAttemptFileAccess(false);
    	//freemarkerConfig.setTemplateLoader(templateLoader);
    	//freemarkerConfig.setServletContextForTemplateLoading(this.context, "http://localhost:8080/template/");
    	String templateString = formModel.getTemplateHTML();
    	Template t = new Template("testTemplate", new StringReader(templateString), freemarkerConfig);
    	Map<String, Object> map = new HashMap<String, Object>();
        map.put("templateData", formModel.getTemplateData());
    	System.out.println(map.values().toString());
    
    	output = FreeMarkerTemplateUtils.processTemplateIntoString(t, map);	
    	    			
    	return output;
    	
    }

	public String testMyTemplate(String templateHTML, HashMap<String, Object> dataModel) throws Exception {
		
		freemarkerConfig.setTagSyntax(Configuration.SQUARE_BRACKET_TAG_SYNTAX);
		
		String output;    	
    	
    	Template t = new Template("testTemplate", new StringReader(templateHTML), freemarkerConfig);
    	
    	System.out.println(dataModel.values().toString());    	
    	output = FreeMarkerTemplateUtils.processTemplateIntoString(t, dataModel);
    	System.out.println(output);
    	createPDF(output);
    	return output;
	}
	
    
	public void createPDF(String input) throws Exception {
		//FontProgramFactory.registerFont("c:/windows/fonts/times.ttf", "times new roman");
		//PdfFont timesnewromanFont = PdfFontFactory.createRegisteredFont("times new roman");
		//FontProgramFactory.registerSystemFontDirectories();
		//ConverterProperties properties = new ConverterProperties();
	    //properties.setFontProvider(new DefaultFontProvider(true, true, true));		
		HtmlConverter.convertToPdf(input, new FileOutputStream("d:\\html"+ System.currentTimeMillis()+".pdf"));
		
	}
    
}
