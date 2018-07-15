package com.javatpoint;

public class HelloWorldPublisherProxy implements com.javatpoint.HelloWorldPublisher {
  private String _endpoint = null;
  private com.javatpoint.HelloWorldPublisher helloWorldPublisher = null;
  
  public HelloWorldPublisherProxy() {
    _initHelloWorldPublisherProxy();
  }
  
  public HelloWorldPublisherProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldPublisherProxy();
  }
  
  private void _initHelloWorldPublisherProxy() {
    try {
      helloWorldPublisher = (new com.javatpoint.HelloWorldPublisherServiceLocator()).getHelloWorldPublisher();
      if (helloWorldPublisher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldPublisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldPublisher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldPublisher != null)
      ((javax.xml.rpc.Stub)helloWorldPublisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javatpoint.HelloWorldPublisher getHelloWorldPublisher() {
    if (helloWorldPublisher == null)
      _initHelloWorldPublisherProxy();
    return helloWorldPublisher;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (helloWorldPublisher == null)
      _initHelloWorldPublisherProxy();
    helloWorldPublisher.main(args);
  }
  
  
}