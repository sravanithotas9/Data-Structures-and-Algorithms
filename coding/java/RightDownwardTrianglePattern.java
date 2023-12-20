package coding.java;

public class RightDownwardTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= i; j++) {
                //this is for empty triangle
                System.out.print("  ");

                //here print statement inner loops spaces should be given same as above print statements of empty space and * are given two spaces

            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

