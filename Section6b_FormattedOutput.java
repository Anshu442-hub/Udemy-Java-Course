package com.company;

public class Section6b_FormattedOutput {
    public static void main(String[] args) {

//        //\n is for leaving a line
//        System.out.printf("Hello");
//        System.out.printf("Hello\n");

//        //printf take more than one arguments
//        int x=10;
//        float y =12.56f;
//        char z='A';
//        System.out.printf("Hello%d%f%c\n",x,y,z);
//        System.out.printf("Hello %d %f %c",x,y,z);

//        //format specifier
//        //  %[argument_index$][flags][width][.precision]conversion
//        //conversion
//        int x=10;
//        float f=12.56f;
//        float y=0.00012f;
//        char z='A';
//        String str="Hello world";
//        //%d for integer
//        System.out.printf("Decimal %d\n",x);
//        System.out.printf("Octal %o\n",x); // %o  to convert decimal to octal
//        System.out.printf("Hexa %x\n",x);  // %x  to convert decimal to hexa
//        //%f for float
//        System.out.printf("Float  or double %f\n",f);
//        System.out.printf("Scientific notation %e\n",f);  // %e  for Scientific notation
//        System.out.printf("Scientific notation %g\n",f);  // %e  for Scientific notation
//        System.out.printf("Float  or double %f\n",y);
//        System.out.printf("Scientific notation %e\n",y);
//        System.out.printf("Scientific notation %g\n",y);
//        //%s for String
//        System.out.printf("%s\n",str);
//        //%c for character
//        System.out.printf("%c\n",z);

//        //argument index
//        int x=10;
//        float f=12.56f;
//        String str="Hello world";
//        System.out.printf("%1$d %1$d %1$d\n",x);//1 takes first argument
//        System.out.printf("%1$d %2$f %1$d\n",x,f);//2 takes second argument
//        System.out.printf("%3$s %2$f %1$d\n",x,f,str);//3 takes third argument

////        //flags  - + o ' ' (
//        int a=10;
//        System.out.printf("%d\n",a);
//        System.out.printf("%5d\n",a); //total 5 spaces including value
//        System.out.printf("%05d\n",a); //empty spaces filled with 0
//        System.out.printf("%10d\n",a); //total 10 spaces including value
//        System.out.printf("%010d\n",a); //empty spaces filled with 0

//        String a="Anshu";
//        System.out.printf("%s\n",a);
//        System.out.printf("%15s\n",a); //string gets right aligned
//        System.out.printf("%-15s\n",a); //string gets left aligned
//        System.out.printf("%20s\n",a); //string gets right aligned
//        System.out.printf("%-20s\n",a); //string gets left aligned

//        int a=10,b=-20;
//        System.out.printf("%(5d\n",a); //positive no is displayed without ()
//        System.out.printf("%(5d\n",b);  //negative no is displayed in ()
//        System.out.printf("%(d\n",a); //positive no is displayed without ()
//        System.out.printf("%(d\n",b);  //negative no is displayed in ()
//        System.out.printf("%+5d\n",a); //shows sign of the no
//        System.out.printf("%+5d\n",b); //shows sign of the no
//        System.out.printf("%-5d\n",a); //shows sign of the no and left aligned
//        System.out.printf("%-5d\n",b); //shows sign of the no and left aligned

//       float a=123.45f,b=78.56f;
//        System.out.printf("%6.2f\n",a);
//        System.out.printf("%8.2f\n",a);
//        System.out.printf("%6.2f\n",b);
//        System.out.printf("%8.2f\n",b);

//        float a=89189812123.45f;
//        System.out.printf("%6.2f\n",a);

        float a=3.45f;
        System.out.printf("%8.2f\n",a);//total 8 places with 2 places after decimal
        System.out.printf("%8.4f\n",a);//total 8 places with 4 places after decimal
        System.out.printf("%-8.4f\n",a);//left aligned
        System.out.printf("%08.2f\n",a);//empty spaces filled with 0

    }
}
