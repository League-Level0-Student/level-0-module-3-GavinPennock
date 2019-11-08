void setup(){
  size(500,500);
}
void draw(){
  for(int i=500; i>0; i-=99){
    if(i %2 ==0){
      fill(1000,0,0);
    }
    else if(i % 2==1){
      fill(0,0,0);
    }
  ellipse(250,250,i,i);
  }
}
