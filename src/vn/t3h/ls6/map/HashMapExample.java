package vn.t3h.ls6.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {

    	// Tạo một Map thông qua lớp HashMap.
        Map<String, String> map = new HashMap<>();
        // Đẩy các key, value vào map
        map.put("PostgreSQL", "Free Open Source Enterprise Database");
        map.put("DB2", "Enterprise Database , It's expensive");
        map.put("Oracle", "Enterprise Database , It's expensive");
        map.put("MySQL", "Free Open SourceDatabase (no more, try MariaDB)");

        // Lấy key từ map ra
        System.out.println(map.get("PostgreSQL")); // Free Open Source Enterprise Database

        // Cập nhật lại key cho map
        map.put("PostgreSQL", "Still the best!");
        System.out.println(map.get("PostgreSQL"));

        // Thay thế key của map bằng một value khác
        map.replace("PostgreSQL", "Still the best! 2");
        System.out.println(map.get("PostgreSQL"));

        // Xóa một key trong map
        map.remove("PostgreSQL");
        System.out.println(map.get("PostgreSQL"));

        // Kiểm tra kích thước của mao
        System.out.println(map.size()); // 3

        // Lặp các giá trị của map bằng Iterator
        System.out.println("Iterator loop...");
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }

        System.out.println("for loop...");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }

        // For each từ Java 8 trở đi
        System.out.println("forEach loop...");
        map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
        // Xóa hết các phần tử của map
        map.clear();
    }
}