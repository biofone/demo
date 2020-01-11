package com.chao.fileupdowndemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@Controller
//@RequestMapping("/")
public class FileUploadController {
    @RequestMapping("/file")
    public String file() {
        System.out.println("file-----");
        return "/file";
    }
    @RequestMapping("/multifile")
    public String multifile() {
        return "/multifile";
    }
    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("fileName") MultipartFile file) {
        if(file.isEmpty()) {
            System.out.println("文件為空！！！");
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName+"-->"+size);
        String path = "D:/filetest";
        //文件路徑
        File dest = new File(path +"/"+fileName);
        if(!dest.getParentFile().exists()) {//判斷父目錄是否存在
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            return "true";
        }catch(IllegalStateException e) {
            e.printStackTrace();
            return "false";
        }catch (IOException E) {
            E.printStackTrace();
            return "false";
        }
    }
    @RequestMapping(value="/multifileUpload",method = RequestMethod.POST)
    @ResponseBody
    public String multifileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("fileName");
        if(files.isEmpty()) {
            System.out.println("未提交完全！！！");
            return "false";
        }
        String path = "D:/filetest";
        for (MultipartFile file:files) {
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName + "-->" + size);
            if(file.isEmpty()) {
                System.out.println("未上傳文件");
                return "false";
            }else {
                File dest = new File(path + "/" + fileName);
                if(!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdir();
                }
                try {
                    file.transferTo(dest);
                }catch (Exception e) {
                    e.printStackTrace();
                    return "false";
                }
            }
        }
        return "true";
    }

}
