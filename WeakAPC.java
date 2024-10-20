import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WeakAPC extends APC
{

    public WeakAPC(){
        setImage("APC.png");
        
        health = 300;
        speed = 1;
        reloadTime = 350;
        range = 800;
        maxSpawn = 20;
    }

    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            spawnWeak();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(200);
                getWorld().removeObject(this);
            }
        }
    }        
}
