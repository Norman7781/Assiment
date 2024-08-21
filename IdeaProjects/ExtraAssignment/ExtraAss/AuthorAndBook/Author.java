package AuthorAndBook;

public class Author {
    private String name;
    private String email;
    private char gender;
    public static int count =0;

    public Author(String name, String email,char gender){
        this.name = name;
        this.email = email;
        this.gender= gender;
        count++;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return ("Name :"+ this.getName()+"\n"+"Email :"+this.getEmail()+"\n"+"Gender :"+this.getGender()+"\n");
    }
}
