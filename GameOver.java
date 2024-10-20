    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
 
    public class GameOver extends World
    {
 
        public GameOver(){super(600, 400, 1); }
        
        public GameOver(int score)
        {  
            super(600, 400, 1); 
            Greenfoot.setSpeed(100);
            prepare(score);
        }
    
        private void prepare(int amount)
        {
            MMButton mmbutton = new MMButton();
            addObject(mmbutton, 300, 350);
            addObject(new ImageLabel(amount), 300, 200);
        }
    }
