public abstract class Player {

    private String name = "Anonim";

    public Player (){
    }

    public Player(String name){
        setName(name);
    }


    public void setName(String name) {
        if(name != null && name.matches("^[A-Za-z~0-9]{3,}$")){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Nieprawidlowe imie");
        }
    }

    public String getName() {
        return name;
    }

    public abstract int guess();



}