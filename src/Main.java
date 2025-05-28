public class Main {
    public static void main(String[] args) {
        Student student = new Student(2, "zhansaya@bk.ru", "zhansaya12345", "Zhansaya", "Kulbaeva", "IT1-2015", 4);
        String grade = student.generateGrade();
        student.testMethod(grade);
    }
}
