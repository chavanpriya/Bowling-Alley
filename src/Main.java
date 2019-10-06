import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final int TOTAL_SETS = 2;


    public static void main(String[] args) {

        System.out.println("Please select number of players: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Please provide player" + (i + 1) + " name: ");
            String name = scanner.next();

            Player player = new Player(name);
            players.add(player);
        }


        for (int i = 0; i < TOTAL_SETS; i++) {
            players.forEach(player -> {
                PinSet pinSet = new PinSet();
                while (!pinSet.isSetFinish()) {
                    String pinDrop = scanner.next();
                    pinSet.ballThrown(pinDrop.charAt(0));
                    player.addPinDrop(pinDrop.charAt(0));
                }
            });
            ScoreBoard.printScore(players);
        }
        ScoreBoard.printWinner(players);

    }
}
