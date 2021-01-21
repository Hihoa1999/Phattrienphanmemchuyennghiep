<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MY HOME Page</title>
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/HiberDangTin/views/css/bootstrap.min.css" />
        <link type="text/css" rel="stylesheet" href="/HiberDangTin/views/css/slick.css" />
        <link type="text/css" rel="stylesheet" href="/HiberDangTin/views/css/slick-theme.css" />
        <link type="text/css" rel="stylesheet" href="/HiberDangTin/views/css/nouislider.min.css" />
        <link rel="stylesheet" href="/HiberDangTin/views/css/font-awesome.min.css">
        <link type="text/css" rel="stylesheet" href="/HiberDangTin/views/css/style.css" />
    </head>
    <body>
        <header>
            <jsp:include page="header.jsp" flush="true"></jsp:include>
            </header>
            <jsp:include page="menu.jsp" flush="true"></jsp:include>
                <!-- menu nav -->
            </div>
        </div>
        <!-- /container -->
    </div>
    <!-- /NAVIGATION -->
    <!-- section -->
    <div class="section">
        <!-- container -->
        <div class="container">
            <!-- row -->
            <div class="row">
                <!--  Product Details -->
                <div class="product product-details clearfix">
                    <div class="col-md-6">
                        <div id="product-main-view">
                            <div class="product-view">
                                <img src="${phongtro.anh}" alt="">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="product-body">
                            <h2 class="product-name">Tên phòng trọ : ${phongtro.tenPt}</h2>
                            <h3 class="product-price">Giá phòng trọ : <fmt:formatNumber value="${phongtro.gia}"/> VNĐ</h3>
                            <p><strong>Tỉnh Thành:</strong> ${phongtro.maTinh.tenTinh}</p>
                            <p><strong>Địa Chỉ:</strong> ${phongtro.diaChi}</p>
                            <p><strong>Dịch Vụ:</strong> ${phongtro.dichVu}</p>
                            <p><strong>Người Đăng:</strong> ${phongtro.maKh.tenKh}</p>
                            <p><strong>Liên Hệ:</strong> ${phongtro.maKh.soDienThoai}</p>
                            <p><strong>Mô tả:</strong></p>
                            <p>${phongtro.mota}</p>
                            <form action="www.google.com/maps/place/<%=session.getAttribute("diaChi")%>" method="post">
                            <div class="product-btns">
                                <button class="primary-btn add-to-cart" onclick="location.href = 'www.google.com/maps/place/<%=session.getAttribute("diaChi")%>'">Vị Trí</button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /Product Details -->
            </div>
            <!-- /row -->
        </div>
        <!-- /container -->
    </div>

    <jsp:include page="footer.jsp" flush="true"></jsp:include>
    <script src="/HiberDangTin/views/js/jquery.min.js"></script>
    <script src="/HiberDangTin/views/js/bootstrap.min.js"></script>
    <script src="/HiberDangTin/views/js/slick.min.js"></script>
    <script src="/HiberDangTin/views/js/nouislider.min.js"></script>
    <script src="/HiberDangTin/views/js/jquery.zoom.min.js"></script>
    <script src="/HiberDangTin/views/js/main.js"></script>

</body>

</html>

