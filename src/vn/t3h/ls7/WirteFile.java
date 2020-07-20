package vn.t3h.ls7;

import java.io.FileWriter;
import java.io.IOException;

public class WirteFile {
	public static void main(String[] args) throws IOException {
        try (FileWriter file = new FileWriter("test.txt")) {
            file.write("TEST FOR WIRTE FILE");
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}