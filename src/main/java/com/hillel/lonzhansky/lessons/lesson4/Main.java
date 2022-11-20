package com.hillel.lonzhansky.lessons.lesson4;

public class Main {
    public static void main(String[] args) {


//        int a = 2;
//        int b = -3;
//        int c = 16;



//        a. | a - b | / ( a + b ) * 3 - √c

//        double result = (double) Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
//        System.out.println(result);
//        System.out.println(Math.abs(a - b));
//        System.out.println(Math.abs(a - b) / (a + b));
//        System.out.println(Math.abs(a - b) / (a + b) * 3);
//        System.out.println(Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c));





//        b. ( a + b ) / 12 * c % 4 + |b|

        int a = 2;
        int b = -3;
        int c = 16;
        double result2 = (a + b) / 12.0 * c % 4 + Math.abs(b);
        double result3 = (double) (a + b) / 12.0 * c % 4 + Math.abs(b);
//        double result4 = (a + b) / 12 * c % 4 + Math.abs(b); // ERROR (not have cast to double)

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
//        System.out.println("result4 = " + result4);


        System.out.println((a + b));
        System.out.println((double) (a + b) / 12);
        System.out.println((double) (a + b) / 12 * c);
        System.out.println((double) (a + b) / 12 * c % 4);
        System.out.println((double) (a + b) / 12 * c % 4 + Math.abs(b));




    }











    static void task1() {
        //        Дано: зарплати трьох працівників за 1 місяць (salary1, salary2, salary3)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

        int salary1 = 700;
        int salary2 = 2000;
        int salary3 = 3500;

        int countMonth10Years = 10 * 12;

        int salary1For10Years = salary1 * countMonth10Years;
        int salary2For10Years = salary2 * countMonth10Years;
        int salary3For10Years = salary3 * countMonth10Years;

        System.out.println("salary1For10Years = " + salary1For10Years);
        System.out.println("salary2For10Years = " + salary2For10Years);
        System.out.println("salary3For10Years = " + salary3For10Years);


        double salary1WithoutTax = salary1For10Years - salary1For10Years * 0.05;
        double salary2WithoutTax = salary2For10Years - salary2For10Years * 0.05;
        double salary3WithoutTax = salary3For10Years - salary3For10Years * 0.05;

        System.out.println();
        System.out.println("salary1WithoutTax = " + salary1WithoutTax);
        System.out.println("salary2WithoutTax = " + salary2WithoutTax);
        System.out.println("salary3WithoutTax = " + salary3WithoutTax);

        System.out.println();
        System.out.println("avg = " + ((salary1WithoutTax + salary2WithoutTax + salary3WithoutTax) / 3));
        System.out.println("sum all = " + (salary1WithoutTax + salary2WithoutTax + salary3WithoutTax));
    }


    static void demo1() {
//        System.out.println(10 + 5);

//        int x = 10;
//        int y = 3;


//        int result = x + y;
//
//        System.out.println(result);
//
//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println(x / y);

//        System.out.println((int) 3.3333333333333335);
//        System.out.println(x / y);
//        System.out.println((double) x / y);
//        System.out.println(x / (double) y);
//        System.out.println((double) x / (double)y);


//        System.out.println(x % y); //10 / 3 = 3. 3*3 = 9; 10 - 9 = 1


//        int result = 5;

//        result = result + 2;

//        result += 2;
//        System.out.println(result);
//        result -= 2;
//        System.out.println(result);
//        result *= 2;
//        System.out.println(result);
//        result /= 2;
//        System.out.println(result);
//        result %= 2;
//        System.out.println(result);


        int x = 5;
        int y = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int result = x++ + ++y + x++ - y--;

        System.out.println("result = " + result); // 11
        System.out.println("x = " + x);   // 7
        System.out.println("y = " + y);   // 10
    }

    static void demo2() {

//        int resultABS = Math.abs(-10);
//        System.out.println(resultABS);
//
//
//        double pow = Math.pow(2, 2);
//        System.out.println(pow);
//
//
//        double sqrt = Math.sqrt(25);
//        System.out.println(sqrt);
//
//        System.out.println();
//        System.out.println(Math.round(10.4));
//        System.out.println(Math.round(10.49999999999999999999999999999));
//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.99999999));


        // [0.0, 1) -> 0.0 - 0.9999999999999999999999;
//        System.out.println(Math.random());


        // min: 0.0 * 10 = 0.0 -> 0
        // max: 0.99999 * 11 = 10.99999999 -> 10
        System.out.println((int) (Math.random() * 11));



        // from 25 to 40

        // 0.999 * 16 = 15.9999 -> 15

//        int randomNumber = (int) (Math.random() * 41 - 26); // BAD VERSION


        int min = 25;
        int max = 40;

        int randomNumber = (int) ((Math.random() * (max - min + 1)) + min);
    }
}
