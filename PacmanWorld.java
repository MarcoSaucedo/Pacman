import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PacmanWorld extends World
{
     
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x=50; x<550; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y=58; y<200; y+= HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,526,y);
        }
        BigBall bigBall = new BigBall();
        addObject(bigBall,326,150);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,420,126);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,170,256);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,332,273);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,412,255);
        Cherry cherry = new Cherry();
        addObject(cherry,433,170);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,209,160);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,96,287);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,260,309);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,359,102);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,472,274);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,473,87);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,318,222);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,280,92);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,245,256);
        SmallBall smallBall8 = new SmallBall();
        addObject(smallBall8,132,218);
        SmallBall smallBall9 = new SmallBall();
        addObject(smallBall9,365,208);
        SmallBall smallBall10 = new SmallBall();
        addObject(smallBall10,132,155);
        SmallBall smallBall11 = new SmallBall();
        addObject(smallBall11,343,68);
        StrowBerry strowBerry = new StrowBerry();
        addObject(strowBerry,204,299);
        StrowBerry strowBerry2 = new StrowBerry();
        addObject(strowBerry2,522,262);

        PacmanHud hud = new PacmanHud();
        addObject(hud, 0, 0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman,110,90);
    }
}
