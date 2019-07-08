package org.dimigo.oop;

/**
 * 
 */
public class Car {

    /**
     * Default constructor
     */
    public Car() {
    }

    private String Company;
    private String Model;
    private String Color;
    private String Type;
    private int Price;

    public void Forward() {
        System.out.println("전진합니다.");
    }

    public void Backward() {
        System.out.println("후진합니다.");
    }

    public boolean Stop() {
        System.out.println("정지합니다.");
        return true;
    }

    public void TurnRight(int angle) {
        System.out.println(angle + "도 우회전 합니다.");
    }

    public void TurnLeft(int angle) {
        System.out.println(angle + "도 좌회전 합니다.");
    }

}