int a = 200;
int b=10;
int c=600;
void setup(){
  size(800,500);
}
void draw(){
  background(129,220,245);
  noFill();
  for(int x=1; x<5; x++){
  for(int i=1; i<30; i++){
    b=b+10;
    ellipse(a,200,b,b);
  }
  b=10;
  noFill();
  for(int i=1; i<30; i++){
    b=b+10;
    ellipse(c,200,b,b);
}
b=0;
}
a=a+2;
c=c-2;
}