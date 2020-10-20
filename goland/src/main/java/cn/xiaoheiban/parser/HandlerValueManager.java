package cn.xiaoheiban.parser;

public class HandlerValueManager extends DuplicateManager {
    private static HandlerValueManager instance;

    public static HandlerValueManager getInstance() {
        if (instance == null) {
            instance = new HandlerValueManager();
        }
        return instance;
    }
}
