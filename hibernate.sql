﻿Create database Hibernate
go


use Hibernate

create table TinhThanh(
	MaTinh int identity primary key,
	TenTinh nvarchar(50),
	TrangThai bit)

insert into TinhThanh values(N'Bình Định',1)
insert into TinhThanh values(N'Phú Yên',1)
insert into TinhThanh values(N'Gia Lai',1)

create table QuanTri(
	MaQt int identity primary key,
	TenQt nvarchar(100),
	TaiKhoan nvarchar(100),
	MatKhau nvarchar(100),
	TrangThai bit)

create table KhachHang(
	MaKh int identity primary key,
	TenKh nvarchar(100),
	TenTk nvarchar(50),
	MatKhau nvarchar(50),
	NhapLaiMatKhau nvarchar(50),
	SoDienThoai int,
	Email nvarchar(100),
	CauHoi nvarchar(150),
	CauTraLoi nvarchar(100),
	TrangThai bit)

create table NhomPhongTro(
	MaNhomPt int identity primary key,
	TenNhomPt nvarchar(100),
	TrangThai bit)

insert into KhachHang values (N'Nguyễn Lưu','username123','12345678','12345678',123,'asd@gmail.com','asd','asd',1)

insert into NhomPhongTro values (N'Giá Thượng Lưu',1)
insert into NhomPhongTro values (N'Giá Phổ Thông',1)
insert into NhomPhongTro values (N'Giá Bình Dân',1)

create table PhongTro(
	MaPt int identity primary key,
	TenPt nvarchar(100),
	Anh nvarchar(max),
	Gia float,
	DiaChi nvarchar(300),
	DichVu nvarchar(200),
	MaTinh int foreign key references TinhThanh(MaTinh),
	Mota nvarchar(max),
	TrangThai bit,
	MaNhomPt int foreign key references NhomPhongTro(MaNhomPt),
	MaKh int foreign key references KhachHang(MaKh))
	
insert into PhongTro values(N'Phòng trọ sạch sẽ','https://dulich9.com/wp-content/uploads/2015/06/kinh-nghiem-dat-phong-khach-san-khi-du-lich11.jpg',3000000,'aaa','bbb',1,'...',1,1,1)
insert into PhongTro values(N'Phòng trọ thoáng mát','https://cdn.tgdd.vn/Files/2020/03/30/1245627/kinh-nghiem-tim-phong-tro-gia-re-top-xx-website-t.jpg',500000,'aaa','bbb',1,'...',1,1,1)

insert into PhongTro values(N'Phòng trọ ở ghép nam','https://static123.com/phongtro123/uploads/images/thumbs/900x600/fit/2019/08/27/1_1566888997.jpg',500000,'aaa','bbb',1,'...',1,1,1)
insert into PhongTro values(N'Phòng trọ giá rẻ','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuyySJ0rPOJKa_jbzrMmPCk-UwTfra6gxpwA&usqp=CAU',500000,'aaa','bbb',1,'...',1,1,1)



create table QuangCao(
	MaQc int identity primary key,
	TenQc nvarchar(100),
	Anh nvarchar(max),
	Gia float,
	NhaSanXuat nvarchar(100),
	Mota nvarchar(max),
	TrangThai bit)

insert into QuangCao values(N'Màn hình Gaming LG24MP59G-P','https://www.lg.com/vn/images/MN/features/1ms-desktop.jpg',3900000,'LG',N'Công nghệ AMD FreeSync - Chế độ đồng bộ Dynamic Action Sync - Cân bằng tối Black Stabilizer',1)
insert into QuangCao values('Core i9 10900k','https://www.phucanh.vn/media/news/2807_Intel-i9-10900K-1-1030x773.jpg',12000000,'Intel',N'Công Nghệ Comet Lake - Số nhân 10 Số luồng 20 - Độ Phân Giải Tối Đa 4096 x 2304@60Hz',1)
insert into QuangCao values('Star SR 125cc','http://www.sym.com.vn/images/products/banner/41_1547177036.jpg',27200000,'SYM',N'Động Cơ ECOTECH - Phun Xăng Điện Tử EFI - Phanh Đĩa Trước Sau Chính Xác',1)









