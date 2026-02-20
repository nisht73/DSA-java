package OOPS;

public class Opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Orange");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("blue");
        System.out.println(p1.getColor());
        
        Student s1 = new Student();
        s1.name = "nishant";
        s1.rollno = 785;
        s1.password="xdxd"

        Student s2 = new Student(s1);

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
    // here the the tip with this is the property of the pen and another tip is
    // arguement that will be passed
}

class Student {
    String name;
    int rollno;
    String password;
    
    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollno= s1.rollno;
    }
    Student() {
        System.out.println("constructor is called.. ");
    }

    Student(int roll) {
        this.rollno = roll;
    }

    Student(String name){
        this.name = name
     };

}