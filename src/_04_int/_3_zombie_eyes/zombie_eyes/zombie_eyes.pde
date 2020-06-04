
void setup() {
PImage face = loadImage("face.png");
size(600,600);
face.resize(600,600);
image(face, 0, 0);
}
void draw() {
//fill (#FF1717);
fill(mouseX,mouseY,100);
ellipse(170, 200, 100, 80);
ellipse(417, 180, 100, 80);
fill(#0A0A0A);
ellipse(170, 200, 30, 30);
ellipse(417, 180, 30, 30);
}
