package parsers;

import org.xml.sax.helpers.DefaultHandler; 
import org.xml.sax.*; 
 
public class Checking_login  extends DefaultHandler {
String thisElement = ""; 
String res_name=""; 
public boolean b;
 
public Checking_login(String s){
res_name =s;
b=false;
}
public void startDocument() throws SAXException { 
  System.out.println("Start parse XML..."); 
} 
 
@Override 
public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
  thisElement = qName;  
} 
 
@Override 
public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
  thisElement = ""; 
} 
 
@Override 
public void characters(char[] ch, int start, int length) throws SAXException { 

    if (thisElement.equalsIgnoreCase("login")) { 
    if (res_name.equalsIgnoreCase(new String(ch,start,length) )){
        b=true;
  } 
  
} 
}
@Override 
public void endDocument() { 
  System.out.println("Stop parse XML..."); 
} 
} 

