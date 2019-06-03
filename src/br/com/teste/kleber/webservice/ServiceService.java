/**
 * ServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.teste.kleber.webservice;

public interface ServiceService extends javax.xml.rpc.Service {
    public java.lang.String getServiceAddress();

    public br.com.teste.kleber.webservice.Service getService() throws javax.xml.rpc.ServiceException;

    public br.com.teste.kleber.webservice.Service getService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
