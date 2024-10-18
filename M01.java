// 12S24014 - Arion Dippos Pandapotan Manurung
// 12S24020 - Joice Anastasya Napitupulu
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double peforma, nilai, a, aB, b, bC, c, d, e;
        double kredit1;
        String nilai1, kredit;

        kredit1 = 0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            nilai1 = input.nextLine();
            if (nilai1.equals("A")) {
                nilai = 4.0;
            } else {
                if (nilai1.equals("AB")) {
                    nilai = 3.5;
                } else {
                    if (nilai1.equals("B")) {
                        nilai = 3.0;
                    } else {
                        if (nilai1.equals("BC")) {
                            nilai = 2.5;
                        } else {
                            if (nilai1.equals("C")) {
                                nilai = 2.0;
                            } else {
                                if (nilai1.equals("D")) {
                                    nilai = 1.0;
                                } else {
                                    if (nilai1.equals("E")) {
                                        nilai = 0.0;
                                    } else {
                                        nilai = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            peforma = Integer.parseDouble(kredit) * nilai;
            System.out.println(toFixed(peforma,1));
            kredit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
