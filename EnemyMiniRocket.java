import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EnemyMiniRocket extends EnemyProjectile
{
 
    public EnemyMiniRocket(int direction){
        setRotation(direction);
        counter = 0;
        fizzOut = 20;
        speed = 10;
    }
  
    public void act(){
        frame++;
        if(frame%4 == 0)
            setImage("MiniMissile1.png");
        else if(frame%4 == 2)
            setImage("MiniMissile2.png");
        move(speed);
        selfDestruct();
    }    
}
