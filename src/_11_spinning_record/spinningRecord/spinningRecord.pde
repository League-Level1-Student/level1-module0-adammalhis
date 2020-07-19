PImage pictureOfRecord;
int recordAngle= 0;

void setup() {
  size(600, 600);
  pictureOfRecord= loadImage("record.jpeg");
 pictureOfRecord.resize(600, 600);
}
void draw() {
  rotateImage(pictureOfRecord, recordAngle);
  image(pictureOfRecord, 0, 0);
  if (mousePressed) {
  recordAngle= recordAngle+1; 
  }
}
void rotateImage(PImage pictureOfRecord, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-pictureOfRecord.width/2,-pictureOfRecord.height/2);
  
}
