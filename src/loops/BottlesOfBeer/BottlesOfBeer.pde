int x = 100;
void setup(){
for(int i=1; i<100; i++){
  x--;
  print(x, "bottles of beer on the wall, ", x," bottles of beer. Take one down and pass it around, ",x," bottles of beer on the wall. ");
}
print ("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, ",x," bottles of beer on the wall.");
}