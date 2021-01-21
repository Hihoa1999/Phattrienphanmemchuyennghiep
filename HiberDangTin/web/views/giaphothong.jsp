<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

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
                    <!-- section title -->
                    <div class="col-md-12">
                        <div class="section-title">
                            <h2 class="title">Phòng trọ</h2>
                        </div>
                    </div>
                    <!-- section title -->
                    <c:forEach items="${phongtro}" var="s">
                        <!-- Product Single -->
                        <div class="col-md-3 col-sm-6 col-xs-6">
                            <div class="product product-single">
                                <div class="product-thumb">
                                    <input type="button" value="Chi tiết" class="main-btn quick-view" onclick="location.href = 'detailphongtro.htm?maPt=${s.maPt}'">
                                    <img src="${s.anh}" width="200px" height="310px" alt="">
                                </div>
                                <div class="product-body">
                                    <h3 class="product-price colortext">$${s.gia}</h3>
                                    
                                    <h2 class="product-name colorname">${s.tenPt}</a></h2>
                                    <div class="product-btns" >
                                 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <div class="row">
                    <div class="col-md-12 col-sm-12" style="text-align: right"></div>
                </div>
                <br>
                <div class="keys" style="display: none" title="/shop">
                    <span>2</span><span>3</span><span>4</span>
                </div>
                <div style=" text-align: center ;padding-right: 20px">
                    <mytag:my_tag steps="12" offset="${offset}" count="${numberProductDetail}"   uri="showsanpham.htm" next="&raquo;"   previous="&laquo;"/>
                </div>
                <!-- /Product Single -->
            </div>
        </div>
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

