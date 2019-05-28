package com.class07;public class Notes {
/*
 * Alerts
 * Frames
 * Windows
 * Actions
 * 
 * IQ: How would you handle pop up - web based pop ups / js alerts can be handled using Alert Interface
 * 
 * Pop uops/ JS Alerts:
 * Simple - ok
 * confirmaion - ok & cancel
 * prompt - sendText
 * 
 * Alert alert = driver.switchTo().alert();
 * alert.accept();
 * alert.dismiss();
 * alert.getKeys();
 * alert.sednKeys();
 * 
 * If no alert present NoAlertPresentException
 * 
 * IQ: How would you handle element located inside the frame
 *    - switch focus to that frame
 *    -driver.switchTo().frame(....); "namevalue"
 *    
 * ways to switch to the frame:
 *    - id or name
 *    - Frame WebElement
 *    
 *    WebElement frame = river.findElement(by.css/xpath("..");
 *    driver.switchTo().frame(frame);
 *    
 * Switch back to the main window/frame/control
 * driver.switchTo().defaultContent
 * 
 * 
 *IQ How would you handle multiple windows
 *
 *Set<String> allWindows = driver.getWindowHandles();
 *
 *Logic to handle windows:
 *1.get Parent ID
 *  driver.ggetWindowHAndle();
 *  String parentID = driver.getWindowHAndle();
 *2. get all window Handles
 *   Set<String> allWindows = driver.getWindowHAndles();
 *3. Loop/Iterator through all strings in the set
 *   Iterator<Sting> it allWindows.iteraror();
 *   while(it.hasNext()) {
 *   String childId = it.next();
 *   if( ! parentId.equals(childId)) {
 *      driver.switchTo().window(childId);
 *      System.out.println(driver.getTitle());
 *      driver.findElement(By.linkTest(""...").click();
 *      driver.close();
 *      driver.switchTo().window(parentId)
 *      
 *  Switch command applicable to:
 *  alerts
 *  frames
 *  window
 *  
 *  To perform keyboard and mouse operation use Action class:
 *  
 *  IQ: How to perform rightClick/double click/hover over/drag and drop
 *      -by using Actons class
 *   Actions action = new Actions(driver);
 *    -right click - action.contextClick(element).perform();
 *    -double click - action.doubleClick(element).perform();
 *    -drag an drop = action.dragandDrop(source, target).perform();
 *    
 *   
 *
 *2.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
