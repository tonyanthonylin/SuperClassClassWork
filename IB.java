public class IB{
  public enum Level{COURSE, NONCOURSE};
 
  public String course;
  public String cas;
  public String tok;
  
   public IB(String course, String cas, String tok){
    this.course = course;
    this.cas = cas;
    this.tok = tok;
  }
  public String getCourse(){return this.course;}
  public Sting getCas(){return this.cas;}
  public String getTok(){return this.tok;}
  
}