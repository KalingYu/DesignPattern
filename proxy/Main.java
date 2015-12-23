package proxy;

/**
 * Created by kaling on 12/11/15.
 */
public class Main {
    public static void main(String[] args) {
        StudentInterface stu1 = new StudentBean("hello");
        ProxyFactory proxyFactory = new ProxyFactory();
        StudentInterface stu2 = (StudentInterface) proxyFactory.createStudentProxy(stu1);
        //正常代理
        stu2.print();

        //设置一个未初始化名字的，为一个代理拦截
        StudentInterface stu3 = new StudentBean();
        ProxyFactory proxyFactory1 = new ProxyFactory();
        StudentInterface stu4 = (StudentInterface) proxyFactory.createStudentProxy(stu3);
        stu4.print();
    }
}
