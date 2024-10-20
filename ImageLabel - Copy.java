import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ImageLabel extends Actor
{
    public ImageLabel(int score){
        int fontsize = 40; 
        Color fontColor = Color.BLACK; 
        Color bgColor = new Color(0, 0, 0, 0); 
        GreenfootImage txtImg = new GreenfootImage("Your Score is: " + score, fontsize, Color.BLACK, bgColor);

        GreenfootImage img = new GreenfootImage(300, 50);
        bgColor = Color.YELLOW; 
        img.setColor(bgColor);
        img.fill();
  
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
}
