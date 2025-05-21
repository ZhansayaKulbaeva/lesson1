public class Dog extends Animal {

    private String breed;

    public Dog() {

    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String getData() {
        return super.getData() + "Name: " + getName() + " Breed: " + breed;
    }

    public String someMethodGetData(){
        return "Breed: " + breed;
    }
}