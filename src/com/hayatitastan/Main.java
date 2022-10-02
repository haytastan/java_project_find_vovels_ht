package com.hayatitastan;

/**
 * Created by Dr. Hayati TAŞTAN on 2.2.2022
 */
public class Main {
    public static void main(String[] args) {

        // write your code here,
        // kalın sesliler: A,a, I,ı, O,o, U,u
        // ince sesliler : E,e, İ,i, Ö,ö, Ü,ü

        char harf = 'A';

        /*
        // for ile çözüm:
        char kalin[] = {'A','I','O','U'};
        char ince[] = {'E','İ','Ö','Ü'};

        for(char sesli: kalin){
            if (Character.toUpperCase(harf)==sesli){
                System.out.println(harf +  " HARFİ, KALIN SESLİDİR.");
                return;
            }

        }

        for(char sesli: ince){
            if (Character.toUpperCase(harf)==sesli){
                System.out.println(harf + " HARFİ, İNCE SESLİDİR.");
                return;
            }
        }

        System.out.println(harf + " SESLİ HARF DEĞİLDİR.");

        */

        // switch ile çözüm:
        switch (Character.toUpperCase(harf)) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println(harf + " KALIN SESLİ HARFTİR");
                break;
            case 'E':
            case 'Ö':
            case 'İ':
            case 'Ü':
                System.out.println(harf + " İNCE SESLİ HARFTİR");
                break;
            default:
                System.out.println(harf + " SESLİ HARF DEĞİLDİR");
        }


    }
}
