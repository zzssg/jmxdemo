package org.zzssg.jmxdemo;

public interface FirstMBean {
    String getName();
    void setName(String name);

    int getCount();
    void setCount(int count);

    String sayHello(String guest);
}
