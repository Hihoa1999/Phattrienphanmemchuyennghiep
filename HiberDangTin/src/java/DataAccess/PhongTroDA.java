/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.KhachHang;
import Entities.NhomPhongTro;
import Entities.QuangCao;
import Entities.PhongTro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ADMIN
 */
public class PhongTroDA {

    private Session s;

    public PhongTroDA() {
        s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }

    // Nhóm phòng trọ
    public List<NhomPhongTro> getNhom() {
        Query q = s.createQuery("from NhomPhongTro");
        return q.list();
    }

    public List<PhongTro> getByNhomPt(int maNhomPt) {
        Query q = s.createQuery("from PhongTro where maNhomPt = :maNhomPt");
        q.setLong("maNhomPt", maNhomPt);
        return q.list();
    }

    // phòng trọ
    public List<PhongTro> getAll(Integer maxResult) {
        Query q = s.createQuery("from PhongTro where trangThai like '1'");
        return q.setMaxResults(maxResult == null ? 1000 : maxResult).list();
    }

    public List<PhongTro> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from PhongTro where trangThai like '1'");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 12 : maxResult).list();
    }

    public void insert(PhongTro pt) {
        s.save(pt);
        s.getTransaction().commit();
    }

    public Long getNumberProductDetail() {
        try {

            List list = s.createQuery("from PhongTro where trangThai like '1'").list();
            s.getTransaction().commit();
            s.close();
            return (long) list.size();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
            s.close();
        }
        return 0L;
    }

    public PhongTro getById(int maPt) {
        PhongTro pt = (PhongTro) s.load(PhongTro.class, maPt);
        s.getTransaction().commit();
        return pt;
    }
// tim kiếm phòng trọ theo tên
    public List<PhongTro> search(String tenpt) {
        Query q = s.createQuery("select s from PhongTro s where s.tenPt like :tenpt");
        q.setParameter("tenpt", "%" + tenpt + "%");
       
        return q.list();
    }

    /// Quảng cáo
    public List<QuangCao> getAllQuangCao() {
        return s.createCriteria(QuangCao.class).list();
    }

    public QuangCao getByIdQuangCao(int maQc) {
        QuangCao qc = (QuangCao) s.load(QuangCao.class, maQc);
        s.getTransaction().commit();
        return qc;
    }

    //Khách hàng
    public void insertUser(KhachHang khachHang) {
        s.save(khachHang);
        s.getTransaction().commit();
    }

    public KhachHang getMaKhachHang(int maKh) {
        KhachHang kh = (KhachHang) s.load(KhachHang.class, maKh);
        s.getTransaction().commit();
        return kh;
    }

    public void updateKhachHang(KhachHang kh) {
        s.merge(kh);
        s.getTransaction().commit();
    }

    public KhachHang checkEmail(String email) {
        Query query = s.createQuery("from KhachHang where email = :email");
        query.setString("email", email);
        KhachHang kh = (KhachHang) query.uniqueResult();
        s.getTransaction().commit();
        return kh;
    }

    public KhachHang checkTaiKhoan(String tenTk) {
        Query query = s.createQuery("from KhachHang where tenTk = :tenTk");
        query.setString("tenTk", tenTk);
        KhachHang kh = (KhachHang) query.uniqueResult();
        s.getTransaction().commit();
        return kh;
    }

    public KhachHang Login(String tenTk, String matKhau) {
        Query query = s.createQuery("from KhachHang where tenTk = :tenTk and matKhau = :matKhau");
        query.setString("tenTk", tenTk);
        query.setString("matKhau", matKhau);
        KhachHang kh = (KhachHang) query.uniqueResult();
        s.getTransaction().commit();
        return kh;
    }
    public KhachHang QuenMK(String tenTk, String cauHoi, String cauTraLoi) {
        Query query = s.createQuery("from KhachHang where tenTk = :tenTk and cauHoi = :cauHoi and cauTraLoi = :cauTraLoi");
        query.setString("tenTk", tenTk);
        query.setString("cauHoi", cauHoi);
        query.setString("cauTraLoi", cauTraLoi);
        KhachHang kh = (KhachHang) query.uniqueResult();
        s.getTransaction().commit();
        return kh;
    }
 ///  phần loại phòng trọ 
    public List<PhongTro> getPhongTroByBD() {
        Query q = s.createQuery("from PhongTro where gia >= 0 and gia <= 400000");
        return q.list();
    }

    public List<PhongTro> getPhongTroByTL() {
        Query q = s.createQuery("from PhongTro where gia >= 1000000");
        return q.list();
    }

    public List<PhongTro> getPhongTroByPT() {
        Query q = s.createQuery("from PhongTro where gia > 400000 and gia < 1000000");
        return q.list();
    }

}
