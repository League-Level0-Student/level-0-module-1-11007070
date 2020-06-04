
void setup() {
    size(500, 500);
    fill(#FFCD8B);
    ellipse( 250, 250, 300, 300);
    fill(#FF3939);
    ellipse(250, 250, 280, 280);
    fill(#FFE239);
    ellipse(250, 250, 260, 260);
}
void draw() {
  if (mousePressed) {  
  PImage pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(60,60);
    image(pepperoni, 180, 200);
    PImage mushroom = loadImage("mushroom.png");
    mushroom.resize(60,60);
    image(mushroom, 250, 200);
    PImage greenPepper = loadImage("greenPepper.png");
    greenPepper.resize(60,60);
    image(greenPepper, 220, 290);
    PImage blackOlive = loadImage("blackOlive.jpg");
    blackOlive.resize(60,60);
    image(blackOlive, 220, 130);
  }
}
