package com.git.wscp.test;

import com.git.wscp.coding.Extension;
import com.git.wscp.domain.Persion;

import java.util.ArrayList;
import java.util.List;

/**
 * User: wzb
 * Date: 2018/7/14
 * Time: 21:57
 * Version: 1.0
 * Description:
 */
public class TempTest {

    public static void main(String[] args) {
        String[] arrayStr = new String[]{"User", "Dept", "AO", "TMO", "Other"};

        List<Extension> extensions = new ArrayList<>();

        List<Extension> extensionList = new ArrayList<>();
        List<Extension> extensionListB = null;
        List<Extension> extensionListC = null;
        List<Extension> extensionListD = null;
        List<Extension> extensionListE = null;

        Extension p1 = new Extension("0007", "zhangsan", "32", "User");
        Extension p2 = new Extension("0004", "lisi", "25", "AO");
        Extension p3 = new Extension("0002", "wangwu", "25", "Dept");
        Extension p4 = new Extension("0004", "wangwu", "27", "TMO");
        Extension p5 = new Extension("0004", "wangwu", "27", "TMO");
        Extension p6 = new Extension("0004", "wangwu", "27", "Other");
        Extension p7 = new Extension("0004", "wangwu", "27", "Other");
        Extension p8 = new Extension("0004", "wangwu", "27", "TMO");

        extensions.add(p1);
        extensions.add(p2);
        extensions.add(p3);
        extensions.add(p4);
        extensions.add(p5);
        extensions.add(p6);
        extensions.add(p7);
        extensions.add(p8);
        for (Extension extension : extensions) {
            if (arrayStr[0].equals(extension.getExtType())) {
                extensionList.add(extension);
            }
            if (arrayStr[1].equals(extension.getExtType())) {
                extensionListB = new ArrayList<>();
                extensionListB.add(extension);
            }
            if (arrayStr[2].equals(extension.getExtType())) {
                extensionListC = new ArrayList<>();
                extensionListC.add(extension);
            }
            if (arrayStr[3].equals(extension.getExtType())) {
                extensionListD = new ArrayList<>();
                extensionListD.add(extension);
            }
            if (arrayStr[4].equals(extension.getExtType())) {
                extensionListE = new ArrayList<>();
                extensionListE.add(extension);
            }
        }

        extensionList.addAll(extensionListB);
        extensionList.addAll(extensionListC);
        extensionList.addAll(extensionListD);
        extensionList.addAll(extensionListE);

        for (Extension str : extensionList) {
            System.out.println("====" + str.toString());
        }
    }
}
