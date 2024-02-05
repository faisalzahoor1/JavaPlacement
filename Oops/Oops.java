class Student{
    String name;
    String regno;

    public void infor(){
        System.out.println(this.name);
        System.out.println(this.regno);
    }
    // parametrised constructor.
    // Student(String name, String regno){
    //     this.name = name;
    //     this.regno = regno;
    // }

    // copy constructor.
    Student(Student s2){
        this.name = s2.name;
        this.regno = s2.regno;
    }

    // non-parametrised constructor.
    Student(){

    }
}

public class Oops{
    public static void main(String[] args) {
        // Student s1 = new Student("faisal", "sp23-bcs-052");
        // s1.name = "faisal";
        // s1.name = "sp23-bcs-052";
        Student s1 = new Student();
        s1.name = "faisal";
        s1.regno = "sp23-bcs-052";

        Student s2 = new Student(s1);
        s2.infor();
        // // s2.name = "faisalzahoor";
        // // s2.name = "sp25-bcs-055";

        // s1.infor();
        
    }
}
