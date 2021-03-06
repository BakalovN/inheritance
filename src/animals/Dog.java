package animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound(){
        return "Woof!";
    }
    @Override
    public String toString() {
        return String.format("%s %s %s%n%s", getName(), getAge(), getGender(), produceSound());
    }
}
