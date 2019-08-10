package com.yuan.ngu.boot.oss.callback;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CreateUtil {
    @Test
    public void test(){
        System.out.println("1");
    }

    public static String createPlist() throws IOException {
        System.out.println("==========开始创建plist文件");
        //这个地址应该是创建的服务器地址，在这里用生成到本地磁盘地址
        final String path = "./";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String plistFile = "CreateUtil.plist";
        final String PLIST_PATH = path + plistFile;
        file = new File(PLIST_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String plist = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n"
                + "<plist version=\"1.0\">\n" + "<dict>\n"
                + "<key>items</key>\n"
                + "<array>\n"
                + "<dict>\n"
                + "<key>assets</key>\n"
                + "<array>\n"
                + "<dict>\n"
                + "<key>kind</key>\n"
                + "<string>software-package</string>\n"
                + "<key>url</key>\n"
                //你之前所上传的ipa文件路径
                + "<string>http://127.0.0.1/project/upload/files/20160504201048174_7836_19.ipa</string>\n"
                + "</dict>\n"
                + "</array>\n"
                + "<key>metadata</key>\n"
                + "<dict>\n"
                + "<key>bundle-identifier</key>\n"
                //这个是开发者账号用户名，也可以为空，为空安装时看不到图标，完成之后可以看到
                + "<string>cn.vrv.im-inhouse</string>\n"
                + "<key>bundle-version</key>\n"
                + "<string>1.0.7</string>\n"
                + "<key>kind</key>\n"
                + "<string>software</string>\n"
                + "<key>subtitle</key>\n"
                + "<string>下载</string>\n"
                + "<key>title</key>\n"
                + "<string></string>\n"
                + "</dict>\n"
                + "</dict>\n"
                + "</array>\n"
                + "</dict>\n"
                + "</plist>";
        try {
            FileOutputStream output = new FileOutputStream(file);
            OutputStreamWriter writer;
            writer = new OutputStreamWriter(output, "UTF-8");
            writer.write(plist);
            writer.close();
            output.close();
        } catch (Exception e) {
            System.err.println("==========创建plist文件异常：" + e.getMessage());
        }
        System.out.println("==========成功创建plist文件");
        return PLIST_PATH;
    }

    public static String createHtml(String plistPath) {
        System.out.println("==========开始创建html文件");

        //这个地址应该是生成的服务器地址，在这里用生成到本地磁盘地址
        final String path = "./";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        String plistFile = "download.html";
        final String PLIST_PATH = path + plistFile;
        file = new File(PLIST_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String html = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>下载</title>\n"
                + "<script type=\"text/javascript\">\n"
                + "var url = '" + plistPath + "';\n"
                + "window.location.href = \"itms-services://?action=download-manifest&url=\" + url;\n"
                + "</script>\n"
                + "</head>\n"
                + "<body></body>\n"
                + "</html>";

        try {
            FileOutputStream output = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
            writer.write(html);
            writer.close();
            output.close();
        } catch (IOException e) {
            System.err.println("==========创建html文件异常：" + e.getMessage());
        }
        System.out.print("==========成功创建html文件");

        return "success";
    }

    public static void main(String[] args) throws IOException {
        String plistPath = CreateUtil.createPlist();
        createHtml(plistPath);
    }
}
