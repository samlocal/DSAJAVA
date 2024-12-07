import java.util.Scanner;

public class LearnPatterns {
    public static void pattern1(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    public  static void pattern3_1(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4_1(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5_1(int n){
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        //for understanding spaces are replaced with -
        for(int i=0;i<n;i++)
        {
            //for spaces
            for(int space=0;space<n-i-1;space++)
            {
                System.out.print("-");
            }

            //for stars
            for(int star=0;star<2*i+1;star++)
            {
                System.out.print("*");
            }

            //for spaces
            for(int space=0;space<n-i-1;space++)
            {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void pattern8(int n){
        //for understanding spaces are replaced with -
        for(int i=0;i<n;i++)
        {
            //spaces
            for(int space=0;space<i;space++)
            {
                System.out.print("-");
            }

            //stars
            for(int star=0;star<2*n-(2*i + 1);star++)
            {
                System.out.print("*");
            }

            //spaces
            for(int space=0;space<i;space++)
            {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }

    public static  void pattern10(int n){
        for(int i=1;i<=(2*n-1);i++)
        {
            int stars=i>n?(2*n)-i:i;

            for(int star=0;star<stars;star++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern11(int n){
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0){//odd row
                for(int j=1;j<=i;j++)
                {
                    if(j%2!=0){ //odd column
                        System.out.print(1 +" ");
                    }
                    else{ //even column
                        System.out.print(0+" ");
                    }
                }
            }
            else{ //even row
                for(int j=1;j<=i;j++)
                {
                    if(j%2!=0){//odd column
                        System.out.print(0+" ");
                    }
                    else{//even column
                        System.out.print(1+" ");
                    }
                }
            }

            System.out.println();
        }
    }

    public static void pattern11_1(int n){
        int start=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0) start=1;
            else start=0;

            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();

        }
    }

    public static void pattern11_REVERSE(int n){
        int start=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0) start=0;
            else start=1;

            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();

        }
    }

    public static void pattern12(int n){
        for(int i=1;i<=n;i++)
        {
            //numbers
            for(int num=1;num<=i;num++)
            {
                System.out.print(num);
            }

            //spaces
            for(int space=1;space<=(2*n-2*i);space++)
            {
                System.out.print("-");
            }

            //numbers
            for(int num=i;num>=1;num--)
            {
                System.out.print(num);
            }

            System.out.println();
        }
    }

    public static void pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("-");
            }

            //characters
            char ch='A';
            for(int j=1;j<=2*i-1;j++)
            {
                if(j<=((2*i-1)/2)){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    System.out.print(ch);
                    ch--;
                }
            }

            //spaces
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i=0;i<n;i++)
        {
            char ch= (char) ('A'+n-i-1);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }
    }

    public static void pattern19(int n){
        //Upper part
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int star=1;star<=n-i+1;star++)
            {
                System.out.print("*");
            }
            //spaces
            for(int space=1;space<=2*i-2;space++)
            {
                System.out.print("-");
            }
            //stars
            for(int star=1;star<=n-i+1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower part
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            //spaces
            for(int space=1;space<=2*n-2*i;space++)
            {
                System.out.print("-");
            }
            //stars
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern20(int n){
        //Upper Part
        for(int i=1;i<=n-1;i++)
        {
            //stars
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            //spaces
            for(int space=1;space<=(2*n-2*i);space++)
            {
                System.out.print("-");
            }
            //stars
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Middle part
        for(int i=1;i<=2*n;i++)
        {
            System.out.print("*");
        }
        System.out.println();

        //Lower part
        for(int i=1;i<=n-1;i++)
        {
            //stars
            for(int star=1;star<=n-i;star++)
            {
                System.out.print("*");
            }
            //spaces
            for(int space=1;space<=2*i;space++)
            {
                System.out.print("-");
            }
            //stars
            for(int star=1;star<=n-i;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        // Loop for rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate the distance from the current cell to the edges
                int top = i; // Distance from the top edge
                int left = j; // Distance from the left edge
                int bottom = (2 * n - 1) - i - 1; // Distance from the bottom edge
                int right = (2 * n - 1) - j - 1; // Distance from the right edge

                // Find the minimum distance to any edge and subtract from 'n'
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println(); // Move to the next row
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pattern22(n);

    }
}
