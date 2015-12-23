package staticfacotory;

/**
 * Created by kaling on 15/8/11.
 * 工厂方法模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender =  factory.produceMailSender();
        sender.send();
    }
}
