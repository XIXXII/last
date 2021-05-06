package edu.qc.seclass;

public class BuggyClass {
    //Task1: 1) 100% statement coverage. 2) less than 50% statement coverage and reveal fault
    //Idea: more statements inside of the if loop
    //so when the condition not meet, less number of statement executed
    public int buggyMethod1(int a, int b) {
        if(a > 0){
            a = b * 2;
            a++;
            a+=5;
            a-=3;
        }
        if(b > 0){
            b+=2;
            b-=2;
        }
        return a/b;
    }

    //Task2: 1) 100% statement coverage. 2) more than 50% branch coverage and reveal fault
    //Idea: have two test cases that meet if condition and else
    //so when the condition not meet, it will execute invisible 'else'
    public int buggyMethod2(int a, int b) {
        if(a > 0){
            a = b * 2;
            a++;
            a+=10;
        }
        if(b > -1){
            b*=3;
            b/=3;
        }
        return a/b;
    }

    //Task3: 1) 100% branch coverage. 2) 100% statement coverage and not 100% branch coverage and reveal fault
    //Idea: have two test cases that meet if condition and else
    public int buggyMethod3(int a, int b) {
        if(a != 0){
            a++;
            a+=2;
        }
        if(b < a){
            a++;
            a--;
        }
        return a/b;
    }

    public int buggyMethod4(int a, int b){
        if(a == b){
            a+=5;
            b/=100;
        }
        if(a > 2){
            b*=2;
            a+=b;
        }
        return a/b;
    }

    public void buggyMethod5(int i){
        //It is not possible to create such a method.
        //Reason: First, we are not able use any method to caught the exception.
        //So, line 4 will revealed by any test suite.
        //Since we are allow to add more lines before line4, we can have a if condition to avoid it.
        //However, we need to reach 100% statement coverage. Thus, line4 should be executed.
        //Overall, it is not possible to create such a method.
    }
}