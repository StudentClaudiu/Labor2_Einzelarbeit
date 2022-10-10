package Animal;

public class DogController {
    private Dog model;
    private DogView view;

    public DogController(Dog model, DogView view){
        this.model = model;
        this.view = view;
    }

    public void setDogName(String name){
        model.setDogName(name);
    }

    public String getDogName(){
        return model.getDogName();
    }

    public void setDogId(String id){
        model.setDogID(id);
    }

    public String getDogId(){
        return model.getDogID();
    }

    public void setDogBreed(String breed){
        model.setDogBreed(breed);
    }

    public String getCourseCategory(){
        return model.getDogBreed();
    }
    public void updateView(){
        view.printDogInfo(model.getDogBreed(), model.getDogName(), model.getDogID());
    }
}
