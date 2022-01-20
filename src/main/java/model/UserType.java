package model;

import javax.xml.namespace.QName;

public enum UserType implements org.apache.xmlbeans.UserType {
    USER,ADMIN;

    @Override
    public QName getName() {
        return null;
    }

    @Override
    public String getJavaName() {
        return null;
    }

    @Override
    public String getStaticHandler() {
        return null;
    }
}
