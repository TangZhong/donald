package ex1_1;

/**
 * 测试方法
 */
public class Main {

    public static void main(String[] args) {

        //生成工厂
        Factory factory = new Factory();

        //生产电脑
        factory.produce(new Computer());

        //生产手机
        factory.produce(new Phone());
    }

}
