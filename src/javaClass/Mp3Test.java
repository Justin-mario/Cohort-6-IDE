package javaClass;

import java.util.Scanner;

public class Mp3Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mp3 music = new Mp3(true, 1, false);

        System.out.println("IS ON  " + music.isOn());
        if (music.isOn() == true) {
            System.out.println("  Volume: " + music.getVolume());
            System.out.println("Mute: " + music.isMute());
            System.out.println("Increase Volume: " + music.increaseVolume());
            System.out.println("Decrease Volume: " + music.decreaseVolume());
            System.out.println("Channel: " + music.getChannel());
            System.out.println("Increase Channel: " + music.increaseChannel());
            System.out.println("Decrease Channel: " + music.decreaseChannel());


        }

    }
    //else {
        //System.out.print("Turn On Please");}
    }




