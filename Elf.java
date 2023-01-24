public class Elf extends Human {

    private int bowAndArrow;

    public Elf (String name, int health, int age,double height,int numHumans, int xPos, int yPos){
    
        super(name, health, age, height, numHumans, xPos, yPos);
        this.bowAndArrow = bowAndArrow;
        
    }

    public String toString(){
        return "Shelf";

    }
    
    public int getBowAndArrow(){
        return bowAndArrow;

    }
    public void setBowAndArrow (int i){
        this.bowAndArrow = i;

    }
    
    public boolean equals(Elf e, Elf e2){
        return e.equals(e2);
    }
    
    public Elf clone (String newName, int x, int y){

        return new Elf(newName, health, age, height, numHumans++, x, y);

    }




    

}