package com.class07;

import utils.CommonMethods;

public class TaskTC2 extends CommonMethods{
	/*Task
	Ahead to http://uitestpractice.com/Students/Switchto
	Get the parent title
	Get the parentId
	print the parent title and parentId
	Click on the open in a new window
	Get the child title
	Get the childId
	print the child title and childId
	close the child window
	 * 
	 */

	public static void main(String[] args) {
		
		setUpDriver("firefox", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentID = driver.getWindowHandle();
		System.out.println("Parent Title = "+parent);
		System.out.println("Parent ID = "+parentID);
	

	}

}
