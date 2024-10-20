import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WeakAPCSpawner extends EnemySpawner
{
    public WeakAPCSpawner(){
        reloadTime = 7500;
        rampUp = 75000;
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
        getWorld().addObject(new WeakAPC(), getGlobalX(), getGlobalY());
    }
}
