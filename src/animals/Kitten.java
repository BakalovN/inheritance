package animals;

public class Kitten extends Cat{
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
        this.gender = "Female";
    }

    @Override
    public String produceSound(){
        return "Meow";
    }
    @Override
    public String toString() {
        return String.format("%s %s %s%n%s", getName(), getAge(), getGender(), produceSound());
    }
}
