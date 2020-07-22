package vn.t3h.ls7;

import java.io.IOException;

public class WirteFile {
	public static void main(String[] args) throws IOException {
        try {
        	UploadUtils.createFolder("json")
        		.setAppend(true)
        		.writeToFile("test.txt", "TEST FOR WIRTE FILE");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}