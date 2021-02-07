/懒汉，顾名思义比较懒，在用的时候才实例化
public class Singleton {
    //创建实例，注意，此时没有new
    private static Singleton instance = null;
    //构造方法私有化
    private Singleton() {}
    //公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            //这里才new
            instance = new Singleton();
        }
        return instance;
    }
}

//饿汉，顾名思义很饥饿，创建对象的时候就直接new
public class Singleton {
    //创建实例的时候就new
    private static Singleton instance = new Singleton();
    // 私有化构造方法，外部不能new
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}