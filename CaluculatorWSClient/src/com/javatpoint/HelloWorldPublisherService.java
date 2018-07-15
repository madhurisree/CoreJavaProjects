/**
 * HelloWorldPublisherService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javatpoint;

public interface HelloWorldPublisherService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldPublisherAddress();

    public com.javatpoint.HelloWorldPublisher getHelloWorldPublisher() throws javax.xml.rpc.ServiceException;

    public com.javatpoint.HelloWorldPublisher getHelloWorldPublisher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
