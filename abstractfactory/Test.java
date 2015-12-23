package abstractfactory;

/**
 * Created by kaling on 15/8/11.
 * 抽象工厂模式
 * 克服工厂方法模式中每次新建实现类都需要修改工厂类的弊端
 * 将耦合度降得更低
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new MailFacotory();
        Sender sender = factory.produce();
        sender.send();

        Factory factory1 = new SmsFactory();
        sender = factory1.produce();
        sender.send();
    }
}
