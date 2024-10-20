import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyMissile extends MyProjectile
{
    /**
     * Constructor for MyMissile that sets the direction and variables
     */
    public MyMissile(){      
        counter = 0;
        fizzOut = 40;
        speed = 10;
    }
    
   
    public void act(){
        if(!lockOn){
            turnTowardsMouse();
            lockOn = true;
        }
        frame++;
        if(frame%4 == 0)
            setImage("missile1.png");
        else if(frame%4 == 2)
            setImage("missile2.png");
        move(speed);
        selfDestruct();
    }    
   
    public void selfDestruct(){
        counter++;
        Actor obj = getOneIntersectingObject(Objects.class);    
        if(counter > fizzOut || obj != null){
            getWorld().removeObject(this);
        }
    }
    
    //turn towards mouse
    public void turnTowardsMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();             
        if (mouse != null)      
           turnTowards(mouse.getX(), mouse.getY());   
    }  
}
