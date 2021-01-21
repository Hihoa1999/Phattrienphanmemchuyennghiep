/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.TinhThanh;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author nguye
 */
public class TinhThanhDA {
    private Session s;
      public TinhThanhDA() {
        s= NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }
   
    public List<TinhThanh>getAll(Integer maxResult){
              return s.createCriteria(TinhThanh.class).setMaxResults(maxResult == null ? 1000 : maxResult).list();
    }

    public List<TinhThanh> getProPage1(Integer offset, Integer maxResult) {
        Query q = s.createQuery("from TinhThanh where trangThai = 1");
        return q.setFirstResult(offset == null ? 0 : offset).setMaxResults(maxResult == null ? 4 : maxResult).list();
    }

    public Long getNumberProductDetail() {
        try {

            List list = s.createQuery("from TinhThanh where trangThai = 1").list();
            s.getTransaction().commit();
            s.close();
            return (long) list.size();
        } catch (Exception e) {
            s.getTransaction().rollback();
            s.close();
        }
        return 0L;
    }
    
     public void insert(TinhThanh th){
        s.save(th);
        s.getTransaction().commit();
    }
    
    public void update(TinhThanh th){
        s.merge(th);
        s.getTransaction().commit();
    }
    
    public void delete(TinhThanh th)
    {
        s.update(th);
        s.getTransaction().commit();
    }
    
    public TinhThanh getById(int maNcc)
    {
        TinhThanh ncc = (TinhThanh) s.load(TinhThanh.class, maNcc);
        s.getTransaction().commit();
        return ncc;
    }
    
    public List<TinhThanh> search(String tenTinh)
    {
        Query q=s.createQuery("select ncc from TinhThanh ncc where ncc.tenTinh like :tenTinh");
        q.setParameter("tenTinh", "%"+ tenTinh+"%");
        return q.list();
    }
}
