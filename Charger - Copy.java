import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Charger extends Enemy
{
    public Charger(){
        setImage("Charger.png");
        
        health = 20;
        speed = 5;
        range = 0;
    }
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            humanCheckCollision();
        }
    }       
}
