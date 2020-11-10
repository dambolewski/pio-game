import java.util.Scanner;

public class PlayerHuman extends Player{

    Scanner sc = new Scanner(System.in);

    public PlayerHuman() {
    }

    public PlayerHuman(String name){
        super(name);
    }

    @Override
    public int guess(){
        System.out.print("Wpisz liczbe: ");
        return sc.nextInt();
    }

}
