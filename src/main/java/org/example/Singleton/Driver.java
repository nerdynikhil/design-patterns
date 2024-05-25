package org.example.Singleton;

import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        TVSet tvset1ForMember1 = TVSet.getTVSetInstance();
        TVSet tvset1ForMember2 = TVSet.getTVSetInstance();

        System.out.println(tvset1ForMember1);
        System.out.println(tvset1ForMember2);

    }
}
