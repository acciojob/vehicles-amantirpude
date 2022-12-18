package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,4,6,isManual,"sport",5);
    }
    public void accelerate(int rate){
        int newSpeed = 0;
        newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0) {
            stop();
            changeGear(1);
        }
        if(newSpeed > 0) {
            if(newSpeed > 250 ){
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(6);
            }
            else if(newSpeed > 200 ){
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(5);
            }
            else if(newSpeed > 150 ){
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(4);
            }
            else if(newSpeed > 100 ){
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(3);
            }
            else if(newSpeed > 50 ){
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(2);
            }
            else{
                changeSpeed(newSpeed, getCurrentDirection());
                changeGear(1);
            }
        }
    }
}