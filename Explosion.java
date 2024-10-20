import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Explosion extends ScrollActor implements Animatable {  // Implementasi interface
    private int frame = 0;
    private int aminCount = 0;
    
    public void act() 
    {
        aminCount++;
        if(aminCount % 2 == 0)
            updateFrame();
    }    

    @Override
    public void updateFrame() {  // Implementasi metode dari interface
        if(frame == 0){
            frame++;
            setImage("Explosion1.png");
        }
        else if(frame == 1){
            frame++;
            setImage("Explosion2.png");
        }
        else if(frame == 2){
            frame++;
            setImage("Explosion3.png");
        }
        else if(frame == 3){
            frame++;
            setImage("Explosion4.png");
        }
        else if(frame == 4){
            frame++;
            setImage("Explosion5.png");
        }
        else if(frame == 5){
            frame++;
            setImage("Explosion6.png");
        }
        else if(frame == 6){
            frame++;
            setImage("Explosion7.png");
        }
        else if(frame == 7){
            frame++;
            setImage("Explosion8.png");
        }
        else if(frame == 8){
            frame++;
            setImage("Explosion9.png");
        }
        else if(frame == 9){
            frame++;
            setImage("Explosion10.png");
        }
        else if(frame == 10){
            frame++;
            setImage("Explosion11.png");
        }
        else if(frame == 11){
            frame++;
            setImage("Explosion12.png");
        }
        else if(frame == 12){
            frame++;
            setImage("Explosion13.png");
        }
        else if(frame == 13){
            getWorld().removeObject(this);
        }
    }
    
    @Override
    public boolean isAnimationComplete() {  // Menambahkan implementasi untuk metode isAnimationComplete
        return frame >= 13;  // Misalnya, animasi selesai setelah frame 13
    }
}
