import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocketeer extends Enemy
{
   
    public Rocketeer(){
        
        setImage("Rocketeer.png");
        
        health = 30;
        speed = 3;
        reloadTime = 200;
        range = 300;
    }

  
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            shoot();
            makeRoom();
            humanCheckCollision();
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMiniRocket(getRotation()), getGlobalX(), getGlobalY());;
        }
    }  
}
