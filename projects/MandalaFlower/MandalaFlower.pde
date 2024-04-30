import controlP5.*;
import javax.swing.*; 

float centerX;
float centerY;
float moveSpeed = 1;

float outerArches;
float innerArches;
float outerRadius;
float innerRadius;
int numPetals;
float distance;
float controlPointOneX;
float controlPointOneY;
float controlPointTwoY;

color startColor = color(209, 61, 91);
color endColor = color(42, 173, 123);

ControlP5 cp5;
Slider outerArchSlider;
Slider innerArchSlider;
Slider outerRadiusSlider;
Slider innerRadiusSlider;
Slider petalSlider;
Slider distanceSlider;
ColorPicker startColorPicker;
ColorPicker endColorPicker;
Slider oneXSlider;
Slider oneYSlider;
Slider twoYSlider;

int sliderSize = 200;
int colorPickerSize = 200;

ControlFont font;

boolean isHardcoded;


void setup() {
  size(1400, 900);
  background(#000000);
  centerX = width / 2;
  centerY = height / 2;
  
  font = new ControlFont(createFont("ProcessingSans-Bold-48", 14));
  float leftAlign = centerX - width/2.15;
  float rightAlign = centerX + width/2.35 - sliderSize;
  
  float topAlign = centerY - height/2.25;
  float bottomAlign = centerY + height/2.45;
 
  outerArches = 5;
  innerArches = 5;
  outerRadius = 200;
  innerRadius = 50;
  numPetals = 0;
  distance = 1;
  controlPointOneX = 1;
  controlPointOneY = 1;
  controlPointTwoY = 1;
  
  cp5 = new ControlP5(this);
  
  outerArchSlider = cp5.addSlider("# Outer Arches")
            .setPosition(leftAlign, topAlign)
            .setSize(sliderSize, 20)
            .setRange(0, 50)
            .setValue(outerArches)
            .setNumberOfTickMarks(51)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);

  innerArchSlider = cp5.addSlider("# Inner Arches")
            .setPosition(leftAlign, topAlign + 30)
            .setSize(200, 20)
            .setRange(0, 50)
            .setValue(innerArches)
            .setNumberOfTickMarks(51)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);

  petalSlider = cp5.addSlider("Number of Petals")
            .setPosition(leftAlign, topAlign + 60)
            .setSize(200, 20) 
            .setRange(2, 50) 
            .setValue(numPetals)
            .setNumberOfTickMarks(49)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);
            
  outerRadiusSlider = cp5.addSlider("Outer Radius")
            .setPosition(rightAlign - 50, topAlign)
            .setSize(sliderSize, 20) 
            .setRange(-360, 360) 
            .setValue(outerRadius);
  
  innerRadiusSlider = cp5.addSlider("Inner Radius")
            .setPosition(rightAlign - 50, topAlign + 30)
            .setSize(sliderSize, 20) 
            .setRange(-360, 360) 
            .setValue(innerRadius); 

  distanceSlider = cp5.addSlider("Distance Factor")
            .setPosition(rightAlign - 50, topAlign + 60)
            .setSize(sliderSize, 20) 
            .setRange(-4, 4)
            .setValue(distance); 

  oneXSlider = cp5.addSlider("Petal Shape Editor")
            .setPosition(leftAlign, bottomAlign - 90)
            .setSize(sliderSize, 20) 
            .setRange(-4, 4) 
            .setValue(controlPointOneX); 
            
  oneYSlider = cp5.addSlider("Outer Petal Size Editor")
            .setPosition(leftAlign, bottomAlign - 60)
            .setSize(sliderSize, 20) 
            .setRange(-4, 4) 
            .setValue(controlPointOneY); 
  
  startColorPicker = cp5.addColorPicker("Start Color")
                    .setPosition(leftAlign, bottomAlign - 30)
                    .setSize(colorPickerSize, colorPickerSize) 
                    .setColorValue(startColor);
            
  twoYSlider = cp5.addSlider("Inner Petal Size Editor")
            .setPosition(rightAlign - 50, bottomAlign - 60)
            .setSize(sliderSize, 20)
            .setRange(-4, 4) 
            .setValue(controlPointTwoY); 
            
  endColorPicker = cp5.addColorPicker("End Color")
                    .setPosition(rightAlign - 50, bottomAlign - 30)
                    .setSize(colorPickerSize, colorPickerSize)
                    .setColorValue(endColor); 

  isHardcoded = false;
}


void draw() {
    background(0);
    noFill();
    translate(centerX, centerY);
    
    if(isHardcoded){
      drawHardcodedMandala();
    } else{
      drawControllableMandala();
    }
   
    resetMatrix();
}


void drawHardcodedMandala(){
  controlPointOneX = 3.77;
  controlPointOneY = 1.13;
  controlPointTwoY = 0.81;
  
  startColor = color(0, 114, 255, 42);
  endColor = color(235, 189, 0, 43);
  
   drawArchMandala(9, 10, 191.94, 314, 7, 0.85, moveSpeed);
   moveSpeed+=0.001;
    
   cp5.setVisible(false);
}

void drawControllableMandala(){
    startColor = startColorPicker.getColorValue();
    endColor = endColorPicker.getColorValue();
   
    drawArchMandala(
      (int) outerArchSlider.getValue(), 
      (int) innerArchSlider.getValue(),  
      outerRadiusSlider.getValue(),  
      innerRadiusSlider.getValue(), 
      (int) petalSlider.getValue(),   
      distanceSlider.getValue(),  
      moveSpeed
    );
    
    moveSpeed+=0.001;
    cp5.setVisible(true);
}
