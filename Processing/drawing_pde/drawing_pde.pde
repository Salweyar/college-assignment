/*
Description: This sketch I'm making Robot
Created By: Salweyar Patel
Due Date: November 14, 2018
Course: COMP-1029
*/
void setup(){
  size(600,500);
}

int x = 300;
int y = 400;
int z = 100;

void draw(){
  color circlecolor = color(167,167,167);
    fill(circlecolor);
    stroke(0,0,0);
  ellipse(x,y-250,150,z); //head
  ellipse(x,y,50,50);     //leg
  
  color trianglecolor = color(87,87,87);
    fill(trianglecolor);
    stroke(50,100,50);
  triangle(z,375,x,200,y+100,375); //body
  triangle(z+150,50,x,10,y-50,50); //Antina's tip where singal are recieve
  
  color linecolor = color(50,50,50);
   fill(linecolor);
   stroke(100,100,100);
  line(x,50,x,z); //Antina's stand attached on head
  
  // arms
  line(z,y-200,200,285); 
  line(x+200,y-200,400,285);
  
  // mouth
  line(y-125,z+75,x+25,175);
  line(285,z+70,285,y-220);
  line(x,z+70,x,y-220);
  line(x+15,z+70,y-85,180);
  
  color rectanglecolor = color(255,255,255);
   fill(rectanglecolor);
   stroke(0,0,50);
  
  // eyes
  rect(y-135,z+25,20,20);
  rect(x+15,z+25,20,20);
  
}
