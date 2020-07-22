package vn.t3h.ls7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class UploadUtils {
	
	public boolean isAppend = false;
	private String pathOfFile;
	
	public static UploadUtils createFolder(String dir) throws Exception {
		if(dir == null || dir.isEmpty()) 
			throw new Exception("Tên folder không được để trống ");
		
		var _this = new UploadUtils();
		LocalDate currentdate = LocalDate.now();
		int currentYear = currentdate.getYear();
		int currentMonth = currentdate.getMonth().getValue();
		
		String path = System.getProperty("user.dir") + "/" + dir + "/" + currentMonth + currentYear;
		File file = new File(path);
		if(!file.exists())
			file.mkdirs();
		
		_this.pathOfFile = path;
		return _this;
	}
	
	public boolean writeToFile(String nameFile, String content) {
        try (FileWriter file = new FileWriter(this.pathOfFile + "/" + nameFile, this.isAppend)) {
            file.write(content);
            file.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	public UploadUtils setAppend(boolean ap) {
		this.isAppend = ap;
		return this;
	}
}
