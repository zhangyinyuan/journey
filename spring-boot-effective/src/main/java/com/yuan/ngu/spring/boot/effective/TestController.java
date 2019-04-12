package com.yuan.ngu.spring.boot.effective;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/checkURL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object checkURL(String checkURL) {
        logger.info("checkURL called with videoURL = {}", checkURL);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("checkURL", checkURL);
        map.put("isVideo", false);
        map.put("isAudio", false);
        map.put("isImage", false);
        try {
            URL url = new URL(checkURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String contentType = connection.getContentType();
            connection.disconnect();
            map.put("contentType", contentType);
            if (contentType.toLowerCase().contains("video")) {
                map.put("isVideo", true);
            } else if (contentType.toLowerCase().contains("audio")) {
                map.put("isAudio", true);
            } else if (contentType.toLowerCase().contains("image")) {
                map.put("isImage", true);
            }
        } catch (IOException e) {
            logger.error("checkURL error videoURL = {}", checkURL, e);
        }
        return map;
    }
}
