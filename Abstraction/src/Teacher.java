public class Teacher extends Person{


String subject ;
String school; 

public String getSchool() {
    return school;
}


public void setSchool(String school) {
    this.school = school;
}


public Teacher(String name, String subject ,String school) {
    super(name);
    this.school = school;
    this.subject=subject;
}


public String getSubject() {
    return subject;
}

public void setSubject(String subject) {
    this.subject = subject;
}

@Override
void describeRole() {

    System.out.println(getName() + " teaches:" + subject+  " " + "at" + " "  + school);
} 

}
