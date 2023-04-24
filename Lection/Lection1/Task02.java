package Lection1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) throws IOException{
//         // double f = 2.413;
//         // float s = 2.418f;
//         Scanner iScanner = new Scanner(System.in);
//         // String name = iScanner.nextLine();
//         int x = iScanner.nextInt();
//         Double y = iScanner.nextDouble();
//         System.out.printf("%d , %f", x, y);
//         //char ch = 124 ; 
//         //int [][] arr = new int[3][5];
//         //for (int i = 0; i <arr.length;i++){
//             // for (int j =0; j < arr[i].length;j ++){
//             //     System.out.printf("%d",arr[i][j]);
//             // }
//             // System.out.println();
        
//        // System.out.println(arr);
//         //System.out.println(ch);
//        // System.out.println(" " + f + "\n " + s);
//         //System.out.printf("Привет, %s!", name);
//         iScanner.close();
//             }
//     }
    Random rnd = new Random();
    int a = rnd.nextInt(1,5);
    System.out.println(a);
    switch (a) {
        case 1:
            a = 999;
            break;
    
        default:
        a = 555;
            break;
    }
    System.out.println(a);
    
try (FileWriter fw = new FileWriter ("file.txt", false)) {
fw.write ("line 1");
fw. append ('\n' ); fw.append ('2');
fw. append ('\n');
fw.write("line 3");
fw.flush();
    }

}
}