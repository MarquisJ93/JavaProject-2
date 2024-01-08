package JavaProject2;

import java.util.ArrayList;

/*How can you remove all duplicates from ArrayList?*/
public class P10Remove {
    public static void main(String[] args) {
        ArrayList<String> dogs=new ArrayList<>();
        dogs.add("German Shepard");
        dogs.add("Golden Retriever");
        dogs.add("Husky");
        dogs.add("Golden Retriever");
        dogs.add("Chihuahua");
        dogs.add("Husky");
        dogs.add("Labrador");
        for (int i=0;i<dogs.size();i++){
            for (int j = i+1; j < dogs.size() ; j++) {
                if (dogs.get(i).equals(dogs.get(j))){
                    System.out.println("duplicate found: "+dogs.get(i));
                    dogs.remove(j);
                }
            }
        }
        System.out.println(dogs);
    }
}
