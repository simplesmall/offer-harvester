package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-18 0:09
 */
public class Proxy {

}

class Destination {
    public void todo() {
        System.out.println("control...");
    }
}

class Device {
    private String name;
    private Destination destination;
    private DeviceController deviceController;

    public void control(Destination destination) {
        destination.todo();
    }
}

class DeviceController {
    private Device name;
    private Destination destination;

    public void control(Destination destination) {
        destination.todo();
    }
}