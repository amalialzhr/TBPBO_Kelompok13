import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EnemyMissileTank extends Enemy
{
   
    public EnemyMissileTank(){
        setImage("EnemyMissileTank.png");
        
        health = 300;
        speed = 1;
        reloadTime = 100;
        range = 400;
    }

    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            shoot();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(200);
                getWorld().removeObject(this);
            }
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMissile(getRotation()), getGlobalX(), getGlobalY());;
        }
    }
}
