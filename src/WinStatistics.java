import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {

    private Map<Player, Integer> stats = new HashMap<>();

    public void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0);
        score += 1;
        stats.put(player,score);
    }

    public void print() {

        stats.forEach((Player player, Integer score) -> System.out.println(player.getName() + ": " + score));

        /*for(Player player : stats.keySet()){
            System.out.println(player.getName() + ": " + stats.get(player));
        }

       */
    }

    public void clear() {
        stats.clear();
    }
}
