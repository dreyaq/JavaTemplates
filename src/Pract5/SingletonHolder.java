package Pract5;

public class SingletonHolder {
    private SingletonHolder() {}

    private static class InstanceHolder {
        private static final SingletonHolder instance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return InstanceHolder.instance;
    }
}
