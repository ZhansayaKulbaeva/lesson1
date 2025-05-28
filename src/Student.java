public class Student extends User implements StudentMap, TestMap {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
        return "{Student} ID: " + getId() + ". " + "LOGIN: " + getLogin() + ". " + "PASSWORD: " + getPassword() + "." + " NAME: " + name + "." + " SURNAME: " + surname + "." + " GROUP: " + group + ". " + "GPA: " + gpa;
    }

    @Override
    public void testMethod(String grade) {
        System.out.println("You have this grage: " + grade);
    }

    @Override
    public String generateGrade() {
        if (gpa==4.0){
            return "A+";
        }else if (gpa==3.0){
            return "A-";
        }else if (gpa==2.0){
            return "B+";
        }else if (gpa==1.0){
            return "B-";
        }else {
            return "F";
        }
    }

    @Override
    public int testMethodBek() {
        return 0;
    }
}