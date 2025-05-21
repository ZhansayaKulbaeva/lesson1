public class Swimmer extends Sportsman {
    private String style;
    private double recordTime;

    public Swimmer() {
    }
    public Swimmer(String name, int age ,String country, String style, double recordTime) {
        super(name, age, country );
        this.style = style;
        this.recordTime = recordTime;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public double getRecordTime() {
        return recordTime;
    }
    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }
    public String play() {
        return "Swimmer " + getFullName() + " from "+ getCountry() +","+getAge() + " years old with "+ style+"swam in"+recordTime+" seconds";
    }
}