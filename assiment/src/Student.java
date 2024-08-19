public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private String major;
    private int score;

    public Student(){
        this.id="123122";
        this.firstname="someone";
        this.lastname="anyone";
        this.major="non-major";
        this.score=0;
    }
    public Student(String id, String fanem, String lname ){
        this.id=id;
        this.firstname=fanem;
        this.lastname=lname;
        this.major = "non major";
        this.score=0;
    }
    public String getid(){
        return this.id;
    }
    public void setid(String newid){
        this.id=newid;
    }
    public String getfirstname(){
       return this.firstname;
    }
    public void setfirstname(String name){
        this.firstname = name;
    }
    public String getlastname(){
        return this.lastname;
    }
    public void setlastname(String namo){
        this.lastname = namo;
    }
    public String getMajor(){
        return this.major;
    }
    public void setMajor(String newm){
        this.major=newm;
    }
    public int getScore(){
        return this.score;
    }
    public boolean setScoore(int score){
        if(score<0 || score>100){
            return false;
        }else{
            this.score=score;
            return true;
        }
    }
    public String calcualteGrade(){
        if(score>=90){
            return"A";
        }else if(score >= 80){
            return"B";
        }else{
            return"F";
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %d ",
                this.id,this.firstname,this.lastname,this.major,this.score);
    }

}
