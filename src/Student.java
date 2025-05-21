public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourse = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, int age, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    @Override
    public void getData() {
        System.out.println("ID: " + id + "." + " FULL NAME: " + name + " " + surname + ". LOGIN: " + login + ". PASSWORD: " + password + "." + " SALARY: " + gpa);
        System.out.println("SUBJECTS: ");
        for (int i = 0; i < indexOfCourse; i++) {
            System.out.println(courses[i]);
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addSubject(String subject) {
        courses[indexOfCourse] = subject;
        indexOfCourse++;
    }
}