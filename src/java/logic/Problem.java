package logic;

import java.io.Serializable;
public class Problem implements Serializable {
    public String answer;
    public String question;
    public Problem(String[] s1,String[] s2,int j){
        for (int k=0;k<j;k++){
            new Problem(s1[k],s2[k]);
        }
        
    }
    public Problem(String question,String answer){
        this.answer=answer;
        this.question=question;
    }
   public String getAnswer(){
       return answer;
   }
  public String getQuestion(){
      return question;
  }
  public void setAnswer(String s){
     this.answer=s;
  }
  public void setQuestion(String s){
      this.question=s;
  }
  public boolean isCorrect(String response){
  return response.trim().equalsIgnoreCase(answer);
 }
}
