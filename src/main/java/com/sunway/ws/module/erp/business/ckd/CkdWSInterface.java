package com.sunway.ws.module.erp.business.ckd;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.sunway.ws.module.erp.business.ckd.bean.CkdServerBean;

/**
 * This class was generated by Apache CXF 3.0.6
 * 2015-11-23T14:59:44.609+08:00
 * Generated source version: 3.0.6
 * 
 */
@WebService(targetNamespace = "urn:seg:ecc:ca:ppms", name = "SI_SEG_PPMS_CA_GI_REQ_A_OUT")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CkdWSInterface {

    @WebMethod(operationName = "SI_SEG_PPMS_CA_GI_REQ_OUT", action = "http://sap.com/xi/WebService/soap1.1")
    @Oneway
    public void siSEGPPMSCAGIREQOUT(
        @WebParam(partName = "MT_SEG_PPMS_CA_GI_REQ_OUT", name = "MT_SEG_PPMS_CA_GI_REQ_OUT", targetNamespace = "urn:seg:ecc:ca:ppms")
        CkdServerBean ckdServerBean
    );
}
