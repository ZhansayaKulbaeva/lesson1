public class Rectangle {
    private int widnth;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int widnth, int height) {
        this.widnth = widnth;
        this.height = height;
    }

    public int getWidnth() {
        return widnth;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        int area = widnth*height;
        return area;
    }
}