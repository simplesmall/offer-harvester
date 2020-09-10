package cn.forthee.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bufferedReader.readLine()) != null){
            int n = Integer.valueOf(str);
            int[] arr = new int[1001];
            int cur = 0;
            for (int i = 0; i < n; i++) {
                cur = Integer.valueOf(str);
                arr[cur] = cur;
            }
            for (int i = 0; i < 1001; i++) {
                if(arr[i] != 0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
