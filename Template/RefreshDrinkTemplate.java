package template;

/**
 * 这是一个饮料机的模板，可以用来泡咖啡、泡茶，等等
 * 泡的四个步骤分别是：1.开机，2.放饮料末（咖啡末或者茶末），3.冲水，4.放其它的（比如说柠檬，这个是hook钩子函数）
 * 其中开机，冲水是不能被继承，直接被封装了，放饮料末是必须被继承的，所示是抽象类，而放其它的是可选的，但是有一个备选项，也就是钩子函数，如果需要就在子类中继承
 */
public abstract class RefreshDrinkTemplate {


    public final void startBubble() {
        openMachine();
        pourPowder();
        pourWater();
        pourOther();
    }

    private final void pourWater() {
        System.out.println("开始倒水");
    }

    public abstract void pourPowder();

    public void pourOther() {
        System.out.println("开始倒其它的");

    }


    /*
    * 加 final是为了防止被修改，private 是为了防止被继承
    * */
    private final void openMachine() {
        System.out.println("好的，开机了");

    }
}
