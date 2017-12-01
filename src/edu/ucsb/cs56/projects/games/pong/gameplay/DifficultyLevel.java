package edu.ucsb.cs56.projects.games.pong.gameplay;
/** edu.ucsb.cs56.projects.games.pong.gameplay.Difficultylevel is the class that holds the diffculty and other parameters associated with varying difficulty levels
 * @author Millan Batra, Alex Ngo
 * @author Andrew Polk, Victoria Sneddon
 * @version CS56, Fall 2017, UCSB
 */

public class DifficultyLevel {
    
    /** The game difficulty level */
    public static int diflevel;

    /** The screen multiplier factor */
    public static int screenfactor;

    /** New screen width */
    public static int width;

    /** New screen height */
    public static int height;

    /** The original size of the ball */
    public static int origballsize=5;

    /** New paddle height */
    public static int paddleHeight;

    /** New ball speed */
    public static int speed;

    /** How many balls there are in game */
    public static int ballNum;
    
    /** edu.ucsb.cs56.projects.games.pong.gameplay.DifficultyLevel constructor to initialize difficulty of game onto the screen 
     * @param difficultylevel set game difficulty    
     */

    // Constructor
    // inputs are game difficulty [80,100,120,130,140,170]
    public DifficultyLevel(int difficultylevel)
    {
	diflevel=difficultylevel;
	ballNum = 1;
	if(diflevel==80)//supereasy
	    {
		screenfactor=10;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 110;
		speed = 1;
	    }
	else if(diflevel==100)//easy
	    {
		screenfactor=8;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 100;
		speed = 2;
	    }
	else if(diflevel==120)//medium
	    {
		screenfactor=6;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 90;
		speed = 3;
	    }
	else if(diflevel==130)//hard
	    {
		screenfactor=4;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 80;
		speed = 3;
	    }
	else if(diflevel==140)//extreme
	    {
		screenfactor=2;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 70;
		speed = 4;
	    }
	else if(diflevel==170)//chaos
	    {
		screenfactor=1;
		width=origballsize*screenfactor;
		height=origballsize*screenfactor;
		paddleHeight = 60;
		speed = 5;	
	    }
    }
    
    /** getDifficulty() returns the current difficulty of the game 
     * @return int Difficulty level in int form
     */
    public static int getDifficulty() { return diflevel; }

    /** getHeight() returns the screen height based on difficulty 
     * @return int The Height of the Game window*/
    public static int getHeight() { return height; }

    /** getWidth() returns the screen width based on difficulty 
     * @return int The width of the Game window
     */
    public static int getWidth() { return width; }

    /** getScreenFactor() returns the multiply factor of the screen size 
     * @return int The multiply factor of the screen
     */
    public static int getScreenFactor() { return screenfactor; }

    /** getPaddleHeight() returns the height height based on difficulty 
     * @return int The Paddle heights to be used
     */
    public static int getPaddleHeight() { return paddleHeight; }

    /** getSpeed() returns the ball speed based on difficulty 
     * @return int The speed of the Ball
     */
    public static int getSpeed() {return speed; }

    /** getBallNum() returns the number of balls int eh game
     * @return int number of balls
     */
    public static int getBallNum() {return ballNum; }
    
    public static void setBallNum(int ballNumber) {
	if(ballNumber >= 1 && ballNumber <= 5){
	    ballNum = ballNumber;}
    }
}
