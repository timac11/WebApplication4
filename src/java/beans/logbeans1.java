package beans;
import logic.Problem;
import logic.controlusers;
import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.IOException;
import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.helpers.DefaultHandler; 
import org.xml.sax.*; 
import javax.xml.parsers.SAXParserFactory; 
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.Arrays ;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
@ManagedBean
@SessionScoped
public class logbeans1{
private String name;
private String password;
private boolean r;
public ArrayList<Problem> problems = new ArrayList<Problem>()
 ;

int i;
public controlusers c  = new controlusers();
public logbeans1 () throws ParserConfigurationException, SAXException, IOException{
c=new controlusers();
i=c.i;
r=true;
}

public void setName (String name){
this.name = name;
} 
public String getName(){return name;}
public void setPassword (String password){
this.password =password;
}
public String getPassword()
{return password;}
public String check(){
    for(int j=0;j<i;j++){
    if ((this.name.equals(c.aa[j])) && (this.password.equals(c.bb[j])))
        r=false;}
    if (r==false)    
    return "quiz";
            else return "nosuccess";
}
}