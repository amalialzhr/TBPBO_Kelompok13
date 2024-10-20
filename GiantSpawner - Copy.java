import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GiantSpawner extends EnemySpawner
{
    public GiantSpawner(){
        reloadTime = 10000;
        rampUp = 100000;
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
        getWorld().addObject(new EnemyGiantTank(), getGlobalX(), getGlobalY());
    }
}
