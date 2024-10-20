import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class StrongAPC extends APC
{

    public StrongAPC(){
        setImage("APC.png");
        
        health = 300;
        speed = 1;
        reloadTime = 350;
        range = 800;
        maxSpawn = 40;
    }


    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            spawnStrong();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(500);
                getWorld().removeObject(this);
            }
        }
    }     
}
