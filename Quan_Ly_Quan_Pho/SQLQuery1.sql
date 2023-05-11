create database QLQuanpho
---==================================================
---Bảng loại phòng
create table Menu
(   
     MaMenu nvarchar(20) primary key,
    Tenmonan nvarchar(10),
    giatien nvarchar(50),
    soluong nvarchar(50),
    TrangThai int

)
drop table Menu
---====================================================
---Bảng dịch vụ
create table hoadon
(
    MaMenu nvarchar(20),
    MaHoaDon nvarchar(20),
    Tenmonan nvarchar(10),
    giatien nvarchar(50),
    soluong nvarchar(50),
		foreign key(MaHoaDon) references Menu(MaMenu)

)