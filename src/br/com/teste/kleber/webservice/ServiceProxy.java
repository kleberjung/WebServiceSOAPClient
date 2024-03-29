package br.com.teste.kleber.webservice;

public class ServiceProxy implements br.com.teste.kleber.webservice.Service {
  private String _endpoint = null;
  private br.com.teste.kleber.webservice.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new br.com.teste.kleber.webservice.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.teste.kleber.webservice.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public br.com.teste.kleber.model.Exame getExame(int id) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getExame(id);
  }
  
  
}