package demo;

import java.io.*;

import static java.lang.System.in;

class InputStreamExample2 {

    public static void main(String[] args) throws IOException {

        // Tạo một luồng đầu vào bằng cách đọc một file
        InputStream in = new FileInputStream("/Users/hoangfvi/Documents/JAVA/Module 2/Bai17/src/vie.txt");

        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
        // Ta dùng mảng 10 bytevi
        Reader reader=new InputStreamReader(in,"UTF-8");
        int i=0 ;

        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
        // Khi không còn phần tử trong luồng i sẽ = -1
        while ((i = reader.read()) != -1) {
            // Tạo String từ các byte đọc được

            System.out.println((char)i);
        }
        in.close();

    }


//        byte[] bytes = new byte[10];

    }

