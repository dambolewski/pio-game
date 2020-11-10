        import java.util.*;

public class Game {

    private List<Player> players = new ArrayList();
    private Player player;
    private Random r = new Random();

    public final Statistics stats;

    public Game () {
        this(null);
    }

    public Game(Statistics stats){
        if(stats == null){
            stats = new NullStatistics();
        }
        this.stats = stats;
    }

    public void addPlayer(Player player){
        if(nameExists(player.getName())){
            player.setName(player.getName() + r.nextInt(10));
            addPlayer(player);
        }
        else {
            players.add(player);
        }
    }

    private boolean nameExists(String name){
        for(Player player : players) {
            if(player.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void removePlayer(String name) {

        players.removeIf(player -> player.getName().equals(name));
    }

     //mozna tak zapisac
     /*
        for(Iterator<Player> it = players.iterator(); it.hasNext();){
            Player player = it.next();
            if(player.getName().equals(name)){
                it.remove();
            }
        }
     */


    public void play(){

        int number;
        int guess;

        boolean repeat;

        do {
            number = r.nextInt(6) + 1;
            System.out.println("Wylosowana liczba " + number);

            repeat = true;

            for (Player player : players) {
                guess = player.guess();
                System.out.println(player.getName() + " odgadl liczbe " + guess);

                if (number != guess) {
                    System.out.println("ZLE");
                } else {
                    System.out.println("BRAWO");
                    repeat = false;
                    stats.andTheWinnerIs(player);
                }
            }
        }
        while(repeat);
    }

    public void showStats(){
        stats.print();
    }

}
