package cn.xiaoheiban.parser;

public class StructManager extends DuplicateManager {
    private static StructManager instance;

    public static StructManager getInstance() {
        if (instance == null) {
            instance = new StructManager();
        }
        return instance;
    }
}
