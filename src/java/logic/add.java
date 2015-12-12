package logic;

import parsers.showquest;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public  class add {
public String [] aa= new String[100];
public String [] bb = new String [100];
public int i;
public int k;
    public add () throws SAXException, IOException, ParserConfigurationException{
    SAXParserFactory factory = SAXParserFactory.newInstance(); 
SAXParser parser = factory.newSAXParser(); 
showquest saxp =new showquest(); 
parser.parse("C:/Users/aser 2014/Documents/NetBeansProjects/WebApplication4/base_of_questions.xml", saxp);
aa=saxp.a;
bb=saxp.b;
i=saxp.i;
}    
}
