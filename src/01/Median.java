//정수 3개의 값의 중앙값

import java.util.Scanner;

class Median {

    

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("정수 3개를 입력하세요");
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        System.out.println("med(a, b, c) = " + median3(a, b, c));

        stdIn.close();
    }
}

