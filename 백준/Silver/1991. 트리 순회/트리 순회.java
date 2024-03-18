
import java.util.*;

public class Main {

    static char[][] array;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        array = new char[n][2];
        input.nextLine();

        for(int i = 0; i < n; i++) {
            char a = input.next().charAt(0);
            char b = input.next().charAt(0);
            char c = input.next().charAt(0);

            array[a-'A'][0] = b;
            array[a-'A'][1] = c;
        }

        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
        System.out.println();
    }

    public static void preorder(char c) {
        int n = c - 'A';
        if(array[n][0] == '.' && array[n][1] == '.') {
            System.out.print(c);
            return;
        }

        System.out.print(c);
        if(array[n][0] != '.')
            preorder(array[n][0]);
        if(array[n][1] != '.')
            preorder(array[n][1]);
    }

    public static void inorder(char c) {
        int n = c - 'A';
        if(array[n][0] == '.' && array[n][1] == '.') {
            System.out.print(c);
            return;
        }

        if(array[n][0] != '.')
            inorder(array[n][0]);
        System.out.print(c);
        if(array[n][1] != '.')
            inorder(array[n][1]);
    }

    public static void postorder(char c) {
        int n = c - 'A';
        if(array[n][0] == '.' && array[n][1] == '.') {
            System.out.print(c);
            return;
        }

        if(array[n][0] != '.')
            postorder(array[n][0]);
        if(array[n][1] != '.')
            postorder(array[n][1]);
        System.out.print(c);
    }

}

