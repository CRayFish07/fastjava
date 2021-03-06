package com.fastjavaframework.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证工具类
 */
public class VerifyUtils {

	/**
	 * 判断对象是否为空 对象为null，字符序列长度为0，集合类、Map为empty
	 * @param obj
	 * @return null或空返回true
	 */
	public static boolean isEmpty(Object obj) {
		if (null == obj || "null".equals(obj))
			return true;

		if (obj instanceof String && (null == obj || "null".equals(((String) obj).trim()) || "".equals(((String) obj).trim()))) {
			return true;
		} else if (obj instanceof CharSequence) {
			return ((CharSequence) obj).length() == 0;
		} else if (obj instanceof Collection) {
			if (((Collection<?>) obj).isEmpty()) {
				return true;
			} else {
				boolean isNotColEmpty = false;

				for (Object colObj : (Collection<?>) obj) {
					if (!isEmpty(colObj)) {
						isNotColEmpty = true;
						break;
					}
				}

				return !isNotColEmpty;
			}
		} else if (obj instanceof Map) {
			return ((Map<?, ?>) obj).isEmpty();
		} else if (obj.getClass().isArray()) {
			return Array.getLength(obj) == 0;
		}
		return false;
	}

	/**
	 * 判断对象是否非空 对象为null，字符序列长度为0，集合类、Map为empty
	 * @param obj
	 * @return null或空返回false
	 */
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

	/**
	 * 验证IP地址是否合法
	 * @param ipString
	 * @return true 格式正确 false 格式错误
	 */
	public Boolean isIpAdd(String ipString) {
		Pattern pattern = Pattern
				.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
		Matcher matcher = pattern.matcher(ipString);
		return matcher.matches();
	}

	/**
	 * 验证邮箱格式
	 * 
	 * @param mail 邮箱
	 * @return true 格式正确 false 格式错误
	 */
	public boolean verifyMail(String mail) {
		Pattern p = Pattern
				.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
		Matcher m = p.matcher(mail);
		return m.matches();
	}
}
