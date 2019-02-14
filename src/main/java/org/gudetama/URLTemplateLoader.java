package org.gudetama;

import java.io.IOException;
import java.io.Reader;

import org.springframework.stereotype.Component;

import freemarker.cache.TemplateLoader;

@Component
public class URLTemplateLoader implements TemplateLoader {

	@Override
	public Object findTemplateSource(String name) throws IOException {
		// TODO Auto-generated method stub
		String urlTemplate = "<html><i>Hello</i>, $[templateData.Header]</html>";
		return urlTemplate;
	}

	@Override
	public long getLastModified(Object templateSource) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Reader getReader(Object templateSource, String encoding) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeTemplateSource(Object templateSource) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public String getURL(String name) throws IOException {
		System.out.println(name);
		return "http://localhost:8080/template/templateOne";
		// TODO Auto-generated method stub
		
	}

}
