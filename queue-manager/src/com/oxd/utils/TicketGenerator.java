package com.oxd.utils;

public class TicketGenerator {
    private static Long ID = 0L;

    public static Long generate() {
        return ++ID;
    }
}
