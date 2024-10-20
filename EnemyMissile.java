import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EnemyMissile extends EnemyProjectile
{       
  
    public EnemyMissile(int direction){
        setRotation(direction);
        counter = 0;
        fizzOut = 40;
        speed = 10;
    }
 
    public void act(){
        frame++;
        if(frame%4 == 0)
            setImage("missile1.png");
        else if(frame%4 == 2)
            setImage("missile2.png");
        move(speed);
        selfDestruct();
    }    
}
