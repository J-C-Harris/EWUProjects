////////////////////////////////////////////////////////////////////////
// James Harris and Marc Viehouser
// 10/04/2024
//
// Sources:
//
//
// Purpose:
//
////////////////////////////////////////////////////////////////////////
//import org.junit.*;
//import static org.junit;

abstract class piece {
    //Variables
    private Boolean isAlive;
    private Boolean hasMoved;
    private int locationX;
    private int locationY;
    private String name;

    //Constructors
    public piece(int userLocationX, int userLocationY, String pieceName) {
        locationX = userLocationX;
        locationY = userLocationY;
        name = pieceName;
        isAlive = true;
        hasMoved = false;
        System.out.println("Piece " + name + " is created /n");
    }
    //Default Constructor
    public piece(){
        name = "Test";
        isAlive = true;
        hasMoved = false;
        locationX = 9;
        locationY = 9;
    }
    //Copy Constructor
    public piece(piece userPiece){
        isAlive = userPiece.isAlive;
        hasMoved = userPiece.hasMoved;
        locationX = userPiece.locationX;
        locationY = userPiece.locationY;
        name = userPiece.name;
        System.out.println("Piece " + name + " is copied /n");
    }


    //Getters
    public Boolean isAlive() {
        return isAlive;
    }
    public Boolean isHasMoved() {
        return hasMoved;
    }
    public int getLocationX() {
        return locationX;
    }
    public int getLocationY() {
        return locationY;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
    public void setHasMoved(Boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
    public void setLocationX(int userLocationX) {
        this.locationX = userLocationX;
    }
    public void setLocationY(int userLocationY) {
        this.locationY = userLocationY;
    }
    public void setName(String pieceName) {
        name = pieceName;
    }


    //Methods
    abstract int move();

    abstract Boolean attack();


}



//access_modifier class <class_name>
//{
//    Variables
//    Constructor;
//    Getters and Setters;
//    Methods
//    Nested class;
//    Interface;
//}