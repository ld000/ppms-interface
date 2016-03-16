package com.sunway.ws.module.erp.business.cght.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.sunway.ws.core.bean.BaseBean;

@Table(name="i_erp_cght_pay")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zlineid",
    "htbm",
    "xh",
    "zjhxh",
    "fklbbm",
    "fkje",
    "jhfkrq",
    "bz",
    "fkbl",
    "zffsbm",
    "zmmyl01",
    "zmmyl02",
    "zmmyl03",
    "zmmyl04",
    "zmmyl05",
    "zmmyl06",
    "zmmyl07",
    "zmmyl08",
    "zmmyl09",
    "zmmyl10"
})
public class CghtPayBean extends BaseBean {

	@Transient
	@XmlTransient
	private static final long serialVersionUID = 8140713554859304205L;
	
	@Id
	@XmlTransient
	private Long id;
	@XmlElement(name = "ZLINEID")
    protected String zlineid;
    @XmlElement(name = "HTBM")
    protected String htbm;
    @XmlElement(name = "XH")
    protected String xh;
    @XmlElement(name = "ZJHXH")
    protected String zjhxh;
    @XmlElement(name = "FKLBBM")
    protected String fklbbm;
    @XmlElement(name = "FKJE")
    protected String fkje;
    @XmlElement(name = "JHFKRQ")
    protected String jhfkrq;
    @XmlElement(name = "BZ")
    protected String bz;
    @XmlElement(name = "FKBL")
    protected String fkbl;
    @XmlElement(name = "ZFFSBM")
    protected String zffsbm;
    @XmlElement(name = "ZMMYL01")
    @Transient
    protected String zmmyl01;
    @XmlElement(name = "ZMMYL02")
    @Transient
    protected String zmmyl02;
    @XmlElement(name = "ZMMYL03")
    @Transient
    protected String zmmyl03;
    @XmlElement(name = "ZMMYL04")
    @Transient
    protected String zmmyl04;
    @XmlElement(name = "ZMMYL05")
    @Transient
    protected String zmmyl05;
    @XmlElement(name = "ZMMYL06")
    @Transient
    protected String zmmyl06;
    @XmlElement(name = "ZMMYL07")
    @Transient
    protected String zmmyl07;
    @XmlElement(name = "ZMMYL08")
    @Transient
    protected String zmmyl08;
    @XmlElement(name = "ZMMYL09")
    @Transient
    protected String zmmyl09;
    @XmlElement(name = "ZMMYL10")
    @Transient
    protected String zmmyl10;
    @XmlTransient
    private Long headId;
    
	public String getZlineid() {
		return zlineid;
	}
	public void setZlineid(String zlineid) {
		this.zlineid = zlineid;
	}
	public String getHtbm() {
		return htbm;
	}
	public void setHtbm(String htbm) {
		this.htbm = htbm;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getFklbbm() {
		return fklbbm;
	}
	public void setFklbbm(String fklbbm) {
		this.fklbbm = fklbbm;
	}
	public String getFkje() {
		return fkje;
	}
	public void setFkje(String fkje) {
		this.fkje = fkje;
	}
	public String getJhfkrq() {
		return jhfkrq;
	}
	public void setJhfkrq(String jhfkrq) {
		this.jhfkrq = jhfkrq;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getFkbl() {
		return fkbl;
	}
	public void setFkbl(String fkbl) {
		this.fkbl = fkbl;
	}
	public String getZffsbm() {
		return zffsbm;
	}
	public void setZffsbm(String zffsbm) {
		this.zffsbm = zffsbm;
	}
	public String getZmmyl01() {
		return zmmyl01;
	}
	public void setZmmyl01(String zmmyl01) {
		this.zmmyl01 = zmmyl01;
	}
	public String getZmmyl02() {
		return zmmyl02;
	}
	public void setZmmyl02(String zmmyl02) {
		this.zmmyl02 = zmmyl02;
	}
	public String getZmmyl03() {
		return zmmyl03;
	}
	public void setZmmyl03(String zmmyl03) {
		this.zmmyl03 = zmmyl03;
	}
	public String getZmmyl04() {
		return zmmyl04;
	}
	public void setZmmyl04(String zmmyl04) {
		this.zmmyl04 = zmmyl04;
	}
	public String getZmmyl05() {
		return zmmyl05;
	}
	public void setZmmyl05(String zmmyl05) {
		this.zmmyl05 = zmmyl05;
	}
	public String getZmmyl06() {
		return zmmyl06;
	}
	public void setZmmyl06(String zmmyl06) {
		this.zmmyl06 = zmmyl06;
	}
	public String getZmmyl07() {
		return zmmyl07;
	}
	public void setZmmyl07(String zmmyl07) {
		this.zmmyl07 = zmmyl07;
	}
	public String getZmmyl08() {
		return zmmyl08;
	}
	public void setZmmyl08(String zmmyl08) {
		this.zmmyl08 = zmmyl08;
	}
	public String getZmmyl09() {
		return zmmyl09;
	}
	public void setZmmyl09(String zmmyl09) {
		this.zmmyl09 = zmmyl09;
	}
	public String getZmmyl10() {
		return zmmyl10;
	}
	public void setZmmyl10(String zmmyl10) {
		this.zmmyl10 = zmmyl10;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getZjhxh() {
		return zjhxh;
	}
	public void setZjhxh(String zjhxh) {
		this.zjhxh = zjhxh;
	}
	public Long getHeadId() {
		return headId;
	}
	public void setHeadId(Long headId) {
		this.headId = headId;
	}

}
