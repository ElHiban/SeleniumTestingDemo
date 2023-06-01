package MasterClass_MavenAndJava;

public class MCMAJ_II {

    public static void main(String[] args) {
        //Print even and odd numbers from an array

        int [] elements= {1, 2, 3, 4, 5, 6};
        int [] evens;
        int [] odds;

        for (int element : elements){
            if(element % 2 == 0){
                //even
                System.out.println(element+" is even");
            } else {
                //odd
                System.out.println(element+" is odd");
            }
        }
    }

}
