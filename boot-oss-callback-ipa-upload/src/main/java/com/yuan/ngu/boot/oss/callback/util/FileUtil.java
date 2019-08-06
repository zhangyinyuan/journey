package com.yuan.ngu.boot.oss.callback.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class FileUtil {

	//写文件

	public static String readFileContent(String filePath,String newStr) {
		BufferedReader br = null;
		String line = null;
		StringBuffer bufAll = new StringBuffer();//保存修改过后的所有内容，不断增加
		try {
			br = new BufferedReader(new FileReader(filePath));
			while((line = br.readLine()) != null) {
				StringBuffer buf = new StringBuffer();
				//修改内容核心代码
				if(line.contains(".ipa")) {
					line = line.replaceAll(line.substring(line.indexOf(":")-5,line.lastIndexOf(".")+4), newStr);
				}
				buf.append(line);
				buf.append(System.getProperty("line.separator"));
				bufAll.append(buf);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch(Exception e) {
					br = null;
				}
			}
		}
		return bufAll.toString();
	}
	//写文件
	public static void writeFile(String filePath, String content) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filePath));
			bw.write(content);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch(Exception e) {
					bw = null;
				}
			}
		}
	}

}
