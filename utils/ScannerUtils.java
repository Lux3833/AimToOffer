import java.util.Scanner;

/**
 * @title: ScannerUtils
 * @Author: Lux_er
 * @Date: 2021/10/18 0018 下午 7:58
 * @Description:
 */
public class ScannerUtils {
    public static Scanner scanner;
    // 返回整数值
    public static int getIntScan(Scanner scanner){
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // 返回字符串
    public static String getStringScan(Scanner scanner){
        scanner = new Scanner(System.in);
        return scanner.next();
    }
    // 返回整数数组
    public static int[] getIntNumScan(Scanner scanner,int num){
        scanner = new Scanner(System.in);
        int[] res = new int[num];
        for (int i = 0; i < num; i++) {
            res[i] = scanner.nextInt();
        }
        return res;
    }
    // 返回字符串数组
    public static String[] getStrNumScan(Scanner scanner,int num){
        scanner = new Scanner(System.in);
        String[] res = new String[num];
        for (int i = 0; i < num; i++) {
            res[i] = scanner.next();
        }
        return res;
    }
}
