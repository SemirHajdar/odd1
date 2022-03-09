package odd;

public class Calculator {
    float numberA;
    float numberB;
    double PI = 3.14;
    float r;


    public Calculator (int numberA, int numberB,int r) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.r=r;
    }


    float sum () {
        return this.numberA + this.numberB;
    }
    float subtraction () {
        return this.numberA - this.numberB;
    }
    float multiplication () {
        return this.numberA * this.numberB;
    }
    float division () {
        return this.numberA / this.numberB;
    }
    float sumNNumbers (float number1,float number2) {
        return number1+number2;
    }
    float multiplicationNNumbers (float number1,float number2) {
        return number1 * number2;
    }
    double circleArea () {
        return this.r*this.r*PI;
    }

    public float getNumberA() {
        return numberA;
    }

    public void setNumberA(float numberA) {
        this.numberA = numberA;
    }

    public float getNumberB() {
        return numberB;
    }

    public void setNumberB(float numberB) {
        this.numberB = numberB;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}

