import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup(){
  
  background(0);
}
public void draw(){
  fill(0);
  rect(0, 0, 500, 500);

  fractal(250, 270, 450);
}
public void fractal(float x, float y, int size){
  if(size <= 5) return;
  ellipseMode(CENTER);
  int r = (int) (Math.random()*202+53);
  int g = (int) (Math.random()*202+53);
  int b = (int) (Math.random()*202+53);
  stroke(r, g, b);
  ellipse(x, y, size, size);
  /*
  fractal(x-cos(PI/4)*size/2, y-sin(PI/4)*size/2, size/3);
  fractal(x-cos(PI/4)*size/2, y+sin(PI/4)*size/2, size/3);
  fractal(x+cos(PI/4)*size/2, y-sin(PI/4)*size/2, size/3);
  fractal(x+cos(PI/4)*size/2, y+sin(PI/4)*size/2, size/3);
  */
  fractal(x, y-(size*3/5)/2, size/2);
  fractal(x-cos(PI/6)*(size*3/5)/2, y+sin(PI/6)*(size*3/5)/2, size/2);
  fractal(x+cos(PI/6)*(size*3/5)/2, y+sin(PI/6)*(size*3/5)/2, size/2);
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
