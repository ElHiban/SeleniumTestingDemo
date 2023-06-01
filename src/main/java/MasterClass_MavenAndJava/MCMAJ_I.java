package MasterClass_MavenAndJava;

public class MCMAJ_I {

    public static void main(String[] args) {
        /*
        Print elements of an array
        Each element in one line
        Each element separated with commas
         */
        int [] elements= {1, 2, 3, 4, 5, 6};

        for (int element : elements){
            System.out.println(element);
        }

        for (int element : elements){
            System.out.print(element);
            if (element!=elements[elements.length-1]){
                System.out.print(",");
            }
        }

    }

}
