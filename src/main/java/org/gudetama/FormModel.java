package org.gudetama;

import java.util.Map;

public class FormModel {
	
	private String templateHTML;
	
	private Map<String, Object> templateData;

	public String getTemplateHTML() {
		return templateHTML;
	}

	public void setTemplateHTML(String templateHTML) {
		this.templateHTML = templateHTML;
	}

	public Map<String, Object> getTemplateData() {
		return templateData;
	}

	public void setTemplateData(Map<String, Object> templateData) {
		this.templateData = templateData;
	}
	

}
