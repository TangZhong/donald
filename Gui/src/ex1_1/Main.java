package ex1_1;

/**
 * ���Է���
 */
public class Main {

    public static void main(String[] args) {

        //���ɹ���
        Factory factory = new Factory();

        //��������
        factory.produce(new Computer());

        //�����ֻ�
        factory.produce(new Phone());
    }

}
