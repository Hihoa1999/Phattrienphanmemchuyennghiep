<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MY HOME Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
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

<!------ Include the above in your HEAD tag ---------->
<div class="content" style="width: 50rem" >
                    <f:form action="luumoipt.htm" method="post" commandName="phongtro" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="inputAddress">Tên phòng trọ</label>
                            <f:input type="text" class="form-control" path="tenPt" required="required"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Ảnh phòng trọ</label>
                            <f:input path="anh"/>
                            <input type="file" id="fileuploadanh" multiple="" style="display:none"/><input type="button" id="btnUploadanh" value="..."/>
                            
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Giá phòng trọ</label>
                            <f:input type="text" class="form-control" path="gia" required="required"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Địa Chỉ</label>
                            <f:input type="text" class="form-control" path="diaChi" required="required"/>
                        </div>
                        <div class="form-group">
                            <label>Dịch Vụ</label>
                            <f:select type="text" class="form-control" path="dichVu" required="required">
                                    <option value="Cho thuê phòng trọ"> Cho thuê phòng trọ</option>
                                    <option value="Cho thuê nhà nguyên căn"> Cho thuê nhà nguyên căn</option>
                                    <option value="Tìm người ở ghép"> Tìm người ở ghép</option>
                                    <option value="Cho thuê mặt bằng"> Cho thuê mặt bằng</option>                                   
                            </f:select>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Mô tả</label>
                            <f:input type="text" class="form-control" path="mota" required="required"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Nhóm Phòng Trọ</label>
                            <f:select items="${npt}" path="maNhomPt" itemLabel="tenNhomPt" itemValue="maNhomPt" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Tỉnh thành</label>
                            <f:select items="${th}" path="maTinh" itemLabel="tenTinh" itemValue="maTinh" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Liên Hê</label>
                            <f:select items="${kh}" path="maKh" itemLabel="soDienThoai" itemValue="maKh" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Người Đăng</label>
                            <f:select items="${kh}" path="maKh" itemLabel="tenKh" itemValue="maKh" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>Trạng Thái</label>
                            <f:select type="text" class="form-control" path="trangThai" required="required">
                                    <option value="1"> Hiển Thị</option>                                                                    
                            </f:select>
                        <f:button type="submit" class="btn btn-primary">Đăng Tin</f:button>
                    </f:form>
                </div>
        
<jsp:include page="footer.jsp" flush="true"></jsp:include>
    <script src="/HiberDangTin/views/js/jquery.min.js"></script>
    <script src="/HiberDangTin/views/js/bootstrap.min.js"></script>
    <script src="/HiberDangTin/views/js/slick.min.js"></script>
    <script src="/HiberDangTin/views/js/nouislider.min.js"></script>
    <script src="/HiberDangTin/views/js/jquery.zoom.min.js"></script>
    <script src="/HiberDangTin/views/js/main.js"></script>
    <script src="/HiberDangTin/views/js/jasny-bootstrap.min.js"></script>
    <script src="/HiberDangTin/views/js/plugins/moment.min.js"></script>
    


<script>
    $(function () {
        $('#btnUploadanh').click(function () {
            $('#fileuploadanh').trigger('click');
        });
        $('#fileuploadanh').change(function () {
            if (window.FormData !== undefined)
            {
                var fileupload = $('#fileuploadanh').get(0);
                var files = fileupload.files;
                var formdata = new FormData();
                formdata.append('file', files[0]);
                $.ajax({
                    type: 'POST',
                    url: 'uploadanh.htm',
                    contentType: false,
                    processData: false,
                    data: formdata,
                    success: function (url)
                    {
                        $('#anh').val(url);
                        
                    },
                    error: function (msg)
                    {
                        alert(msg.statusText);
                    }
                });
            }
        });
    });
</script>



</body>

</html>
