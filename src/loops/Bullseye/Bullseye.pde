int a=250;
int b=10;
void setup(){
 size(500,500); 
}
void draw(){
  noFill();
  for(int i=1; i<40; i++){
    b=b+10;
  ellipse(a,a,b,b);
  }
}