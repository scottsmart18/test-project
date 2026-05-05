package com.davidniu.structure;

public class CommandLine {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("no arguments");
            return;
        }


        System.out.println("args");
        for (String arg : args) {
            System.out.println(arg);
        }


        System.out.println("args.length" + args.length);
    }
}
