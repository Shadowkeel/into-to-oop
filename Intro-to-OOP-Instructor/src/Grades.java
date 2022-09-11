public class Grades {
    private String name;
    private String course;
    private int grade;
    public Grades(String name,String course,int grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }
    public String getName(){
        return this.name;
    }
    public String getCourse(){
        return this.course;
    }
    public int getGrade(){
        return this.grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public String passGrade(){
        if (this.grade>59){
           return  "the student "+this.name+" passed with grade:"+this.grade;
        }else {
          return "the student "+this.name+" failed and the grade:"+this.grade;
        }
    }

}
