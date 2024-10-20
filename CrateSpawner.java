import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class CrateSpawner extends ScrollActor
{
    private int counter;
    private int spawnTime;

    public CrateSpawner(){
        counter = 0;
        spawnTime = 250;
    }

    public void act() 
    {
        counter++;
        if(counter > spawnTime){
            spawnCrate();
            counter = 0;
        }
    }    

    public void spawnCrate(){
        Random rand = new Random();
        int temp = rand.nextInt(10);
        if(temp < 4){
            int x = rand.nextInt(1900) + 300;
            int y = rand.nextInt(1900) + 300;
            getWorld().addObject(new MGunCrate(), x, y);
        }
        else if(temp < 7){
            int x = rand.nextInt(1900) + 300;
            int y = rand.nextInt(1900) + 300;
            getWorld().addObject(new MissileCrate(), x, y);
        }
        else if(temp < 9){
            int x = rand.nextInt(1900) + 300;
            int y = rand.nextInt(1900) + 300;
            getWorld().addObject(new LaserCrate(), x, y);
        }
        else{
            int x = rand.nextInt(1900) + 300;
            int y = rand.nextInt(1900) + 300;
            getWorld().addObject(new HealthCrate(), x, y);
        }
    }
}
