public class Staff extends User {
    private double salary;

    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//
//    @Override
//    public void getData() {
//        System.out.println("ID: " + id + "." + " FULL NAME: " + name + " " + surname + ". LOGIN: " + login + ". PASSWORD: " + password + "." + " SALARY: " + salary);
//        System.out.println("SUBJECTS: ");
//        for(int i = 0; i < indexOfSubject; i++) {
//            System.out.println(subjects[i]);
//        }
//    }


    @Override
    public void getData() {
        super.getData();
        System.out.println("Salary: " + getSalary());
        System.out.println("Subjects: ");
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
}