package cn.xiaoheiban.parser;

public class RouteManager extends DuplicateManager {
    private static RouteManager instance;

    public static RouteManager getInstance() {
        if (instance == null) {
            instance = new RouteManager();
        }
        return instance;
    }
}
