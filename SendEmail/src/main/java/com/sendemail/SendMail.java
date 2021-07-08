package SendEmail.src.main.java.com.sendemail;
// https://pepipost.com/tutorials/send-email-in-java-using-gmail-smtp
/**
 * The Properties class represents a persistent set of properties.
 * The Properties can be saved to a stream or loaded from a stream.
 */
import java.util.Properties;
/**
 * This class models an email message. To send a message, subclass of Message (e.g. MimeMessage) is instantiated, 
 * the attributes and content are filled in, and message is sent using the Transport send method
 */
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
/**
 * MIME style là gì??
 */
import javax.mail.internet.MimeMessage;
public class SendMail {

	public static void main(String[] args) {
		// Recipient's email ID  needs to be mentioned
		String to = "aquafina9416@gmail.com";
		// Sender's email ID needs to be mentioned
		String from = "nevarda9416@gmail.com";
		String host = "smtp.gmail.com";
		Properties properties = System.getProperties();
		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("nevarda9416@gnmail.com", "transilvania9416");			
			}
		});
		session.setDebug(true);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("This is the Subject Line!");
			message.setContent("<h1>This is actual message embedded in HTML tags</h1>", "text/html");
			System.out.println("Sending...");
			Transport.send(message);
			System.out.println("Sent message successfully...");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("Send email 2");
	}

}
