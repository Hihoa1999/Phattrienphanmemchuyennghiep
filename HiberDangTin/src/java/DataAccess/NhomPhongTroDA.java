/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.NhomPhongTro;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author nguye
 */
public class NhomPhongTroDA {
     private Session s;
      public NhomPhongTroDA() {
        s= NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }
      
      // hiển thị tất cả phòng trọ
    public List<NhomPhongTro>getAll(Integer maxResult){
              return s.createCriteria(NhomPhongTro.class).setMaxResults(maxResult == null ? 1000 : maxResult).list();
    }
        // hiển thị tất cả phòng trọ có trạng thái là 1
    public List<NhomPhongTro> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from NhomPhongTro where trangThai = 1");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }

    public Long getNumberProductDetail() {
        try {

            List list = s.createQuery("from NhomPhongTro  where trangThai = 1").list();
            s.getTransaction().commit();
            s.close();
            return (long) list.size();
        } catch (Exception e) {
            s.getTransaction().rollback();
            s.close();
        }
        return 0L;
    }
     public void insert(NhomPhongTro dm){
        s.save(dm);
        s.getTransaction().commit();
    }
    
    public void update(NhomPhongTro dm){
        s.merge(dm);
        s.getTransaction().commit();
    }
    
    public void delete(NhomPhongTro nsp) {
        s.update(nsp);
        s.getTransaction().commit();
    }

    // lấy các nhóm phòng trọ theo id
    public NhomPhongTro getById(int maNhomSp)
    {
        NhomPhongTro dm = (NhomPhongTro) s.load(NhomPhongTro.class, maNhomSp);
        s.getTransaction().commit();
        return dm;
    }
    
    public List<NhomPhongTro> search(String tenNhomPt)
    {
        Query q=s.createQuery("select s from NhomPhongTro s where s.tenNhomPt like :tenNhomPt");
        q.setParameter("tenNhomPt", "%"+ tenNhomPt+"%");
        return q.list();
    }
}
