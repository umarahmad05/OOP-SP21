
package l11ac1.L11AC1;


public class StudentTask implements RegisterForExams{

    private String name;
private int age;
private double gpa;

public StudentTask() {
name = null;
age = 0;
gpa = 0;
}

public StudentTask(String name,int age,double gpa)
{
this.name = name;
this.age = age;
this.gpa = gpa;
}

@Override
public void register() {
// TODO Auto-generated method stub
System.out.println("Student name " + name + " gpa " + gpa);
}
}