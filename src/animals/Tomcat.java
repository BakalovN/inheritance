package animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
        this.gender = "Male";
    }

    @Override
    public String produceSound(){
        return "MEOW";
    }
    @Override
    public String toString() {
        return String.format("%s %s %s%n%s", getName(), getAge(), getGender(), produceSound());
    }
}
