import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EnemyGiantTank extends Enemy
{
    public EnemyGiantTank(){
        
        setImage("HeavyTank.png");
        
        health = 1000;
        speed = 1;
        reloadTime = 50;
        reloadTimeTwo = 5;
        range = 250;
    }

    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            shoot();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(1000);
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
        counterTwo++;
        if(counterTwo > reloadTimeTwo){
            counterTwo = 0;
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());
        }
    }  
}
