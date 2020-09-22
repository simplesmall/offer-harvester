package cn.forthee.JavaAll.ExceptionError;

/**
 * Author by 简小
 * Created on lucky 2020/9/22  10:05.
 */
public class ExceptionTest {
    public static class ExcepTest {
        public ExcepTest() {
        }

        public void cacheException() throws Exception {
            if (true) {
                throw new Exception();
            }
        }
    }

    public static void main(String[] args) {
        ExcepTest excepTest = new ExcepTest();
        // 模拟抛出错误并在调用的地方接收处理
        try {
            excepTest.cacheException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("无论执行结果如何都会执行finally");
        }
    }
}
