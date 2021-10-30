package demo;
import java.io.*;

class OutputStreamExample {

    public static void main(String[] args) throws IOException {
        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
        OutputStream os = new FileOutputStream("HviExample.txt");

        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        Writer writer=new OutputStreamWriter(os,"UTF-8");


        String s= "Hoàng vi hihi";
        writer.write(Integer.parseInt(s));



        // Ghi lần lượt các ký tự vào luồng
//        for (int i = 0; i < bytes.length; i++) {
//            byte b = bytes[i];
//            // Ghi ký tự vào luồng
//            os.write(b);
//        }
        // ghi cả mảng bytes vào luồng

        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        writer.close();
    }
}