import controlP5.*;
import javax.swing.*; 

float centerX;
float centerY;
float moveSpeed = 1;

// controllable parameters
float outerArches;
float innerArches;
float outerRadius;
float innerRadius;
int numPetals;
float distance;
float controlPointOneX;
float controlPointOneY;
float controlPointTwoX;
float controlPointTwoY;

color startColor = color(0, 154, 255);
color endColor = color(255, 208, 0);

//GUIs for controlling parameters
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
Slider twoXSlider;
Slider twoYSlider;

int sliderSize = 200;
int colorPickerSize = 100;

ControlFont font;

boolean isHardcoded;

void setup() {
  size(1400, 900);
  
  background(0);
  centerX = width / 2;
  centerY = height / 2;
  
  font = new ControlFont(createFont("ProcessingSans-Bold-48", 14));
  float leftAlign = centerX - width/2.15;
  float rightAlign = centerX + width/2.35 - sliderSize;
  
  float topAlign = centerY - height/2.25;
  float bottomAlign = centerY + height/2.45;
 
  // set initial variable values
  outerArches = 5;
  innerArches = 5;
  outerRadius = 200;
  innerRadius = 50;
  numPetals = 0;
  distance = 1;
  controlPointOneX = 1;
  controlPointOneY = 1;
  controlPointTwoX = 1;
  controlPointTwoY = 1;
  
  //set sliders
  cp5 = new ControlP5(this);
  
  outerArchSlider = cp5.addSlider("# Outer Arches")
            .setPosition(leftAlign, topAlign)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(0, 50) // Minimum and maximum values
            .setValue(outerArches) // Initial value
            .setNumberOfTickMarks(51)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);

  innerArchSlider = cp5.addSlider("# Inner Arches")
            .setPosition(leftAlign, topAlign + 30)
            .setSize(200, 20) // Width and height of the slider
            .setRange(0, 50) // Minimum and maximum values
            .setValue(innerArches) // Initial value
            .setNumberOfTickMarks(51)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);

  petalSlider = cp5.addSlider("Number of Petals")
            .setPosition(leftAlign, topAlign + 60)
            .setSize(200, 20) // Width and height of the slider
            .setRange(2, 50) // Minimum and maximum values
            .setValue(numPetals) // Initial value
            .setNumberOfTickMarks(49)
            .showTickMarks(false)
            .setSliderMode(Slider.FIX);
            
  outerRadiusSlider = cp5.addSlider("Outer Radius")
            .setPosition(rightAlign - 50, topAlign)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-360, 360) // Minimum and maximum values
            .setValue(outerRadius); // Initial value 
  
  innerRadiusSlider = cp5.addSlider("Inner Radius")
            .setPosition(rightAlign - 50, topAlign + 30)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-360, 360) // Minimum and maximum values
            .setValue(innerRadius); // Initial value

  distanceSlider = cp5.addSlider("Distance Factor")
            .setPosition(rightAlign - 50, topAlign + 60)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-4, 4) // Minimum and maximum values
            .setValue(distance); // Initial value

  oneXSlider = cp5.addSlider("Control Point 1 X")
            .setPosition(leftAlign, bottomAlign - 90)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-4, 4) // Minimum and maximum values
            .setValue(controlPointOneX); // Initial value
            
  oneYSlider = cp5.addSlider("Control Point 1 Y")
            .setPosition(leftAlign, bottomAlign - 60)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-4, 4) // Minimum and maximum values
            .setValue(controlPointOneY); // Initial value
  
  startColorPicker = cp5.addColorPicker("Start Color")
                    .setPosition(leftAlign, bottomAlign - 30)
                    .setSize(colorPickerSize, colorPickerSize) // Width and height of the color picker
                    .setColorValue(startColor); // Initial color value (optional)
  
  twoXSlider = cp5.addSlider("Control Point 2 X")
            .setPosition(rightAlign - 50, bottomAlign - 90)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-4, 4) // Minimum and maximum values
            .setValue(controlPointTwoX); // Initial value
            
  twoYSlider = cp5.addSlider("Control Point 2 Y")
            .setPosition(rightAlign - 50, bottomAlign - 60)
            .setSize(sliderSize, 20) // Width and height of the slider
            .setRange(-4, 4) // Minimum and maximum values
            .setValue(controlPointTwoY); // Initial value  
            
  endColorPicker = cp5.addColorPicker("End Color")
                    .setPosition(rightAlign - 50, bottomAlign - 30)
                    .setSize(colorPickerSize, colorPickerSize) // Width and height of the color picker
                    .setColorValue(endColor); // Initial color value (optional)

  isHardcoded = false;
}

void draw() {

    background(0);
    noFill();
    translate(centerX, centerY);
    
    //drawArchMandala(6, 6, 100, 90, 5, 2, moveSpeed, false, false, true);
    if(isHardcoded){
      drawHardcodedMandala();
    } else{
      drawControllableMandala();
    }
   
    // Reset translation for GUI elements
    resetMatrix();
}

void drawHardcodedMandala(){
  
  controlPointOneX = 3.77;
  controlPointOneY = 1.13;
  controlPointTwoX = 1.57;
  controlPointTwoY = 0.81;
  
  startColor = color(0, 114, 255, 42);
  endColor = color(235, 189, 0, 43);
  
   drawArchMandala(
      9,    //numOuterArches (int)
      10,    //numInnerArches (int)
      191.94,  //baseOuterRadius (float)
      314,  //baseInnerRadius  (float)
      7,    //numPetals (int)
      0.85,    //distanceFactor (float) 
      moveSpeed //speed (float)
    );
    moveSpeed+=0.001;
    
    cp5.setVisible(false);
}

void drawControllableMandala(){
  
    startColor = startColorPicker.getColorValue();
    endColor = endColorPicker.getColorValue();
   
    drawArchMandala(
      (int) outerArchSlider.getValue(),    //numOuterArches (int)
      (int) innerArchSlider.getValue(),    //numInnerArches (int)
      outerRadiusSlider.getValue(),  //baseOuterRadius (float)
      innerRadiusSlider.getValue(),  //baseInnerRadius  (float)
      (int) petalSlider.getValue(),    //numPetals (int)
      distanceSlider.getValue(),    //distanceFactor (float) 
      moveSpeed //speed (float)
    );
    moveSpeed+=0.001;
    
    cp5.setVisible(true);
}
