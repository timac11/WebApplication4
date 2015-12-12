package parsers;
import org.xml.sax.helpers.DefaultHandler; 
import org.xml.sax.*; 

public class showusers extends DefaultHandler {
String thisElement = ""; 
//String res_name=""; 
public  int i;
//boolean b;
public String[]  a=new String [100]; 
public String[]  b =new String[100];
String teg1;
String teg2;
//public showquest(){
//i=0;
//}
public showusers(){
i=0;    
}
public void startDocument() throws SAXException { 
  System.out.println("Start parse XML..."); 
} 
 
public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
  thisElement = qName;  
} 
 
public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
  thisElement = ""; 
} 
public void characters(char[] ch, int start, int length) throws SAXException { 

    if (thisElement.equalsIgnoreCase("Login")) { 
    a[i]=new String(ch,start,length) ;
    }
    if (thisElement.equalsIgnoreCase("password")){
        b[i]=new String(ch,start,length) ;
        i++;
    }
}
public void endDocument() { 
  System.out.println("Stop parse XML..."); 
  System.out.println (a);
}     
}