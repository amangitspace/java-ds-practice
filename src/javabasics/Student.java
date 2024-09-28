public class Student {       // class// blue print
   // data member//  variable
    int roll;
    String studentName;
    int totalMarks;

    // member function // method
    void displayMarks(int roll){
        System.out.println("Roll Number:"+ roll);
        System.out.println("Name: "+studentName);
        System.out.println("total marks: "+ totalMarks);
        }
 //No arg constructor // or default constructor/// automatically created by JVM if not defined by developer
    //used to allocate memory for data members and create object
    Student(){
        System.out.println("Student Object Created without parameter");
    }

    // parameterised constructor
    Student(int roll, String studentName, int totalMarks){
        System.out.println("Student Object Created with parameters");
        this.roll= roll;
        this.studentName=studentName;
        this.totalMarks=totalMarks;
    }

    void displayStudentDetails(){
        System.out.println("Roll Number: " + roll);
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Marks: "+totalMarks);
    }

    public static void main(String[] args) {
        Student student1= new Student();  // first object created in memory // constructor call using new operator
        //Student student2= new Student();    // 2nd object created
        student1.displayStudentDetails();
       //Student student2 = new Student(20127, "Aman", 640);
       // student2.displayStudentDetails();
        Student student3 = new Student();
        student3.displayStudentDetails();
    }

}


