/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccess.KhachHangDA;
import DataAccess.NhomPhongTroDA;
import DataAccess.PhongTroDA;
import DataAccess.TinhThanhDA;

import Entities.KhachHang;
import Entities.NhomPhongTro;
import Entities.QuangCao;
import Entities.PhongTro;
import Entities.TinhThanh;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ADMIN
 */
@Controller
public class PhongTroController {
        // trang chủ
    // request mapping định tuyến trang jsp
    @RequestMapping(value = "/showphongtro")
    public String getPhongTro(Model model, Integer offset, Integer maxResult) {
        PhongTroDA pt = new PhongTroDA();
        // hien thi san pham
        
        List<PhongTro> list = pt.getProPage1(offset, maxResult);
        model.addAttribute("phongtro", list);

        model.addAttribute("offset", offset);
        model.addAttribute("numberProductDetail", new PhongTroDA().getNumberProductDetail());
        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        // hien thi quang cao
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "home";
    }
        //tìm kiếm phòng trọ
    @RequestMapping(value = "/searchphongtro")
    public String searchphongtro(String tenpt,Model model) {
        PhongTroDA pt = new PhongTroDA();
        List<PhongTro> list = pt.search(tenpt);
        model.addAttribute("phongtro", list);

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        //
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);
        return "home";
    }
        //phân loại phòng trọ
    @RequestMapping(value = "/getGiaBinhDan")
    public String getBinhDan(Model model, Integer offset, Integer maxResult) {
        PhongTroDA pt = new PhongTroDA();
        // hien thi san pham
        List<PhongTro> list = pt.getPhongTroByBD();
        model.addAttribute("phongtro", list);

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        // hien thi quang cao
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "giabinhdan";
    }

    @RequestMapping(value = "/getGiaThuongLuu")
    public String getThươngLuu(Model model, Integer offset, Integer maxResult) {
        PhongTroDA pt = new PhongTroDA();
        // hien thi san pham

        List<PhongTro> list = pt.getPhongTroByTL();
        model.addAttribute("phongtro", list);

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        // hien thi quang cao
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "giathuongluu";
    }

    @RequestMapping(value = "/getGiaPhoThong")
    public String getPhoThong(Model model, Integer offset, Integer maxResult) {
        PhongTroDA pt = new PhongTroDA();
        // hien thi san pham

        List<PhongTro> list = pt.getPhongTroByPT();
        model.addAttribute("phongtro", list);

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        // hien thi quang cao
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "giaphothong";
    }
   
        // chi tiết quảng cáo
    @RequestMapping(value = "/detailquangcao")
    public String detailquangcao(int maQc, Model model) {
        PhongTroDA pt = new PhongTroDA();
        model.addAttribute("quangcao", pt.getByIdQuangCao(maQc));

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "bannerdetails";
    }
    
        // tìm kiếm theo nhóm phòng trọ
    @RequestMapping(value = "/searchbynhompt")
    public String getByNhomPt(int maNhomPt, Model model) {
        PhongTroDA pt = new PhongTroDA();
        List<PhongTro> list = pt.getByNhomPt(maNhomPt);
        model.addAttribute("phongtro", list);

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);

        //Hien thi quang cáo
        List<QuangCao> ls = pt.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "home";
    }
        // chuyển trang đăng nhập
    @RequestMapping(value = "/loginuser")
    public String dangnhap(Model model) {
        PhongTroDA pt = new PhongTroDA();
        KhachHang kh = new KhachHang();
        model.addAttribute("khachHang", kh);

        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "login";
    }
     // quên mật khẩu 
    @RequestMapping(value = "/quenmatkhau")
    public String quenMatKhau(Model model) {
        PhongTroDA pt = new PhongTroDA();
        KhachHang kh = new KhachHang();
        model.addAttribute("khachHang", kh);

        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "quenmk";
    }
        // đăng nhập
    @RequestMapping(value = "/dangnhap")
    public String Login(Integer offset, Integer maxResult, HttpServletRequest request, HttpServletResponse response, KhachHang kh, ModelMap mm, Model model) {
        PhongTroDA da = new PhongTroDA();
        KhachHang k = da.Login(kh.getTenTk(), kh.getMatKhau());
        if (k != null) {
            HttpSession session = request.getSession();
            session.setAttribute("ten", k.getTenKh());
            session.setAttribute("email", k.getEmail());
            session.setAttribute("cauHoi", k.getCauHoi());
            session.setAttribute("cauTraLoi", k.getCauTraLoi());
            session.setAttribute("nhapLaiMatKhau", k.getNhapLaiMatKhau());
            session.setAttribute("sodienthoai", k.getSoDienThoai());

            session.setAttribute("ma", k.getMaKh());

           
            List<PhongTro> list = da.getProPage1(offset, maxResult);
            model.addAttribute("phongtro", list);

            model.addAttribute("offset", offset);
            model.addAttribute("numberProductDetail", new PhongTroDA().getNumberProductDetail());
            // hien thi danh muc
            List<NhomPhongTro> l = da.getNhom();
            model.addAttribute("nhomphongtro", l);
            // hien thi quang cao
            List<QuangCao> ls = da.getAllQuangCao();
            model.addAttribute("quangcao", ls);
            return "home";
        } else {
            mm.put("msg", "Tài khoản hoặc mật khẩu không đúng");
            return "login";
        }

    }
        // thử đăng nhập cách khác
    @RequestMapping(value = "/quenmk")
    public String QuenMk(Integer offset, Integer maxResult, HttpServletRequest request, HttpServletResponse response, KhachHang kh, ModelMap mm, Model model) {
        PhongTroDA da = new PhongTroDA();
        KhachHang k = da.QuenMK(kh.getTenTk(), kh.getCauHoi(), kh.getCauTraLoi());
        if (k != null) {
            HttpSession session = request.getSession();
            session.setAttribute("ten", k.getTenKh());
            session.setAttribute("email", k.getEmail());
            session.setAttribute("cauHoi", k.getCauHoi());
            session.setAttribute("cauTraLoi", k.getCauTraLoi());
            session.setAttribute("nhapLaiMatKhau", k.getNhapLaiMatKhau());
            session.setAttribute("sodienthoai", k.getSoDienThoai());

            session.setAttribute("ma", k.getMaKh());

            List<PhongTro> list = da.getProPage1(offset, maxResult);
            model.addAttribute("phongtro", list);

            model.addAttribute("offset", offset);
            model.addAttribute("numberProductDetail", new PhongTroDA().getNumberProductDetail());
            // hien thi danh muc
            List<NhomPhongTro> l = da.getNhom();
            model.addAttribute("nhomphongtro", l);
            // hien thi quang cao
            List<QuangCao> ls = da.getAllQuangCao();
            model.addAttribute("quangcao", ls);
            return "home";
        } else {
            mm.put("msg", "Trả lời chưa đúng, thử lại lần sau nhé !");
            return "login";
        }

    }
        //đăng ký ( thêm khach hang )
    @RequestMapping(value = "/dangKyKhachHang")
    public String savebook(HttpServletRequest request, KhachHang kh, BindingResult result, ModelMap mm, String email, String tenKh, String tenTk, String matKhau, String nhapLaiMatKhau, Integer soDienThoai, String cauHoi, String cauTraLoi, Model model) {
        PhongTroDA da = new PhongTroDA();

        if (tenTk.length() < 6) {
            mm.put("msgchecktk", "Độ dài tài khoản > 6");
            return "login";
        }

        if (matKhau.length() < 6) {
            mm.put("msgcheckmk", "Độ dài mật khẩu > 6");
            return "login";
        }
        if (!(matKhau).equals(nhapLaiMatKhau)) {
            mm.put("msgchecktk", "Mật khẩu không trùng khớp");
            return "login";
        }

        KhachHang ks = da.checkTaiKhoan(kh.getTenTk());
        if (ks != null) {
            HttpSession session = request.getSession();
            session.setAttribute("ten", ks.getTenKh());

            if (session.getAttribute("ten") != null) {
                session.invalidate();
                mm.put("msgcheck1", "Tài khoản đã có người đăng ký");
                return "login";
            }

        }

        KhachHang k = new PhongTroDA().checkEmail(kh.getEmail());
        if (k != null) {
            HttpSession session = request.getSession();
            session.setAttribute("ten", k.getTenKh());

            if (session.getAttribute("ten") != null) {
                session.invalidate();
                mm.put("msgcheck", "Email đã có người đăng ký");
                return "login";
            }
        }
        kh.setTenKh(tenKh);
        kh.setTenTk(tenTk);
        kh.setMatKhau(matKhau);
        kh.setNhapLaiMatKhau(nhapLaiMatKhau);
        kh.setSoDienThoai(soDienThoai);
        kh.setEmail(email);
        kh.setCauHoi(cauHoi);
        kh.setCauTraLoi(cauTraLoi);
        kh.setTrangThai(Boolean.TRUE);
        new PhongTroDA().insertUser(kh);
        model.addAttribute("khachHang", kh);

        mm.put("msgsussessdk", "Bạn đã đăng ký thành công");
        return "login";
    }
            // đăng xuất 
    @RequestMapping(value = "/dangxuat")
    public String Logout(Integer offset, Integer maxResult, HttpServletRequest request, HttpServletResponse response, KhachHang kh, ModelMap mm, Model model) {

        HttpSession session = request.getSession();
        session.invalidate();

        PhongTroDA p = new PhongTroDA();
        List<PhongTro> list = p.getProPage1(offset, maxResult);
        model.addAttribute("phongtro", list);

        model.addAttribute("offset", offset);
        model.addAttribute("numberProductDetail", new PhongTroDA().getNumberProductDetail());
        // hien thi danh muc
        List<NhomPhongTro> l = p.getNhom();
        model.addAttribute("nhomphongtro", l);

        List<QuangCao> ls = p.getAllQuangCao();
        model.addAttribute("quangcao", ls);

        return "home";
    }

    // chuyển trang thêm mới phòng trọ
    @RequestMapping(value = "/taomoiPt")
    public String createPhongTro(Model model, Integer offset, Integer maxResult) {
        PhongTro pt = new PhongTro();
        model.addAttribute("phongtro", pt);
        model.addAttribute("npt", new NhomPhongTroDA().getProPage1(offset, maxResult));
        model.addAttribute("th", new TinhThanhDA().getProPage1(offset, maxResult));
        model.addAttribute("kh", new KhachHangDA().getProPage1(offset, maxResult));
        return "themmoiPt";
    }
        // thêm mới phòng trọ
    @RequestMapping(value = "/luumoipt", method = RequestMethod.POST)
    public String savePhongTro(String tenPt, String anh, double gia, String diaChi, String dichVu, String mota, boolean trangThai, int maTinh, int maNhomPt, int maKh, Model model, Integer offset, Integer maxResult) {
        PhongTro pt = new PhongTro();
        pt.setTenPt(tenPt);
        pt.setAnh(anh);
        pt.setGia(gia);
        pt.setDiaChi(diaChi);
        pt.setDichVu(dichVu);
        pt.setMota(mota);
        pt.setTrangThai(trangThai);
        TinhThanh th = new TinhThanh(maTinh);
        pt.setMaTinh(th);
        NhomPhongTro npt = new NhomPhongTro(maNhomPt);
        pt.setMaNhomPt(npt);
        KhachHang kh = new KhachHang(maKh);
        pt.setMaKh(kh);
        new PhongTroDA().insert(pt);

        PhongTroDA da = new PhongTroDA();
        List<PhongTro> list = da.getProPage1(offset, maxResult);
        model.addAttribute("getAllpt", list);
        model.addAttribute("offset", offset);
        model.addAttribute("numberProductDetail", new PhongTroDA().getNumberProductDetail());
        return "home";
    }

    //load ảnh phòng trọ
    @RequestMapping(value = "uploadanh")
    public ModelAndView upload(HttpServletRequest req, HttpServletResponse res) throws Exception {
        res.setContentType("text/plain");
        if (!(req instanceof MultipartHttpServletRequest)) {
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Expected multipart request");
            return null;
        }
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
        MultipartFile file = multipartRequest.getFile("file");
        File destination = new File(req.getServletContext().getRealPath("images") + "\\" + file.getOriginalFilename());
        file.transferTo(destination);
        res.getWriter().write("http://localhost:8080/HiberDangTin/images/" + file.getOriginalFilename());
        res.flushBuffer();
        return null;
    }
    
         // chi tiết phòng trọ
    @RequestMapping(value = "/detailphongtro")
    public String detailphongtro(int maPt, Model model) {
        PhongTroDA pt = new PhongTroDA();
        model.addAttribute("phongtro", pt.getById(maPt));

        // hien thi danh muc
        List<NhomPhongTro> l = pt.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "details";
    }
            // xem thông tin khach hàng
    @RequestMapping(value = "/thongtinkhachhang")
    public String thongtinkhachhang(int maKh, Model model) {
        PhongTroDA p = new PhongTroDA();
        model.addAttribute("khachHang", p.getMaKhachHang(maKh));

        // hien thi danh muc
        List<NhomPhongTro> l = p.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "userdetails";
    }
            // sửa khách hàng
    @RequestMapping(value = "capnhapkhachhang")
    public String capnhapkhachhang(int maKh, Model model) {
        PhongTroDA p = new PhongTroDA();
        model.addAttribute("khachHang", p.getMaKhachHang(maKh));

        // hien thi danh muc
        List<NhomPhongTro> l = p.getNhom();
        model.addAttribute("nhomphongtro", l);
        return "updateuser";
    }
        // lưu khách hàng
    @RequestMapping(value = "/luukhachhang")
    public String luukhachhang(int maKh, KhachHang kh, BindingResult result, ModelMap mm, String tenKh, String tenTk, String matKhau, String nhapLaiMatKhau, Integer soDienThoai, String email, String cauHoi, String cauTraLoi, Model model) {
        PhongTroDA s = new PhongTroDA();
        if (!(matKhau).equals(nhapLaiMatKhau)) {
            mm.put("msgchecktk", "Mật khẩu không trùng khớp");
            return "userdetails";
        }
        
        kh.setTenKh(tenKh);
        kh.setTenTk(tenTk);
        kh.setMatKhau(matKhau);
        kh.setNhapLaiMatKhau(nhapLaiMatKhau);
        kh.setSoDienThoai(soDienThoai);
        kh.setEmail(email);
        kh.setCauHoi(cauHoi);
        kh.setCauTraLoi(cauTraLoi);
        kh.setTrangThai(Boolean.TRUE);
        new PhongTroDA().updateKhachHang(kh);

        List<NhomPhongTro> l = s.getNhom();
        model.addAttribute("nhomphongtro", l);

        return "userdetails";
    }
    


}
