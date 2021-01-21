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
@Table(name = "TinhThanh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TinhThanh.findAll", query = "SELECT n FROM TinhThanh n"),
    @NamedQuery(name = "TinhThanh.findByMaTinh", query = "SELECT n FROM TinhThanh n WHERE n.maTinh = :maTinh"),
    @NamedQuery(name = "TinhThanh.findByTenTinh", query = "SELECT n FROM TinhThanh n WHERE n.tenTinh = :tenTinh"),
    @NamedQuery(name = "TinhThanh.findByTrangThai", query = "SELECT n FROM TinhThanh n WHERE n.trangThai = :trangThai")})
public class TinhThanh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaTinh")
    private Integer maTinh;
    @Size(max = 50)
    @Column(name = "TenTinh")
    private String tenTinh;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    
     // bảng tỉnh thành  bị bảng phòng trọ liên kết tới
    @OneToMany(mappedBy = "maTinh")
    private Collection<PhongTro> phongTroCollection;

    public TinhThanh() {
    }

    public TinhThanh(Integer maTinh) {
        this.maTinh = maTinh;
    }

    public Integer getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(Integer maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
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
        hash += (maTinh != null ? maTinh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TinhThanh)) {
            return false;
        }
        TinhThanh other = (TinhThanh) object;
        if ((this.maTinh == null && other.maTinh != null) || (this.maTinh != null && !this.maTinh.equals(other.maTinh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.TinhThanh[ maTinh=" + maTinh + " ]";
    }
    
}
