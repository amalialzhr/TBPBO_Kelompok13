import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class MachineGunTank extends Enemy
{
    
    public MachineGunTank(){
        
        setImage("EnemyMGunTank.png");
        
        health = 200;
        speed = 3;
        reloadTime = 5;
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
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(100);
                getWorld().removeObject(this);
            }
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());
        }
    }
}
