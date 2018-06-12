package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double randomNumber;
        randomNumber = Math.random();
        System.out.println("The Random Number is: " + randomNumber);
        double randomNumberToInteger = randomNumber * 100;

        double randomNumberTimesHundred = randomNumber * 100;
        System.out.println("The Random Number times 100 is :" + randomNumberTimesHundred);

        double randomNumberRoundedToCeil = Math.ceil(randomNumber);
        System.out.println(randomNumberRoundedToCeil);

        double randomNumberRoundedToFloor = Math.floor(randomNumberTimesHundred);
        System.out.println("the rounded to floor is; " + randomNumberRoundedToFloor);

        double randomNumberRoundedNormally = Math.round(randomNumberTimesHundred);
        System.out.println("The Rounding that we're not used to: " + randomNumberRoundedNormally);

    }
}
