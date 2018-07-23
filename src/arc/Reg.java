
package arc;


public class Reg {
    private String Name;
    private String Surname;
    private String Username;
    private String password;
    private String grade;
    public Reg(String pName,String pSurname,String pUsername,String ppassword,String pgrade)
    {
        this.Name =pName;
        this.Surname=pSurname;
        this.Username=pUsername;
        this.password=ppassword;
        this.grade=pgrade;
        
    }
    public String getName(){
        return Name;
    }
    public String getSurname(){
        return Surname;
    }
   public String getUsername(){
        return Username;
    }
    public String getpassword(){
        return password;
    }
    public String getgrade(){
        return grade;
    }
    
}
