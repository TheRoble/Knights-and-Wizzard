
public class Human implements HumanInterface{

    //Protected Instance Variables:

    protected String name;
    
    protected int age;
    
    protected double height;
    
    protected int health;
    
    protected int xPos;
    
    protected int yPos;

    protected int numHumans;

    //Public Instance Methods:

    public Human(String name, int health, int age,double height,int numHumans, int xPos, int yPos){
        this.name = name;
        this.health = health;
        this.age = age;
        this.height = height;
        this.numHumans = numHumans;
        this.xPos = xPos;
        this.yPos = yPos;

    }
    public int getHealth(){

        return health;

    }
    
    public void setHealth (int health){

        this.health = health;

    }
    
    public String toString(){

        return "Name";

    }
    
    public String getName(){

        return name;

    }
    
    public void setName(String name){

        this.name = name;

    }
    
    public int getAge(){

        return age;

    }
    
    public void setAge(int age){

        this.age = age;

    }
    
    public double getHeight(){

        return height;

    }
    
    public void setHeight(double height){

        this.height = height;
    }

    //Public Class Methods:
    
    public int getAgeRules (){
        return 20;
    }

    public double getHeightRules(){
        return 5.11;
    }

    public int getHealthRules(){
        return 200;
    }

    public void move(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos(){
        return xPos;
    }

    public int getYPos(){
        return yPos;
    }
    
    @Override
    public int numHumans(int numHumans) {
        // TODO Auto-generated method stub
        return 45;
    }



}