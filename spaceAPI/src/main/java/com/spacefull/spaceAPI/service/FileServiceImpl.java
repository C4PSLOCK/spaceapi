package com.spacefull.spaceAPI.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException{
        // get name of the file
        String fileName = file.getOriginalFilename();

        // to get the file path
        String filePath = path + File.separator + fileName;

        // create file object
        //справить вывод true
        File f = new File(filePath);
        if(!f.exists()){
            f.mkdir();
        }

        // cope the file or upload file to the path
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING );
        return null;
    }


    @Override
    public InputStream getResourceFile(String path, String filename) throws FileNotFoundException{
        String filePath = path + File.separator + filename;
        return new FileInputStream(filePath);
    }
}
