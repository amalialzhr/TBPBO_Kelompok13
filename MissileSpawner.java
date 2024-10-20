import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MissileSpawner extends EnemySpawner
{
    public MissileSpawner(){
        reloadTime = 2000;
        rampUp = 20000;
    }
    
    public void act() 
    {
        counter++;
        rampCounter++;
        if(rampCounter > rampUp && !ramped){
            reloadTime = reloadTime / 2;
            ramped = true;
        }
        if(counter > reloadTime){
            createEnemy();
            counter = 0;
        }
    }    
    
    public void createEnemy(){
        getWorld().addObject(new EnemyMissileTank(), getGlobalX(), getGlobalY());
    }
}
