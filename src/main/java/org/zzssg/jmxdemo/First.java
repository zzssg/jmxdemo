package org.zzssg.jmxdemo;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "org.zzssg.jmxdemo:name=FirstMBean", description = "First MBean")
public class First implements FirstMBean {

    private String name = "DefaultName";
    private int count = 0;

    @ManagedAttribute
    @Override
    public String getName() {
        return name;
    }

    @ManagedAttribute
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @ManagedAttribute
    @Override
    public int getCount() {
        return count;
    }

    @ManagedAttribute
    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @ManagedOperation
    @Override
    public String sayHello(String guest) {
        return "Hello, " + guest + "! From " + name;
    }
}
