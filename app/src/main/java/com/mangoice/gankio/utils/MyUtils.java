package com.mangoice.gankio.utils;

import android.text.TextUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MangoIce on 2018/5/8.
 */

public class MyUtils {
    /**
     * 根据指定格式字符串返回日期
     *
     * @param dateStr
     * @return
     */
    public static Date formatDateFromStr(final String dateStr) {
        Date date = new Date();
        if (!TextUtils.isEmpty(dateStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss'Z'");
            try {
                date = sdf.parse(dateStr);
            } catch (Exception e) {
                System.out.print("Error,format Date error");
            }
        }
        return date;
    }
}