import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class ChainBomb extends MyProjectile
{
    protected int split = 0;
    protected int immuneCounter = 0;
    protected boolean isImmune = false;

    public ChainBomb(){
        Random rand = new Random();
        split = rand.nextInt(4) + 4;
        counter = 0;
        fizzOut = 20;
        speed = 15;

    }

    public ChainBomb(int direction){
        Random rand = new Random();
        split = rand.nextInt(4) + 0;
        setRotation(direction);
        counter = 0;
        fizzOut = 10;
        speed = 15;
        lockOn = true;
        isImmune = true;
    }


    public void act(){
        if(!lockOn){
            turnTowardsMouse();
            lockOn = true;
        }
        frame++;
        if(frame%4 == 0)
            setImage("Frags1.png");
        else if(frame%4 == 2)
            setImage("Frags2.png");
        move(speed);
        updateImmunity();
        if(!isImmune){
            selfDestruct();
        }
    }    


    public void selfDestruct(){
        counter++;
        Actor obj = getOneIntersectingObject(Objects.class); 
        Actor enemy = getOneIntersectingObject(Enemy.class);   
        if(counter > fizzOut || obj != null || enemy != null){
            if(enemy != null){
                Random rand = new Random();
                for(int i = 0; i<3; i++)
                    getWorld().addObject(new ChainBomb(60*i), getGlobalX(), getGlobalY());
            }
            getWorld().removeObject(this);
        }
    }

    public void turnTowardsMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();             
        if (mouse != null)      
            turnTowards(mouse.getX(), mouse.getY());   
    }  

    public void updateImmunity(){
        if(isImmune){
            immuneCounter++;
            if(immuneCounter > 5)
                isImmune = false;
        }
    }
    
    public boolean getImmunity(){
        return isImmune;
    }
}
