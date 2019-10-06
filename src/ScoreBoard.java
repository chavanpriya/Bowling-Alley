import java.util.List;

/**
 * Created by priya on 06/10/19
 */
public class ScoreBoard {
    private static final int STRIKE_BONUS = 20;
    private static final int SPARE_BONUS = 15;

    public static void printScore(List<Player> players){
        players.forEach(player -> {
            int score = getScore(player);
                System.out.println(player.getName()+ " score is: "+ score);
        });
    }

    private static int getScore(Player player) {
        int score = 0;
        for (int index = 0; index < player.getPinsDrop().size(); index++) {
            Character pinDrop = player.getPinsDrop().get(index);
            switch (pinDrop){
                case 'x':
                    score += STRIKE_BONUS;
                    break;
                case '/':
                    score += SPARE_BONUS - Integer.parseInt(String.valueOf(player.getPinsDrop().get(index-1)));
                    break;
                default:
                    score += Integer.parseInt(String.valueOf(pinDrop));
                    break;
            }
        }
        return score;
    }

    public static void printWinner(List<Player> players) {
        int highScore = 0;
        int lowest = 99999;
        Player winner = players.get(0);
        Player looser = players.get(0);
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            int score = getScore(player);
            if (score > highScore) {
                highScore = score;
                winner = player;
            }
            if(score < lowest) {
                looser = player;
                lowest = score;
            }
        }
        System.out.println(winner.getName() + " won!!!!!!");
        System.out.println(looser.getName() + " lost :(");
    }
}
