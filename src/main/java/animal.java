import java.util.Arrays;

public class animal {

    public static String[] ListAnimal() {
        String [] animals = new String []{"Dog", "Cat", "Cow", "Horse", "Panda"};

        return animals;



    }


    public static void main(String[] args) {
        String [] animalFood = new String []{"Dogfood", "Catfood", "Grass", "Hay", "Bamboo"};
        String [] list = ListAnimal();
        for (int i =0; i < list.length; ++i){
            System.out.println(list[i] + " " + animalFood[i]);
        }
    }
}























