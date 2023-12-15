package coding.java;

public class CovertSentenceCAse {
    public static void main(String[] args) {

            String s = "my name is computer";
            String rev = "";

            String s1 [] = s.split(" ");

        for (int i = 0; i < s1.length ; i++) {
            
            int n =s1[i].length ();


            String n1= s1[i].substring ( 0, 1 ).toUpperCase ();
            String n2 = s1[i].substring ( 1, n);


            rev = rev + " " + (n1+n2);
        }

            System.out.println(rev.trim());
    }

    }


