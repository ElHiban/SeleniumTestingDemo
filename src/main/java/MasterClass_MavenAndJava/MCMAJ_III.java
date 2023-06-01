package MasterClass_MavenAndJava;

public class MCMAJ_III {

    public static void main(String[] args) {
        //Find the second largest element in a numeric array

        int [] elements = {1,2,3,10,5,6,7,8,9,4};
        int max = elements[0];
        int max2 = elements[1];

        for (int element : elements){
            if (element > max){
                max2 = max;
                max = element;
            }
            else{
                if (element > max2){
                    max2 = element;
                }
            }
        }

        System.out.println(max+" largest");
        System.out.println(max2+" second largest");
    }

}
