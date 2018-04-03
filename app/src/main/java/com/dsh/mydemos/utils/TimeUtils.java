package com.dsh.mydemos.utils;


import java.text.SimpleDateFormat;

/**
 * Created by fan on 2016/6/23.
 */
public class TimeUtils {

    //����ת��
    public static String long2String(long time){

        //����ת��
        int sec = (int) time / 1000 ;
        int min = sec / 60 ;	//����
        sec = sec % 60 ;		//��
        if(min < 10){	//���Ӳ�0
            if(sec < 10){	//�벹0
                return "0"+min+":0"+sec;
            }else{
                return "0"+min+":"+sec;
            }
        }else{
            if(sec < 10){	//�벹0
                return min+":0"+sec;
            }else{
                return min+":"+sec;
            }
        }

    }

    /**
     * ���ص�ǰʱ��ĸ�ʽΪ yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String  getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(System.currentTimeMillis());
    }


}
