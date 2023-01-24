public interface HumanInterface { 
    //return the name of the human 
    public String getName () ; 
    //change the name of the human 
    public void setName (String name) ; 
    //get the age of the human 
    public int getAge () ;
    //change the age of a human return false if invalid age 
    public void setAge (int age) ; 
    //return the height of the human 
    public double getHeight () ;
    //change the height of a human return false if invalid he 
    public void setHeight (double height) ; 
    //return the health of a human 
    public int getHealth() ;
    //change the health of a human, return false if invalid 
    public void setHealth (int health) ;
    //draw a human 
    //public void draw (Pen p) ;
    //nove a human 
    public void move (int x, int y) ; 
    //get Y position of a human 
    public int getYPos () ; 
    //get X position of a human 
    public int getXPos () ;
    //return a string representation of a human object 
    public String toString() ;
    //the number
    public int numHumans(int numHumans);

}
