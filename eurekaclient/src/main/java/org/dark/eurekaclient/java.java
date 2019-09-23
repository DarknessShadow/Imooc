package org.dark.eurekaclient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijiao
 * @description:
 * @date 2019/9/18 18:30
 */
public class java {
    public static void main(String [] args){
        List<String> strList = new ArrayList<>();
        strList.add("lijiao");
        strList.add("shab");
        strList.add("Libo");
        String status = "";
        for (String str :
                strList) {
            status = str;
            continue;
        }
        System.out.println(status);
    }
}
