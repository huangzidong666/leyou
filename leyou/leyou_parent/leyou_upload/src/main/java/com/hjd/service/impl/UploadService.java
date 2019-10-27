package com.hjd.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {
    private static final List<String> CONTENT_TYPES = Arrays.asList("image/jpeg", "image/gif","image/png");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);
    public String upload(MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        String contentType = file.getContentType();
        System.out.println(contentType);
        if(!CONTENT_TYPES.contains(contentType)){
            LOGGER.info("文件类型不合法:{}",originalFilename);
            return null;
        }
        try {
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if(bufferedImage==null){
                LOGGER.info("文件内容不合法:{}",originalFilename);
                return null;
            }
            file.transferTo(new File("H:\\leyou_image\\"+originalFilename));
            return "http://image.leyou.com/" + originalFilename;
        } catch (IOException e) {
            LOGGER.info("服务器内部错误:{}",originalFilename);
            e.printStackTrace();

        }
        return null;
    }
}
