/**
 * HelloWorldPublisherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javatpoint;

public class HelloWorldPublisherServiceLocator extends org.apache.axis.client.Service implements com.javatpoint.HelloWorldPublisherService {

    public HelloWorldPublisherServiceLocator() {
    }


    public HelloWorldPublisherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorldPublisherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorldPublisher
    private java.lang.String HelloWorldPublisher_address = "http://localhost:2018/CaluculatorWS/services/HelloWorldPublisher";

    public java.lang.String getHelloWorldPublisherAddress() {
        return HelloWorldPublisher_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldPublisherWSDDServiceName = "HelloWorldPublisher";

    public java.lang.String getHelloWorldPublisherWSDDServiceName() {
        return HelloWorldPublisherWSDDServiceName;
    }

    public void setHelloWorldPublisherWSDDServiceName(java.lang.String name) {
        HelloWorldPublisherWSDDServiceName = name;
    }

    public com.javatpoint.HelloWorldPublisher getHelloWorldPublisher() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldPublisher_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldPublisher(endpoint);
    }

    public com.javatpoint.HelloWorldPublisher getHelloWorldPublisher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.javatpoint.HelloWorldPublisherSoapBindingStub _stub = new com.javatpoint.HelloWorldPublisherSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWorldPublisherWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldPublisherEndpointAddress(java.lang.String address) {
        HelloWorldPublisher_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.javatpoint.HelloWorldPublisher.class.isAssignableFrom(serviceEndpointInterface)) {
                com.javatpoint.HelloWorldPublisherSoapBindingStub _stub = new com.javatpoint.HelloWorldPublisherSoapBindingStub(new java.net.URL(HelloWorldPublisher_address), this);
                _stub.setPortName(getHelloWorldPublisherWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorldPublisher".equals(inputPortName)) {
            return getHelloWorldPublisher();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://javatpoint.com", "HelloWorldPublisherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://javatpoint.com", "HelloWorldPublisher"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorldPublisher".equals(portName)) {
            setHelloWorldPublisherEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
