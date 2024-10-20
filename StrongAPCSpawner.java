import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StrongAPCSpawner extends EnemySpawner
{
    public StrongAPCSpawner(){
        reloadTime = 12500;
        rampUp = 125000;
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
        getWorld().addObject(new StrongAPC(), getGlobalX(), getGlobalY());
    }
}
