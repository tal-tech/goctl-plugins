package cn.xiaoheiban.parser;

public class ImportValueManager extends DuplicateManager {
    private static ImportValueManager instance;

    public static ImportValueManager getInstance() {
        if (instance == null) {
            instance = new ImportValueManager();
        }
        return instance;
    }
}
