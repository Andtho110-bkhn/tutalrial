package vn.t3h.ls7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWirteFile {

	public static void main(String[] args) throws IOException {
		readContentFromUrl();
	}

	public static String readFromInputStream() throws IOException {
		File file = new File("README.md");
	    InputStream in = new FileInputStream(file);
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		return resultStringBuilder.toString();
	}

	public static void whenReadWithFileChannel_thenCorrect() throws IOException {

		String file = "README.md";
		RandomAccessFile reader = new RandomAccessFile(file, "r");
		FileChannel channel = reader.getChannel();

		int bufferSize = 1024;
		if (bufferSize > channel.size()) {
			bufferSize = (int) channel.size();
		}
		ByteBuffer buff = ByteBuffer.allocate(bufferSize);
		channel.read(buff);
		buff.flip();
		
		channel.close();
		reader.close();
		
		String content = new String(buff.array());
		System.out.println(content);
	}
	
	public static void readContentFromUrl() throws IOException {
	    URL urlObject = new URL("http://google.com");
	    URLConnection urlConnection = urlObject.openConnection();
	    InputStream inputStream = urlConnection.getInputStream();
	    StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		System.out.println(resultStringBuilder.toString());
	}
}
