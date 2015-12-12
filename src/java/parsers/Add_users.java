package parsers;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class Add_users {
public String s1="";
public String s2="";
public String s3="";
public String s4="";
    public Add_users(String c1,String c2,String c3,String c4) {
           s1=c1;
           s2=c2;
	   s3=c3;
           s4=c4;
           try {
		String filepath = "C:/Users/aser 2014/Documents/NetBeansProjects/WebApplication4/newXMLDocument.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);

		// Get the root element
		Node company = doc.getFirstChild();

		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		// Node staff = company.getFirstChild();

		Element age = doc.createElement("user");
		Element name = doc.createElement("name");
                Element password = doc.createElement("password"); 
                Element surname = doc.createElement("surname");
                Element login = doc.createElement("login");
                name.appendChild(doc.createTextNode(s1));
		password.appendChild(doc.createTextNode(s2));
                surname.appendChild(doc.createTextNode(s3));
                login.appendChild(doc.createTextNode(s4));
                age.appendChild(name);
                age.appendChild(surname);
	        age.appendChild(login);
                age.appendChild(password);
                company.appendChild(age);

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(filepath));
		transformer.transform(source, result);

		System.out.println("Done");

	   } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   } catch (TransformerException tfe) {
		tfe.printStackTrace();
	   } catch (IOException ioe) {
		ioe.printStackTrace();
	   } catch (SAXException sae) {
		sae.printStackTrace();
	   }
	}
}

