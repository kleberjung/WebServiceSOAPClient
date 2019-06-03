/**
 * Exame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.teste.kleber.model;

public class Exame  implements java.io.Serializable {
    private java.lang.String exame;

    private int id;

    private br.com.teste.kleber.model.Medico medico;

    private br.com.teste.kleber.model.Paciente paciente;

    private java.lang.String responsavel;

    private java.lang.String resultado;

    public Exame() {
    }

    public Exame(
           java.lang.String exame,
           int id,
           br.com.teste.kleber.model.Medico medico,
           br.com.teste.kleber.model.Paciente paciente,
           java.lang.String responsavel,
           java.lang.String resultado) {
           this.exame = exame;
           this.id = id;
           this.medico = medico;
           this.paciente = paciente;
           this.responsavel = responsavel;
           this.resultado = resultado;
    }


    /**
     * Gets the exame value for this Exame.
     * 
     * @return exame
     */
    public java.lang.String getExame() {
        return exame;
    }


    /**
     * Sets the exame value for this Exame.
     * 
     * @param exame
     */
    public void setExame(java.lang.String exame) {
        this.exame = exame;
    }


    /**
     * Gets the id value for this Exame.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Exame.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the medico value for this Exame.
     * 
     * @return medico
     */
    public br.com.teste.kleber.model.Medico getMedico() {
        return medico;
    }


    /**
     * Sets the medico value for this Exame.
     * 
     * @param medico
     */
    public void setMedico(br.com.teste.kleber.model.Medico medico) {
        this.medico = medico;
    }


    /**
     * Gets the paciente value for this Exame.
     * 
     * @return paciente
     */
    public br.com.teste.kleber.model.Paciente getPaciente() {
        return paciente;
    }


    /**
     * Sets the paciente value for this Exame.
     * 
     * @param paciente
     */
    public void setPaciente(br.com.teste.kleber.model.Paciente paciente) {
        this.paciente = paciente;
    }


    /**
     * Gets the responsavel value for this Exame.
     * 
     * @return responsavel
     */
    public java.lang.String getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this Exame.
     * 
     * @param responsavel
     */
    public void setResponsavel(java.lang.String responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the resultado value for this Exame.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this Exame.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exame)) return false;
        Exame other = (Exame) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exame==null && other.getExame()==null) || 
             (this.exame!=null &&
              this.exame.equals(other.getExame()))) &&
            this.id == other.getId() &&
            ((this.medico==null && other.getMedico()==null) || 
             (this.medico!=null &&
              this.medico.equals(other.getMedico()))) &&
            ((this.paciente==null && other.getPaciente()==null) || 
             (this.paciente!=null &&
              this.paciente.equals(other.getPaciente()))) &&
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado())));
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
        if (getExame() != null) {
            _hashCode += getExame().hashCode();
        }
        _hashCode += getId();
        if (getMedico() != null) {
            _hashCode += getMedico().hashCode();
        }
        if (getPaciente() != null) {
            _hashCode += getPaciente().hashCode();
        }
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "Exame"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "exame"));
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
        elemField.setFieldName("medico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "medico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "Medico"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paciente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "paciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "Paciente"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.kleber.teste.com.br", "resultado"));
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
