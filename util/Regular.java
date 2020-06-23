package com.huafa.build.goods.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @描述： 正则表达式, 用于验证手机号码
 * @类名路径： com.huafa.build.goods.util Regular
 * @作者： 宋志伟
 * @创建时间：2020/6/23 15:28
 * @版本： 1.0.0
 */
public class Regular {
    /** 传入手机号进行判断 */
    public static boolean isCellPhoneNumber(String str) throws Exception{
        Pattern pattern = null;
        Matcher matcher = null;
        boolean isEqual = false;
        //制定验证条件
        String regex2 = "^[1]([3-9])[0-9]{9}$";
        //判断这个字符串是否符合基本验证
        if (str != null && str.length() == 11) {
            pattern = Pattern.compile(regex2);
            matcher = pattern.matcher(str);
            isEqual = matcher.matches();
        }
        //如果符合验证规则则返回true
        return isEqual;
    }

}
