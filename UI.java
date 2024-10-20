import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class UI extends World
{
    public UI()
    {    
        super(600, 400, 1); 
        Greenfoot.setSpeed(100);

        prepare();
    }


    private void prepare()
    {
        PlayButton playbutton = new PlayButton();
        addObject(playbutton, 473, 177);
        InstructionsButton instructionsbutton = new InstructionsButton();
        addObject(instructionsbutton, 481, 255);
        instructionsbutton.setLocation(475, 241);
    }
}
