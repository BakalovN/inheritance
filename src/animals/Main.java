package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        List<String> types = new ArrayList<>();
        while (true){
            String type = sc.nextLine();
            if (type.equals("Beast!")){
                break;
            }
            String[] input = sc.nextLine().split(" ");
            Animal animal = null;
            if (type.equals("Dog")){
                animal = new Dog(input[0], Integer.parseInt(input[1]), input[2]);
            }else if (type.equals("Frog")){
                animal = new Frog(input[0], Integer.parseInt(input[1]), input[2]);
            }else if (type.equals("Cat")){
                animal = new Cat(input[0], Integer.parseInt(input[1]), input[2]);
            }else if (type.equals("Kittens")){
                animal = new Kitten(input[0], Integer.parseInt(input[1]), input[2]);
            }else if (type.equals("Tomcat")){
                animal = new Tomcat(input[0], Integer.parseInt(input[1]), input[2]);
            }
            animals.add(animal);
            types.add(type);
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(types.get(i));
            System.out.println(animals.get(i).toString());
        }
    }
}
