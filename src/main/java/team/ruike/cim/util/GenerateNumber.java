package team.ruike.cim.util;

import java.security.SecureRandom;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 编号生成工具类
 * 单列类
 *
 * @author 张振国
 * @version 1.0
 */
public class GenerateNumber {
    private GenerateNumber() {
    }

    private static final GenerateNumber generateNumber = new GenerateNumber();

    public static GenerateNumber getGenerateNumber() {
        return generateNumber;
    }




    //生产批次 11
    public  String getRandomFileName() {

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date date = new Date();

        String str = simpleDateFormat.format(date);

        Random random = new Random();

        int rannum = (int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000;// 获取12位随机数

        return rannum + str;// 当前时间
    }

    public static void main(String[] args) {
    }


}
