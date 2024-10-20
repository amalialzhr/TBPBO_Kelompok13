import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MachineGunSpawner extends EnemySpawner
{
    public MachineGunSpawner(){
        reloadTime = 1000;
        rampUp = 10000;
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
        getWorld().addObject(new MachineGunTank(), getGlobalX(), getGlobalY());
    }
}
