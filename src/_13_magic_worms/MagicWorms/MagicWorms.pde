void setup() {
  size(300, 300);
  background(0, 0, 0);
}

void draw() {
  makeMagical();
  for (int i=0; i<301; i++) {
    fill(frameCount, i, 0);
    ellipse(getWormX(i), getWormY(i), 6, 2);
    
  
  
  }
  
}

  float frequency = .001;
    float noiseInterval = PI;
    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }
    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }
    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
  
