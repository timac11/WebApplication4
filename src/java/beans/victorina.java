package beans;
import logic.Problem;
import logic.add;
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
/**
 *
 * @author aser 2014
 */

@ManagedBean
@SessionScoped
public class victorina {
private int scores;
private int number;
private String response ="";
private String answer;
private  int current;
private int qual;
private String ag;
public String [] aa= new String[100];
public String [] bb = new String [100];
public int i;
public int k;
public add q=new add();
public victorina () throws ParserConfigurationException, SAXException, IOException{
i=q.i;
for (int j=0;j<i;j++)
{problems.add(new Problem(q.aa[j],q.bb[j]));
}
}
public void setAnswer(String S){
    answer=S;
}
public String getAg(){
    return this.ag;
}
public void setAg(String value){
    this.ag=value;
}
public int getScores (){
    return scores;
}
public int getNumber (){
    return number;
}   
public String getAnswer (){
    return answer;
}
public String getResponse (){
    return response;
}
public void setResponse (String value){
   this.response=value;
}
public String getQuestion (){
    return problems.get(current).getQuestion();
}

public ArrayList<Problem> problems = new ArrayList<Problem>();//Arrays.asList(    
  //new Problem("Would yoi like to go away?","YES")
      
// ));

public String answerAction(){
    number++;
    if(number==2) return "endofquiz.xhtml";
    if(current>=problems.size()) return "endofquiz.xhtml"; else
    if  ((problems.get(current).isCorrect(response))){
        scores++;
         if (current+1>=problems.size()) return "endofquiz.xhtml";
        nextProblem();
        return "quiz.xhtml";
    }
    else if (number==1) return "again.xhtml";
    else {
        if (current==problems.size()) return "endofquiz.xhtml";
        nextProblem();
        
        return "quiz.xhtml";
}
}
  
 public String startOverAction(){
        Collections.shuffle(problems);
        current=0;
        number=0;
        scores=0;
        response="";
        return "quiz";
    }
  public void nextProblem(){
      current++;
      if(current<problems.size()) answer=problems.get(current).getAnswer();
      number=0;
      response="";
  
}

/**
     * Creates a new instance of victorina
     */
   
// подключение базы данных с вопросами 

    
}
