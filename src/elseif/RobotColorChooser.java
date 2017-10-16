
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
	Robot rob= new Robot();
	rob.penDown();
	rob.miniaturize();
	rob.setPenWidth(10);
	rob.setSpeed(10);
	
	for(int i=0;i<=10;i++){
	String color = JOptionPane.showInputDialog("What color do you want to use?");
	if(color.equalsIgnoreCase("red")){
	rob.setPenColor(Color.RED);
	} else if(color.equalsIgnoreCase("blue")){
	rob.setPenColor(Color.BLUE);
	} else if(color.equalsIgnoreCase("green")){
	rob.setPenColor(Color.GREEN);
	} else{
	rob.setRandomPenColor();
	}
	for(int p=0;p<=3;p++){

	rob.move(100);
	rob.turn(90);
	}
	//3. ask the user what color they would like the robot to draw

	}	//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn't enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
