package cn.forthee.DataType.Chapter1.SocketVer1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author by 简小
 * Created on lucky 2020/9/10  9:56.
 */

public class SocketClient {
    public static void main(String[] args) throws Throwable {
        Socket socket = new Socket("127.0.0.1", 8888);
    }
}
