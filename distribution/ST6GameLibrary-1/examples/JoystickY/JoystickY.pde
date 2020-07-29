/**
*Note:
*import HAStudios.ST6.*=
*import HAStudios.ST6.serial
*import HAStudios.ST6.ST6
*/

import HAStudios.ST6.*;

ST6 mySt6;

void setup(){
  mySt6 = new ST6(this,new serial(this,"COM16",9600),0);
}

void draw(){
  background(mySt6.GetJoystickY());
}
