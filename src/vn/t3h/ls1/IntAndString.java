package vn.t3h.ls1;

public class IntAndString {

	public static void main(String[] args) {
		
		// String
		String sdt = "0987938491";
		/*
		var afterReplace = sdt.replaceAll("9", "8");
		System.out.println("afterReplace: " + afterReplace);
		
		String s1="java";
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);
		String s3=new String("example");
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);
		/*/
		System.out.println(sdt.charAt(1));
		// char charAt(int index) // Trả về giá trị của thứ tự chuỗi đang giữ
		// int length() // Chiều dài của chuỗi
		// static String format(String format, Object... args) // Trả về kiểu string sau khi format
		String fr = String.format("%s = %d", "java", 1991); // s là chuỗi, d là số
		System.out.println("fr: " + fr);
		// String substring(int beginIndex) // Trả về một chuỗi bị cắt bới ký tự thứ n.
		// String substring(int beginIndex, int endIndex) // Trả về một chuỗi bị cắt bới bắt đầu và kết thúc
		// boolean contains(CharSequence s) // Kiểm tra chuỗi có tồn tại ký tự.
		// static String join(CharSequence delimiter, CharSequence... elements) // Nối nhiều chuỗi
		// boolean equals(Object another) // Kiểm tra chuỗi bằng nhau
		// boolean isEmpty() // Kiểm tra chuỗi rỗng hay không
		// String concat(String str) // Nỗi chuỗi với một chuỗi
		// String replace(char old, char new) // Thay thế chuỗi bằng một chuỗi mới
		// static String equalsIgnoreCase(String another) // so sánh hai chuỗi dựa trên nôi dung
		// không phần biệt chữ hoa chữ thường
		// String[] split(String regex) tách chuỗi thành mảng theo ký tự truyền vào.
		// String toLowerCase() // Chuyển các ký tự viết hoa thành viết thường
		// String toUpperCase() // Chuyển các ký tự viết thường thành viết hoa
		// String trim() // Xóa khoảng trắng ở đầu và cuối chuỗi
		@SuppressWarnings({ "preview", "removal" })
		String tb = """ 
				<language> <no>%s</no> 
				<name>%s</name> </language> """.formatted("12345", "Java");
		System.out.println("tb: " + tb);
	}
}

