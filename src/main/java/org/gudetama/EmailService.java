package org.gudetama;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
    @Autowired
    private JavaMailSender sender;
	
	public void sendEmail(Mail mail) throws Exception {
		MimeMessage message = sender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message);
      
        // Using a subfolder such as /templates here
        //freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/templates");
        
        //Template t = freemarkerConfig.getTemplate("email-template.ftl");
        //String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, mail.getModel());

        //helper.setTo(emailTo);
        //helper.setText(content, true);
        //helper.setSubject("Test:gudetama freemarker test email");
        
        helper.setTo(mail.getMailTo());
        helper.setText(mail.getMailContent(), true);
        helper.setSubject(mail.getMailSubject());
        

        sender.send(message);

        sender.send(message);
	}

}
