package practiceprograms1;

public class InsertReplace {

    public static void main(String[] args) {

        String str = "Java is good";

        // Replace
        
        String replaced = str.replace("good", "awesome");
        System.out.println("After replace: " + replaced);

        // Insert 
        
        String inserted = str.substring(0, 7) + "very " + str.substring(7);
        System.out.println("After insert: " + inserted);
    }
}
