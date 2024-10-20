import greenfoot.*; 

public class Instructions extends World
{
    public Instructions()
    {    
        super(600, 400, 1); 
        prepare();
    }
    

    private void prepare()
    {
        MMButton mbutton = new MMButton();
        addObject(mbutton, 473, 370);
    }
}
