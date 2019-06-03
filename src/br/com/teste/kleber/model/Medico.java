/**
 * Medico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.teste.kleber.model;

public class Medico  implements java.io.Serializable {
    private java.lang.String crm;

    private java.lang.String especialidade;

    private int id;

    private java.lang.String nome;

    public Medico() {
    }

    public Medico(
           java.lang.String crm,
           java.lang.String especialidade,
           int id,
           java.lang.String nome) {
           this.crm = crm;
           this.especialidade = especialidade;
           this.id = id;
           this.nome = nome;
    }


    /**
     * Gets the crm value for this Medico.
     * 
     * @return crm
     */
    public java.lang.String getCrm() {
        return crm;
    }


    /**
     * Sets the crm value for this Medico.
     * 
     * @param crm
     */
    public void setCrm(java.lang.String crm) {
        this.crm = crm;
    }


    /**
     * Gets the especialidade value for this Medico.
     * 
     * @return especialidade
     */
    public java.lang.String getEspecialidade() {
        return especialidade;
    }


    /**
     * Sets the especialidade value for this Medico.
     * 
     * @param especialidade
     */
    public void setEspecialidade(java.lang.String especialidade) {
        this.especialidade = especialidade;
    }


    /**
     * Gets the id value for this Medico.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Medico.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this Medico.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Medico.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Medico)) return false;
        Medico other = (Medico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crm==null && other.getCrm()==null) || 
             (this.crm!=null &&
              this.crm.equals(other.getCrm()))) &&
            ((this.especialidade==null && other.getEspecialidade()==null) || 
             (this.especialidade!=null &&
              this.especialidade.equals(other.getEspecialidade()))) &&
            this.id == other.getId() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCrm() != null) {
            _hashCode += getCrm().hashCode();
        }
        if (getEspecialidade() != null) {
            _hashCode += getEspecialidade().hashCode();
        }
        _hashCode += getId();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Medico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "Medico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "crm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especialidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "especialidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
