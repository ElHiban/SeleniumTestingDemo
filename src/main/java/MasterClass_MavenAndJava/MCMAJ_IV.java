package MasterClass_MavenAndJava;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MCMAJ_IV {

    public static void main(String[] args) {
        //Find the difference (pick report type) between two dates

        String sD1=null;
        String sD2=null;

        Scanner in = new Scanner(System.in);
        System.out.println("Insert two dates, with the format yyyy-mm-dd");

        try{
            System.out.print("Date 1: ");
            sD1 = in.nextLine();
            LocalDate d1 = LocalDate.parse(sD1);
            System.out.print("Date 2: ");
            sD2 = in.nextLine();
            LocalDate d2 = LocalDate.parse(sD2);
        }catch (Exception e){
            System.out.println("The given data was not correct");
        }

        String aD1 [] = sD1.split("-");
        String aD2 [] = sD2.split("-");
        int D1days = (Integer.parseInt(aD1[0])*365) + (Integer.parseInt(aD1[1])*30) + Integer.parseInt(aD1[2]);
        int D2days = (Integer.parseInt(aD2[0])*365) + (Integer.parseInt(aD2[1])*30) + Integer.parseInt(aD2[2]);
        System.out.println("The difference between those 2 dates, are "+Math.abs(D1days-D2days)+" days");

        /*
        if (Integer.parseInt(aD1[0]) > Integer.parseInt(aD2[0])){
            //aD1 - aD2
        }else{
            if (Integer.parseInt(aD1[0]) < Integer.parseInt(aD2[0])){
                //aD2 - aD1
            }else{
                //check month
                if (Integer.parseInt(aD1[1]) > Integer.parseInt(aD2[1])){
                    //aD1 -AD2
                }else{
                    if (Integer.parseInt(aD1[0]) < Integer.parseInt(aD2[0])){
                        //aD2 - aD1
                    }else{
                        //check day
                        if (Integer.parseInt(aD1[0]) > Integer.parseInt(aD2[0])){
                            //aD1 -AD2
                        }else{
                            if (Integer.parseInt(aD1[0]) < Integer.parseInt(aD2[0])){
                                //aD2 - aD1
                            }else{
                                System.out.println("Same date, the difference between these dates are 0 years, 0 months and 0 days");
                            }
                        }
                    }
                }
            }
        }
        */
    }
}
