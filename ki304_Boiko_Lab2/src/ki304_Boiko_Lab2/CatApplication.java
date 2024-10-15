package ki304_Boiko_Lab2;

import java.io.IOException;

public class CatApplication {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 3, "Siamese");

        myCat.setName("Fluffy");
        System.out.println("Cat's name: " + myCat.getName());
        myCat.setAge(4);
        System.out.println("Cat's age: " + myCat.getAge());
        myCat.setBreed("Persian");
        System.out.println("Cat's breed: " + myCat.getBreed());

        myCat.meow();
        myCat.run();
        myCat.jump();
        myCat.purr();
        myCat.sleep();
        myCat.eat("tuna");
        myCat.play("a ball");

        try {
            myCat.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
