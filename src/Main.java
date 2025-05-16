public class Main {
    public static void main(String[]args){
        Student student1 = new Student(1,"testbek1", "testbekov1",4);
        Student student2 = new Student(2,"testbek2", "testbekov2",3);
        Student student3 = new Student(3,"testbek3", "testbekov3",2);
        Student student4 = new Student(4,"testbek4", "testbekov4",1);
        Student student5 = new Student(5,"testbek5", "testbekov5",3);
        Student student6 = new Student(6,"testbek6", "testbekov6",2);
        Student student7 = new Student(7,"testbek7", "testbekov7",4.9);
        Student student8 = new Student(8,"testbek8", "testbekov8",2);
        Student student9 = new Student(9,"testbek9", "testbekov9",9);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9};

//        System.out.println(students.length);
        System.out.println(students[2]);


//        StudentHouse kbtuStudentHouse = new StudentHouse();
//
//        kbtuStudentHouse.addStudent(student1);
//        kbtuStudentHouse.addStudent(student2);
//        kbtuStudentHouse.addStudent(student3);
//        kbtuStudentHouse.addStudent(student4);
//        kbtuStudentHouse.addStudent(student5);
//        kbtuStudentHouse.addStudent(student6);
//        kbtuStudentHouse.addStudent(student7);
//        kbtuStudentHouse.addStudent(student8);
//        kbtuStudentHouse.addStudent(student9);

//        System.out.println(kbtuStudentHouse.theBestStudent());

        System.out.println();
    }
}