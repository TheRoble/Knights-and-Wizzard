public class Wizzard extends Human {

    //Private Instance Variables:
    private int magicka;

    public Wizzard(String name, int health, int age,double height,int numHumans, int xPos, int yPos){
        super(name, health, age, height, numHumans, xPos, yPos);

        this.magicka = magicka;
    }

    //Public Instance Methods:

    public String castSpell(){

        return "bippity boppity you are now my property";

    }
    
    public String toString(){

        return "Wizzard";
        

    }

    public int  getMagicka(){
        return magicka;

    }
    
    public void setMagicka (int magicka){

        this.magicka = magicka;

    }
    
    
    public boolean equals(Wizzard w , Wizzard w2){
        //comparemagica
        return w.equals(w2);

    }
    
    public Wizzard clone(String newName, int x, int y){
        return new Wizzard(newName, health, age, height, numHumans++, x, y);
        
    }

    //Private Class Variables:
    private int LOW_MAGICKA(){

        return 5;

    }
    
    private int HIGH_MAGICKA(){
        return 500;
    }


}