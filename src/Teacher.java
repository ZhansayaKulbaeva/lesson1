public class Teacher extends User {
    private String nickName;
    private String status;
    private String subjects[] = new String[10]; // массив где мы будем хранить предметы
    private int sizeOfSubjects = 0; // каждый раз когда добавляю предмета в массив, sizeOfSubjects++

    public Teacher() {

    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public void addSubject(String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printSubjects() {
        System.out.println("Teacher " + nickName);
        System.out.println("Subjects:");
        for (int i = 0; i < sizeOfSubjects; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public String getUserData() {
        return "{Teacher} ID: " + getId() + ". LOGIN: " + getLogin() + ". PASSWORD: " + getPassword() + ". NICKNAME: " + nickName + ". STATUS: " + status + ".";
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
}
