//CREATED BY JUSTIN CHOW

package lifeGame;

public class CoordsToKeep{
    int x, y;

    public CoordsToKeep(int xInput, int yInput){
        x = xInput;
        y = yInput;
    }

    public void setX(int xInput){
        x = xInput;
    }

    public void setY(int yInput){
        y = yInput;
    }

    public int getX(){
        return(x);
    }

    public int getY(){
        return(y);
    }
}