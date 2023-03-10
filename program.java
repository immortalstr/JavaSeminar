// import java.lang.reflect.Type;
// import java.util.Random;

// public class program {
//     public static void main(String[] args) {
//         String s = "asdasdasd";
//         System.out.println(s);
//     }
// }

// class program {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);
//         System.out.println(salary);
//     }
// }

// class program
// {

//     public static void main(String[] args) {
//         float e = 2.7f; \\для float в конце f
//         double pi = 3.1415;
//         System.out.println(e);
//         System.out.println(pi);
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         // char ch = 123;
//         // System.out.println(ch);
//         int a = 13;
//         double d = a;
//         System.out.println(d);

//     }
// }


/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         boolean f = true & false;
//         System.out.println(f);
//     }
// }


/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         String msg = "Hello World!";
//         System.out.println(msg);
//     }
// }

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int i = 123;
//         i = i-- - --i;
//         System.out.println(i);
//     }
// }

// public class Main {

//     static int i = 1; //32bit
//     static long l = 6; //64bit
//     static byte b; //8bit
//     short sh; //16bit
//     float f; //32bit floating poin
//     double d; //64bit floating poin
//     static boolean aBoolean;
//     char aChar = 65; //16Р±РёС‚ Р±РµР· Р·РЅР°РєР°
//     String string = "РџСЂРёРІРµС‚ РњРёСЂ!";
//     static String tmpS = new String("РџСЂРёРІРµС‚ РњРёСЂ!");

//     static int[] ints = new int[10];

//     public static void main(String[] args) {

//         ints[3] = 10;
//         int[] tmp = new int[ints.length * 2 + 1];

//         Random random = new Random();

//         for (int j=0 ; j<ints.length ; j++) {
//             tmp[j] = ints[j] + random.nextInt(100);
//         }
//         tmp[15] = 5;
//         ints = tmp;

//         for (int i: ints) {
//             System.out.println(i);
//         }


//         if (aBoolean) {
//             getInt(String.valueOf(12));
//         } else if ( l > i) {
//             getInt(String.valueOf(13));
//         } else {
//             getInt(String.valueOf(14));
//         }

//         System.out.println(Integer.toBinaryString(158));
//         System.out.println(
//                 Integer.toBinaryString(158).length()
//         );

//     }

//     static int getInt(String strToInt){
//         int i = 0;
//         Main.l = i;
//         return Integer.parseInt(strToInt);
//     }

//     static void print(String str){
//         System.out.println(str);
//     }
// }