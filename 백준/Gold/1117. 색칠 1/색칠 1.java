import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long W = sc.nextLong();
        long H = sc.nextLong();
        long f = sc.nextLong();
        long c = sc.nextLong();
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();

        long foldedWidth = (W/2>=f) ? f : W-f;
        long coloredWidth = 0;
        if(x2 < foldedWidth) coloredWidth = x2-x1 + x2-x1;
        else if(x1 > foldedWidth) coloredWidth = x2-x1;
        else coloredWidth = (x2-x1) + (foldedWidth-x1);
        long coloredArea = coloredWidth * (y2-y1) * (c + 1);
        long uncoloredArea = (W*H) - coloredArea;
        System.out.println(uncoloredArea);
        
        sc.close();
    }
}