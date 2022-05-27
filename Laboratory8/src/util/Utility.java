/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Profesor Lic. Gilberth Chaves Avila
 */
public class Utility {

    public static int random() {
        return 1 + (int) Math.floor(Math.random() * 99);
    }

    public static int random(int bound) {
        //return 1+random.nextInt(bound);
        return 1 + (int) Math.floor(Math.random() * bound);
    }

    public static int random(int lowBound, int highBound) {
        return lowBound + (int) Math.floor(Math.random() * highBound);
    }

    public static String format(double value) {
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }

    public static String $format(double value) {
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }

    public static String perFormat(double value) {
        //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }

    public static void fill(int a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99) + 1;
        }
    }
    
    public static void fill(Integer a[]) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99) + 1;
        }
    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }//if
            }//for j
        }//for i
    }

    public static String show(int[] a) {
        String result = "";
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (counter++ >= 50) {
                result += "\n";
                counter = 0;
            }
            result += a[i] + " ";
        }
        return result;
    }

    private static String instanceOf(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return "Integer";
        }
        if (a instanceof String && b instanceof String) {
            return "String";
        }
        if (a instanceof Character && b instanceof Character) {
            return "Character";
        }
        return "Unknown";
    }

    public static boolean equals(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                //return x==y;
                return a1.equals(b1);
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.equalsIgnoreCase(a2);
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) == 0;

        }
        return false;
    }

    //less than (menorQ)
    public static boolean lessT(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                return a1 < b1;
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.compareToIgnoreCase(b2) < 0;
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) < 0;
        }
        return false;
    }

    //less or equal to (menor o igual que)
    public static boolean lessOrEqualT(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                return a1 <= b1;
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.compareToIgnoreCase(b2) <= 0;
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(b3) <= 0;
        }
        return false; //en cualquier otro caso
    }

    //greater than (mayorQ)
    public static boolean greaterT(Object a, Object b) {
        switch (instanceOf(a, b)) {
            case "Integer":
                Integer a1 = (Integer) a;
                Integer b1 = (Integer) b;
                return a1 > b1;
            case "String":
                String a2 = (String) a;
                String b2 = (String) b;
                return a2.compareToIgnoreCase(b2) > 0;
            case "Character":
                Character a3 = (Character) a;
                Character b3 = (Character) b;
                return a3.compareTo(a3) > 0;
        }
        return false;
    }

    public static boolean isLetter(char value) {
        return Character.isLetter(value);
    }

    public static boolean isNumber(char value) {
        return Character.isDigit(value);
    }

    public static int maxArray(int[] a) {
        int max = a[0]; //first element
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static Object maxArray(Object[] a) {
        Object max = a[0]; //first element
        for (int i = 1; i < a.length; i++) {
            if (greaterT(a[i], max)) {
                //if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static String show(int[] array, int bound) {
        String result = " ";
        for (int i = 1; i <= bound; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    public static String show(Object[] array, int bound) {
        String result = " ";
        for (int i = 0; i <= bound; i++) {
            result += array[i] + " ";
        }
        return result;
    }
    
    public static Object randomCharacter() {
        char abc[] = new char[26];
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            abc[count++] = i;
        }
        return abc[random(25) - 1];
    }
}
