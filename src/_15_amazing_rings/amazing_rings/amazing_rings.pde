int X1=625;
int X2=75;
int S1=-1;
int S2=1;
void setup(){
  size(700,700);
}
void draw(){
  background(1000,1000,1000);
  for(int i=150; i>0; i-=9){
    noFill();
  
  ellipse(X1,350,i,i);
  }
  for(int i=150; i>0; i-=9){
    noFill();
  
  ellipse(X2,350,i,i);
  
  }
  
  X1+=S1;
  X2+=S2;
  if(X1<75 || X1>625){
    S1=-S1;
  }
  if(X2>625 || X2<75){
    S2=-S2;
  }
}
