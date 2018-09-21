package com.example.demo.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

    public static void main(String[] args) {
        FileOutput a2 = new FileOutput();

        //电脑文档路径
        String filePath = "C:/Users/Ken/Desktop/monkey.txt" ;

        //要写入的内容
        String content = "测试成功！" ;
        a2.writeFile( filePath , content  ) ;

    }

    /**
     * 根据文件路径创建输出流
     * @param filePath ： 文件的路径
     * @param content : 需要写入的内容
     */
    public void writeFile( String filePath , String content ){
        FileOutputStream fos = null ;
        try {
            //1、根据文件路径创建输出流
            fos  = new FileOutputStream( filePath );

            //2、把string转换为byte数组；
            byte[] array = content.getBytes() ;
            //3、把byte数组输出；
            fos.write( array );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
