package com.funong.utils;

import java.io.UnsupportedEncodingException;

/**
 * 编码工具类
 * @author khum
 *
 */
public class EncodeUtil {

	public static String gb2312ToUtf8(String str) {
		String string = null;
		try {
			byte[] bytes = str.getBytes("GB2312");
			string = new String(bytes,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return string;
	}
}
