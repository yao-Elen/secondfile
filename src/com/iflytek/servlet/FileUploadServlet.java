package com.iflytek.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/fileUpload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //文件的上传
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        //获取文件的上传
        Part part=req.getPart("imge");
        //获取文件的名称
        String filename=part.getSubmittedFileName();
        System.out.println(filename);
        //获取文件的输入流
       // part.write(filename);
        InputStream is=part.getInputStream();
        // 将文件写入到指定的目录
        String dir=this.getServletContext().getRealPath("/file");
        //创建文件
        File dirFile=new File(dir);
        //判断文件是否存在
        if(!dirFile.exists()){
            //创建文件夹
            dirFile.mkdirs();
        }
     /*   String path=dir+"/"+filename;
        File dest=new File(path);
        part.write(path);
        is.close();
        resp.getWriter().write("上传成功");*/
        //文件流的拷贝
        File file=new File(dir,filename);
        //创建文件输出流
        FileOutputStream out=new FileOutputStream(file);
        //创建缓冲区
        byte[] b=new byte[1024];
        int len=0;
        while((len=is.read(b))!=-1){
            out.write(b,0,len);
        }
        is.close();
        out.close();
        resp.getWriter().write("上传成功");
    }


}
