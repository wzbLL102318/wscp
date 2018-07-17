package com.git.wscp.test;

import com.git.wscp.domain.Persion;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * User: wzb
 * Date: 2018/7/14
 * Time: 16:49
 * Version: 1.0
 * Description:
 */
public class ListTest {
    public static void main(String[] args) {
        List<Persion> plist = new ArrayList<Persion>();
        //创建3个Persion对象，年龄分别是32、20、25，并将他们依次放入List中
        Persion p1 = new Persion("0007", "zhangsan", 32);
        Persion p2 = new Persion("0004", "lisi", 25);
        Persion p3 = new Persion("0002", "wangwu", 89);
        Persion p4 = new Persion("0004", "wangwu", 27);
        Persion p5 = new Persion("0006", "wangwu", 27);

        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
        plist.add(p5);

        System.out.println("排序前的结果：" + plist);
        Collections.sort(plist, new Comparator<Persion>() {
            /*
             * int compare(Persion p1, Persion p2) 返回一个基本类型的整型，
             * 返回负数表示：p1 小于p2，
             * 返回0 表示：p1和p2相等，
             * 返回正数表示：p1大于p2
             */
            public int compare(Persion extension_1, Persion extension_2) {

//                // firstName顺序 -1小于 0相等 1大于
//                int i = extension_1.getId().compareTo(extension_2.getId());
//                // lastName顺序
//                int j = 0;
//                // 判断lastName是否为null
//                if (extension_1.getName() != null && extension_2.getName() != null) {
//                    j = extension_1.getName().compareTo(extension_2.getName());
//                } else {
//                    if (extension_1.getName() != null && extension_2.getName() == null) {
//                        j = 1;
//                    } else if (extension_1.getName() == null && extension_2.getName() != null) {
//                        j = -1;
//                    } else {
//                        j = 0;
//                    }
//                }
//
//                // ext顺序
//                int k = 0;
//                // 判断lastName是否为null
//                if (extension_1.getAge() != null && extension_2.getAge() != null) {
//                    k = extension_1.getAge().compareTo(extension_2.getAge());
//                } else {
//                    if (extension_1.getAge() != null && extension_2.getAge() == null) {
//                        k = 1;
//                    } else if (extension_1.getAge() == null && extension_2.getAge() != null) {
//                        k = -1;
//                    } else {
//                        k = 0;
//                    }
//                }
//
//                // sort
//                if (i == 0) {
//                    if (j == 0) {
//                        return k;
//                    }
//                    return j;
//                }
//                return i;
                if(extension_1.getId().compareTo(extension_2.getId()) > 0){
                    return  1;
                }
                if(extension_1.getId().compareTo(extension_2.getId()) == 0){
                    if (extension_1.getAge() > extension_2.getAge()) {
                        return 1;
                    }
                    if(extension_1.getAge() == extension_2.getAge()){

                        return 0;
                    }
                }
                return -1;
            }
        });
        System.out.println("排序后的结果：" + plist);
        for(Persion p : plist){
            if("0004".equals(p.getId())){
                int k = plist.stream().mapToInt(Persion::getAge).max().getAsInt();
                System.out.println("llkkkkk" + k);
            }
        }

    }
}
