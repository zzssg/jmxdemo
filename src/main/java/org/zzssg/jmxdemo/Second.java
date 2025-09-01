package org.zzssg.jmxdemo;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "org.zzssg.jmxdemo:name=SecondMBean", description = "Second MBean")
public class Second implements SecondMBean {

    private String status = "OK";

    @ManagedAttribute
    @Override
    public String getStatus() {
        return status;
    }

    @ManagedAttribute
    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
