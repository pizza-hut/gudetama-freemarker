package org.gudetama;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.itextpdf.html2pdf.HtmlConverter;
//import com.itextpdf.io.source.

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

	public String testMyTemplate(String templateHTML, HashMap<String, Object> dataModel) throws Exception {
		String output;    	
    	
    	Template t = new Template("testTemplate", new StringReader(templateHTML), freemarkerConfig);
    	
    	System.out.println(dataModel.values().toString());    	
    	output = FreeMarkerTemplateUtils.processTemplateIntoString(t, dataModel);
    	System.out.println(output);
    	createPDF(output);
    	return output;
	}
    
	public void createPDF(String input) throws Exception {
	    
		HtmlConverter.convertToPdf(input, new FileOutputStream("d:\\html.pdf"));
		
		/*
		Document document = new Document();
	    
	    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("d:\\html.pdf"));
	    document.open();
	    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
	    XMLWorkerHelper.getInstance().parseXHtml(writer, document, in);
	    //XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(""));
	    document.close();
	    
	    HtmlConverter
	    
		
		/*
		String k = "<html><body> This is my Project </body></html>";
	    OutputStream file = new FileOutputStream(new File("D:\\Test.pdf"));
	    Document document = new Document();
	    PdfWriter.getInstance(document, file);
	    document.open();
	    HTMLWorker htmlWorker = new HTMLWorker(document);
	    htmlWorker.parse(new StringReader(k));
	    document.close();
	    file.close();
	    */
	}
    
}
