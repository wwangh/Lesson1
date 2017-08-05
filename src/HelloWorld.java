import java.awt.*;
import java.awt.event.*;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("99乘法表");
        System.out.print("   ");
        for (int i = 1;i <=9;i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 1;i <= 9;i++)
        {
            System.out.print(i+"  ");
            for (int j = 1;j <= i;j++)
                System.out.print(i*j+" ");
            System.out.println();
        }
    }
}
