import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sabotager extends Enemy
{
 
    public Sabotager(){
        
        setImage("Sabotager.png");
        
        health = 10;
        speed = 4;
        range = 35;
    }

  
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            humanCheckCollision();
        }
    }       
}
