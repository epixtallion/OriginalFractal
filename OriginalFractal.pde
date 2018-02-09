void setup(){
  size(500,500);
  background(0);
}
void draw(){
  fill(0);
  noStroke();
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
