import processing.core.PApplet;
 
public class Sketch extends PApplet {
   
  /**
   * This program creates a sketch of a house at random locations with a change in color of the ground depending on the location
   * @author: L. Pei
   */
 
  // random variables are instantiated for the coordinates used
  float houseX = random(0,200);
  float houseY = random(0,275);
 
  public void settings() {
    size(400, 400);
  }
 
  public void setup() {
    // the code decides the color for the ground based on the location of the house
    // Quadrant 1 blue
      if(houseX >= 100 && houseY <= (275 / 2)) {
        background(66, 182, 245);
      }
    // Quadrant 2 orange
      else if(houseX <= 100 && houseY <= (275 / 2)) {
        background(245, 170, 66);
      }
   
    // Quadrant 3 red
      else if(houseX <= 100 && houseY >= (275 / 2)) {
          background(245, 66, 66);
      }
    // Quadrant 4 green
      else if(houseX >= 100 && houseY >= (275 / 2)) {
          background(66, 245, 132);
      }
  }
 
  public void draw() {
 
        // background sky
        fill(173, 216, 230);
        rect(0, 0, 400, houseY + 125);
   
        // chimney
        fill(168, 96, 50);
        rect(houseX + 25, houseY - 80, 30, 60);
   
        // shape of the house
        fill(168, 96, 50);
        rect(houseX, houseY, 200, 125);
 
        // roof
        fill(168, 96, 50);
        triangle(houseX - 25, houseY, houseX + 100, houseY - 75, houseX + 225, houseY);
   
        // window 1
        fill(225, 225, 225);
        ellipse(houseX + 50 , houseY + 25, 30, 30);
   
        // window 2
        fill(225, 225, 225);
        ellipse(houseX + 150, houseY + 25, 30, 30);
   
        // door
        fill(145, 61, 7);
        rect(houseX + 80, houseY + 50, 40, 75);
 
        // this code below displays the current time
        var hours = hour();
        var minutes = minute();
        var seconds = second();
   
        var currentTime = nf((hours), 2) + ":" + nf(minutes, 2) + ":" + nf(seconds, 2);
   
        fill(255);
        noStroke();
        textSize(17);

        text(currentTime, 320, 385);
  }
}