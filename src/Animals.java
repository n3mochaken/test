import java.util.Random;


public class Animals {


    private String[] animals = {"cat", "dog", "cow", "tiger", "bear", "monkey", "pig", "horse"};

    public String[] forGame = new String[3];
    public boolean[] logic = {false, false, false};

    public void fillLogic() {
        boolean fov = logic[0] == logic[1] & logic[0] == logic[2] & logic[2] == logic[1];

        System.out.println("intro " + fov);

        while (fov) {
            for (int i = 0; i < 3; i++) {
                logic[i] = bolRand();
                if (logic[i]==true){
                    fov = logic[0] == logic[1] & logic[0] == logic[2] & logic[2] == logic[1];
                    break;
                }
            }

        }

    }

    public void fillForGame() {
        for (int i = 0; i < 3; i++) {
            forGame[i] = getAnimals();
        }

        boolean fou = (forGame[0] == forGame[1] || forGame[0] == forGame[2] || forGame[1] == forGame[2]);
        while (fou) {
            for (int i = 1; i < 3; i++) {
                forGame[i] = getAnimals();
                fou = (forGame[0] == forGame[1] || forGame[0] == forGame[2] || forGame[1] == forGame[2]);
            }
        }

    }


    private String getAnimals() {
        Random r = new Random();
        int x = r.nextInt(8);
        return animals[x];
    }

    private boolean bolRand() {
        Random r = new Random();
        boolean x = r.nextBoolean();
        return x;
    }
}
