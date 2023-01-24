public class Knight extends Human {

    //Private Instance Variables:
    private String horseName;


    //Public Instance Methods:

    public Knight (String name, int health, int age,double height,int numHumans, int xPos, int yPos){
    
        super(name, health, age, height, numHumans, xPos, yPos);
        this.horseName = horseName;


    }
    
    public String toString(){
        return "Rayden";

    }
    
    public String getHorseName(){
        return horseName;

    }
    public void setHorse (String n){
        this.horseName = n;

    }
    
    public boolean equals(Knight k, Knight k2){
        return k.equals(k2);
    }
    
    public Knight clone (String newName, int x, int y){

        return new Knight(newName, health, age, height, numHumans++, x, y);

    }


}