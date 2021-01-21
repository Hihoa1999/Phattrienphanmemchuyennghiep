/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "NhomPhongTro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NhomPhongTro.findAll", query = "SELECT n FROM NhomPhongTro n"),
    @NamedQuery(name = "NhomPhongTro.findByMaNhomPt", query = "SELECT n FROM NhomPhongTro n WHERE n.maNhomPt = :maNhomPt"),
    @NamedQuery(name = "NhomPhongTro.findByTenNhomPt", query = "SELECT n FROM NhomPhongTro n WHERE n.tenNhomPt = :tenNhomPt"),
    @NamedQuery(name = "NhomPhongTro.findByTrangThai", query = "SELECT n FROM NhomPhongTro n WHERE n.trangThai = :trangThai")})
public class NhomPhongTro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaNhomPt")
    private Integer maNhomPt;
    @Size(max = 100)
    @Column(name = "TenNhomPt")
    private String tenNhomPt;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    
     // bảng nhóm phòng trọ bị bảng phòng trọ liên kết tới
    @OneToMany(mappedBy = "maNhomPt")
    private Collection<PhongTro> phongTroCollection;

    public NhomPhongTro() {
    }

    public NhomPhongTro(Integer maNhomPt) {
        this.maNhomPt = maNhomPt;
    }

    public Integer getMaNhomPt() {
        return maNhomPt;
    }

    public void setMaNhomPt(Integer maNhomPt) {
        this.maNhomPt = maNhomPt;
    }

    public String getTenNhomPt() {
        return tenNhomPt;
    }

    public void setTenNhomPt(String tenNhomPt) {
        this.tenNhomPt = tenNhomPt;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @XmlTransient
    public Collection<PhongTro> getPhongTroCollection() {
        return phongTroCollection;
    }

    public void setPhongTroCollection(Collection<PhongTro> phongTroCollection) {
        this.phongTroCollection = phongTroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNhomPt != null ? maNhomPt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof NhomPhongTro)) {
            return false;
        }
        NhomPhongTro other = (NhomPhongTro) object;
        if ((this.maNhomPt == null && other.maNhomPt != null) || (this.maNhomPt != null && !this.maNhomPt.equals(other.maNhomPt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.NhomPhongTro[ maNhomPt=" + maNhomPt + " ]";
    }
    
}
