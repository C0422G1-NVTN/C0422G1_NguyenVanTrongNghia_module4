package dictionary.repository.impl;

import dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {

    private static Map<String, String> stringMap = new HashMap<>();

    static {
        stringMap.put("apple", "táo");
        stringMap.put("orange", "cam");
        stringMap.put("tomato", "cà chua");
        stringMap.put("pen", "bút");
        stringMap.put("pencil", "bút chì");
        stringMap.put("ruler", "thước");
        stringMap.put("table", "bàn");
    }

    @Override
    public String findByName(String keySearch) {
        String result = stringMap.get(keySearch);
        if (result == null) {
            result = "tìm không thấy kết quả";
        }
        return result;
    }
}
