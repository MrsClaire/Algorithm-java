package java_practise;
//使用继承
public class Practise {
    public  static void main (String args[]){
        // Student stu1 = new Student();
        Student stu2 = new Student("刘加新", 25, "计算机技术");
        //stu1.show();
        stu2.show();
    }
}
class Person
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void show()
    {
        System.out.println("姓名："+name+"年龄"+age);
    }
}
class Student extends Person
{
    private String department;
    public Student(String name, int age, String dep)
    {
        super(name, age);
        department = dep;
        System.out.println("我叫:"+name+"，今年:"+age+"，专业:"+department);
    }
}
