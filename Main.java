package pl.mj;


public class Main {

    public static void main(String[] args) {

        FizzBuzzGame game= new FizzBuzzGame(100);
        System.out.println("Play a default game: ");
        game.playGame();
        System.out.println("Play a FizzBuzzZazz Version");
        game.addCondition(10,"Zazz");
        game.playGame();

    }
}
