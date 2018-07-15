/**
 * ClasstestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.info;

public class ClasstestServiceLocator extends org.apache.axis.client.Service implements com.info.ClasstestService {

    public ClasstestServiceLocator() {
    }


    public ClasstestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClasstestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Classtest
    private java.lang.String Classtest_address = "http://localhost:2018/Soapexample/services/Classtest";

    public java.lang.String getClasstestAddress() {
        return Classtest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClasstestWSDDServiceName = "Classtest";

    public java.lang.String getClasstestWSDDServiceName() {
        return ClasstestWSDDServiceName;
    }

    public void setClasstestWSDDServiceName(java.lang.String name) {
        ClasstestWSDDServiceName = name;
    }

    public com.info.Classtest getClasstest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Classtest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClasstest(endpoint);
    }

    public com.info.Classtest getClasstest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.info.ClasstestSoapBindingStub _stub = new com.info.ClasstestSoapBindingStub(portAddress, this);
            _stub.setPortName(getClasstestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClasstestEndpointAddress(java.lang.String address) {
        Classtest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.info.Classtest.class.isAssignableFrom(serviceEndpointInterface)) {
                com.info.ClasstestSoapBindingStub _stub = new com.info.ClasstestSoapBindingStub(new java.net.URL(Classtest_address), this);
                _stub.setPortName(getClasstestWSDDServiceName());
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
        if ("Classtest".equals(inputPortName)) {
            return getClasstest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://info.com", "ClasstestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://info.com", "Classtest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Classtest".equals(portName)) {
            setClasstestEndpointAddress(address);
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
