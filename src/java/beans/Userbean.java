package beans;
import parsers.Add_users;
import parsers.Checking_login;
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
@ManagedBean
@SessionScoped


public class Userbean {
private String name;
private String password;
private String nickname;
private String sname;
private String mail;
private String spassword;

public String getName(){
    return name;
}
public String getNickname(){
    return nickname;
}
public String getMail(){
    return mail;
}    
public String getSname(){
    return sname;
}
public String getPassword(){
    return password;
}
public String getSpassword(){
    return spassword;
}
public void setNickname(String s){
    nickname=s;
}
public void setName(String s){
    this.name=s;
}
public void setSname(String s){
    this.sname=s;
}    
public void setSpassword (String s){
    this.spassword=s;
}
public void setPassword(String s){
    this.password=s;
}
public void setMail (String s){
    this.mail=s;
}
public String Check_create_user() throws ParserConfigurationException, SAXException, IOException{
SAXParserFactory factory = SAXParserFactory.newInstance(); 
SAXParser parser = factory.newSAXParser(); 
Checking_login saxp = new Checking_login(this.nickname); 
parser.parse("C:/Users/aser 2014/Documents/NetBeansProjects/WebApplication4/newXMLDocument.xml", saxp);
if(saxp.b==true) return "index";
else {
    Add_users a = new Add_users(this.name,this.password,this.sname, this.nickname);
    return "quiz";
}
}
}
