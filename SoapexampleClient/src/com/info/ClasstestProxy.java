package com.info;

public class ClasstestProxy implements com.info.Classtest {
  private String _endpoint = null;
  private com.info.Classtest classtest = null;
  
  public ClasstestProxy() {
    _initClasstestProxy();
  }
  
  public ClasstestProxy(String endpoint) {
    _endpoint = endpoint;
    _initClasstestProxy();
  }
  
  private void _initClasstestProxy() {
    try {
      classtest = (new com.info.ClasstestServiceLocator()).getClasstest();
      if (classtest != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)classtest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)classtest)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (classtest != null)
      ((javax.xml.rpc.Stub)classtest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.info.Classtest getClasstest() {
    if (classtest == null)
      _initClasstestProxy();
    return classtest;
  }
  
  public java.lang.String calc(int i, int j) throws java.rmi.RemoteException{
    if (classtest == null)
      _initClasstestProxy();
    return classtest.calc(i, j);
  }
  
  
}