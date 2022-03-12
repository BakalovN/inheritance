package animals;

public class Animal {
    protected String name;
    protected int age;
    protected String gender;


    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println(invalid());
            return;
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String produceSound(){
        return "Sound";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private String invalid(){
        return "Invalid input";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s%n%s", getName(), getAge(), getGender(), produceSound());
    }
}
