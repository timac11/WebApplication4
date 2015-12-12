import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
@Named
@SessionScoped
public class LogBeans implements Serializable {
private String name;
private String password;

private void setName (String name){
this.name = name;
} 

public String getName(){return this.name;}
private void setPassword (String password){
this.password =password;
}

public String check(){
if ((this.name=="Admin") && (this.password=="123"))
    return "quiz";
            else return "nosuccess";
}



}
