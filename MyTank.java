import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyTank extends ScrollActor
{
    //buat variables
    private int myHealth;
    private int mySpeed;
    private int counter;
    private int reloadTime;
    private int score = 0;

    private static final int MOVE_AMOUNT = 5;

    public MyTank(){
        myHealth = 1000;
        mySpeed = 4;
        counter = 0;
        reloadTime = 32;
    }

   
    public void act() 
    {
        if(myHealth > 0){
            moveAround();
            checkCollisionObject();
            checkCollision();
        }
        else
            Greenfoot.setWorld(new GameOver(score));
    }    

    public void moveAround(){
        if(Greenfoot.isKeyDown("A")){
            setRotation(getRotation() - 3);
            getWorld().setCameraDirection(getRotation());
        }
        if(Greenfoot.isKeyDown("D")){
            setRotation(getRotation() + 3);
            getWorld().setCameraDirection(getRotation());
        }
        if(Greenfoot.isKeyDown("S")){
         
            getWorld().moveCamera(-MOVE_AMOUNT/2);
        }
        else if(Greenfoot.isKeyDown("W")){
           
            getWorld().moveCamera(MOVE_AMOUNT);
        }
    }   


    public void checkCollisionObject(){
        Actor obj = getOneIntersectingObject(Objects.class);                 
        if(obj != null){
            if(Greenfoot.isKeyDown("W"))
                getWorld().moveCamera(-MOVE_AMOUNT);
            else if(Greenfoot.isKeyDown("S"))
                getWorld().moveCamera(MOVE_AMOUNT/2);
        }  
    }

   
    public int getHealth(){
        return myHealth;
    }
    
 
    public void checkCollision(){
        Actor Em = getOneIntersectingObject(EnemyMissile.class);
        if(Em != null){
            myHealth -= 100;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(Em);
        }
        
        Actor Emr = getOneIntersectingObject(EnemyMiniRocket.class);
        if(Emr != null){
            myHealth -= 10;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(Emr);
        }
        
        Actor MG = getOneIntersectingObject(EnemyMGun.class);
        if(MG != null){
            myHealth --;
            getWorld().removeObject(MG);
        }
        
        Actor C = getOneIntersectingObject(Charger.class);
        if(C != null){
            myHealth -= 50;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(C);
        }
        
        Actor health = getOneIntersectingObject(HealthCrate.class);
        if(health != null){
            myHealth = 1000;
            getWorld().removeObject(health);
        }
        
        Actor S = getOneIntersectingObject(Sabotager.class);
        if(S != null){
            myHealth -= 2;
        }
    }
    

    public void incrementScore(int buff){
        score += buff;
    }
}
