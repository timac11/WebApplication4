package logic;

import java.io.Serializable;
public class Name1 implements Serializable {
    private String first;
    private String last;
    public Name1 (String first,String last){
      this.first=first;
      this.last=last;
    }
    public void setFirst (String newValue){
    this.first=newValue;
    }
    public String getFirst(){
    return this.first;
    }
    public void setLast(String newValue){
    this.last=newValue;
    }
    public String getLast(){
    return this.last;
    }
}
