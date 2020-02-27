package com.changgou.controller;

import com.changgou.file.FastDFSFile;
import com.changgou.util.FastDFSUtil;
import entity.Result;
import entity.StatusCode;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/upload")
@CrossOrigin
public class FileUploadController {
    @PostMapping
    public Result upload(@RequestParam(value = "file")MultipartFile file) throws Exception{
        FastDFSFile fastDFSFile = new FastDFSFile(
          file.getOriginalFilename(),
          file.getBytes(),              //文件字节数组
          StringUtils.getFilenameExtension(file.getOriginalFilename())     //文件扩展名
        );

        String[] uploads = FastDFSUtil.upload(fastDFSFile);
        return new Result(true, StatusCode.OK, "上传成功", uploads);
    }
}
