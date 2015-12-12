package logic;
import parsers.showusers;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
public class controlusers {
    public String [] aa= new String[100];
public String [] bb = new String [100];
public int i;
public int k;
    public controlusers () throws SAXException, IOException, ParserConfigurationException{
    SAXParserFactory factory = SAXParserFactory.newInstance(); 
SAXParser parser = factory.newSAXParser(); 
showusers saxp =new showusers(); 
parser.parse("C:/Users/aser 2014/Documents/NetBeansProjects/WebApplication4/newXMLDocument.xml", saxp);
aa=saxp.a;
bb=saxp.b;
i=saxp.i;
} 
}
