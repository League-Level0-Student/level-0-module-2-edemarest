void setup() {
  
  size(800,200);
  

  

  
  
  
  
  
}



void draw() {
  
    int coord = 50;
    ellipse(coord, 100, 50, 50);
    fill(#5DFFB7);
    
    if (mousePressed) {
      ellipse(coord++, 100, 50, 50);
    }
    
    
}
