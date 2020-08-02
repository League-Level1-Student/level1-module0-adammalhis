int y= -50;
int x= (int) random (0, 500);
int score= 0;
void checkCatch() {
  if (x > mouseX && x < mouseX+100 && y > mouseY && y < mouseY+100) {
  score++;
  y= -50;
  x= (int) random (0, 500);
  }
 
  println("Your score is now: "+ score);
}
void setup() {
  size (500, 500); 
}
void draw() {
  background(100, 100, 100);
  fill(0, 0, 255);
  stroke(0, 0, 255);
  ellipse(x, y, 50, 50);
 y=y+20;
 fill(255, 255, 255);
 rect( mouseX, mouseY, 70, 100);
 checkCatch();
 if (y >= 600) {
   y=-50;
   x= (int) random (0, 500);
   if (score > 0) {
   score--;
  }
 }
   fill(0, 0, 0);
   textSize (16);
   text("Score: " + score, 20, 20);  
 
}
