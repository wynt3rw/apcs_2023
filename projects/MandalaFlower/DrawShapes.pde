void drawArch(float innerRadius, float outerRadius, int numArches, float offset, color c, float strokeSize){
  rotate(offset);
  
  float angleBetween = 360f/numArches;
  float calculatedAngle = 90 - angleBetween/2f;
  
  stroke(c);
  strokeWeight(strokeSize);

  float x1 = -cos(calculatedAngle*PI/180)*innerRadius;
  float y1 = -sin(calculatedAngle*PI/180)*innerRadius;  
  
  float x4 =  0;
  float y4 = -outerRadius;
  
  float x2 = x1*oneXSlider.getValue();
  float y2 = (y4 + y1)*oneYSlider.getValue()/ 2;
  
  float x3 = x4;
  float y3 = (y4 + y1)*twoYSlider.getValue() / 2;
  
  for (int i = 0; i < numArches; i++){
    bezier(x1, y1, x2, y2, x3, y3, x4, y4);
    bezier(-x1, y1, -x2, y2, -x3, y3, -x4, y4);
    
    rotate(angleBetween*PI/180);
  }
}
