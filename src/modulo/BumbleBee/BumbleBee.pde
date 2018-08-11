int a=0;
void draw(){
  for(int i=1; i<45; i++){
    a=a+10;
    if(i%2==0){
    fill(255,251,28);
    }
    else{
      fill(0,0,0);
    }
    ellipse(a,a,50,50);
  }
  a=0;
  drawBeeFace(450,450);
}

void drawFlower(int x, int y){
  noStroke();
  translate(x,y);
  fill(154,250,182);
  for(int i=0; i<5; i++) {
    ellipse(0,-40, 50,50);
    rotate(radians(72));
  }
  fill(255,249,187);
  ellipse(0,0,50,50);
}
void drawBeeFace(int BeeFaceX, int BeeFaceY){
  noStroke();
  fill(0,0,0);
  stroke(1);
  strokeWeight(5);
  line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
  line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
  ellipse(BeeFaceX-17, BeeFaceY-50, 10,10);
  ellipse(BeeFaceX+17, BeeFaceY-50, 10,10);
  noStroke();
  fill(0,0,0);
  ellipse(BeeFaceX-10, BeeFaceY-15, 10,10); // eyes
  ellipse(BeeFaceX+10, BeeFaceY-15, 10,10);
  ellipse(BeeFaceX, BeeFaceY-5, 10,10); //nose
  ellipse(BeeFaceX, BeeFaceY+10, 20, 10); //mouth
  fill(255,251,28);
  ellipse(BeeFaceX, BeeFaceY-5, 20,6);
}
void setup(){
  ellipseMode(CENTER);
  size(500,500);
  background(160,160,160);
  drawFlower(350,100);
}