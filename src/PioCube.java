public class PioCube {
    public static void main(String[] args) {

        Game game = new Game(new WinStatistics());

        game.addPlayer(new PlayerComp("Damian"));
        game.addPlayer(new PlayerComp("Andrzej"));
        game.addPlayer(new PlayerComp("Franek"));

        for (int i = 0; i < 100 ; i++) {
            game.play();
        }

        game.stats.print();

    }
}