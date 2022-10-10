package Animal;

public class Main {
    public static void main(String[] args) {

        Dog model  = retriveDogFromDatabase();

        DogView view = new DogView();

        DogController controller = new DogController(model, view);

        controller.updateView();

        //update information
        controller.setDogName("Nero");
        System.out.println("");

        controller.updateView();
    }

    private static Dog retriveDogFromDatabase(){
        Dog dog = new Dog();
        dog.setDogBreed("Labrador");
        dog.setDogName("Solo");
        dog.setDogID("15");

        return dog;
    }
}