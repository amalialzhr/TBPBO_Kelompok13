import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gunner extends Enemy
{

    public Gunner(){
        
        setImage("MachineGunner.png");
        
        health = 30;
        speed = 3;
        reloadTime = 3;
        range = 100;
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
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());;
        }
    }  
}
