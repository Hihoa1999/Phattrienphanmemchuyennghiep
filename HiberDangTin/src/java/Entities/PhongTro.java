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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PhongTro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhongTro.findAll", query = "SELECT s FROM PhongTro s"),
    @NamedQuery(name = "PhongTro.findByMaPt", query = "SELECT s FROM PhongTro s WHERE s.maPt = :maPt"),
    @NamedQuery(name = "PhongTro.findByTenPt", query = "SELECT s FROM PhongTro s WHERE s.tenPt = :tenPt"),
    @NamedQuery(name = "PhongTro.findByAnh", query = "SELECT s FROM PhongTro s WHERE s.anh = :anh"),
    @NamedQuery(name = "PhongTro.findByGia", query = "SELECT s FROM PhongTro s WHERE s.gia = :gia"),
    @NamedQuery(name = "PhongTro.findByDiaChi", query = "SELECT s FROM PhongTro s WHERE s.diaChi = :diaChi"),
    @NamedQuery(name = "PhongTro.findByDichVu", query = "SELECT s FROM PhongTro s WHERE s.dichVu = :dichVu"),
    @NamedQuery(name = "PhongTro.findByMota", query = "SELECT s FROM PhongTro s WHERE s.mota = :mota"),
    @NamedQuery(name = "PhongTro.findByTrangThai", query = "SELECT s FROM PhongTro s WHERE s.trangThai = :trangThai")})
public class PhongTro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaPt")
    private Integer maPt;
    @Size(max = 100)
    @Column(name = "TenPt")
    private String tenPt;
    @Size(max = 1073741823)
    @Column(name = "Anh")
    private String anh;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Gia")
    private Double gia;
    @Size(max = 1073741823)
    @Column(name = "DiaChi")
    private String diaChi;
    @Size(max = 300)
    @Column(name = "DichVu")
    private String dichVu;
    @Size(max = 200)
    @Column(name = "Mota")
    private String mota;
    @Column(name = "TrangThai")
    private Boolean trangThai;
     // bảng phòng trọ liên kết tới bảng tỉnh thành
    @JoinColumn(name = "MaTinh", referencedColumnName = "MaTinh")
    @ManyToOne
    private TinhThanh maTinh;
    // bảng phòng trọ liên kết tới bảng nhóm phòng trọ
    @JoinColumn(name = "MaNhomPt", referencedColumnName = "MaNhomPt")
    @ManyToOne
    private NhomPhongTro maNhomPt;
    // bảng phòng trọ liên kết tới bảng khách hàng
    @JoinColumn(name = "MaKh", referencedColumnName = "MaKh")
    @ManyToOne 
    private KhachHang maKh;
    

    public PhongTro() {
    }

    public PhongTro(Integer maPt) {
        this.maPt = maPt;
    }

    public Integer getMaPt() {
        return maPt;
    }

    public void setMaPt(Integer maPt) {
        this.maPt = maPt;
    }

    public String getTenPt() {
        return tenPt;
    }

    public void setTenPt(String tenPt) {
        this.tenPt = tenPt;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public TinhThanh getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(TinhThanh maTinh) {
        this.maTinh = maTinh;
    }

    public NhomPhongTro getMaNhomPt() {
        return maNhomPt;
    }

    public void setMaNhomPt(NhomPhongTro maNhomPt) {
        this.maNhomPt = maNhomPt;
    }
    
    public KhachHang getMaKh() {
        return maKh;
    }

    public void setMaKh(KhachHang maKh) {
        this.maKh = maKh;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maPt != null ? maPt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhongTro)) {
            return false;
        }
        PhongTro other = (PhongTro) object;
        if ((this.maPt == null && other.maPt != null) || (this.maPt != null && !this.maPt.equals(other.maPt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PhongTro[ maPt=" + maPt + " ]";
    }
    
}
