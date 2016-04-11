public class course extends IB{
  
  public enum course{SL, HL};
  
  
  private Type science;
  private Type literature;
  
  public Student(String course, String cas, String tok, Type science, Type literature){
  super(course, cas, tok);
  this.science = science;
  this.literature = literature;}
  
  public Grade getScience(){return this.science;}
  public int getLiterature(){return this.literature;}
  
}