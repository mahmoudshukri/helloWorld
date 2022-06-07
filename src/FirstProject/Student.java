package FirstProject;

public class Student {
// String is data type (text , integer , ..)//
    // class shall have a name / attribute shall have a name
    private String firstName="Mohamed";
    String lastName ;
   public int age;
    static int StudentCount;
    private String address;
    public  void  attendClass() {System.out.println("welcome to the class"+ firstName);}

    public void absent() {

    }
public void setFirstName(String firstname){
        this.firstName=firstname;
}
public void increaseStudentCount(){
    int StudentCount = 0;
    StudentCount++ ;
}

}
