use student_manager;

insert into User(userName, passWord, permission) values("giaovu","giaovu", "gv");
select * from User;
insert into LopHoc(maLopHoc) values("L2");
insert into LopHoc(maLopHoc) values("L3");
insert into LopHoc(maLopHoc) values("L4");
insert into LopHoc(maLopHoc) values("L5");
insert into LopHoc(maLopHoc) values("L6");
insert into LopHoc(maLopHoc) values("L7");
insert into LopHoc(maLopHoc) values("L8");

select * from LopHoc;
delete from MonHoc;
delete from SinhVien where mssv = "1712111";
insert into MonHoc(maMonHoc, tenMonHoc, phongHoc) values("M1","hoc thong ke", "c12");
insert into MonHoc(maMonHoc, tenMonHoc, phongHoc) values("M2","cos so tri tue nhan tao", "c22");
insert into MonHoc(maMonHoc, tenMonHoc, phongHoc) values("M3","xam xi du", "c52");
insert into MonHoc(maMonHoc, tenMonHoc, phongHoc) values("M4","mon hoc cu vo van dat", "c62");
insert into MonHoc(maMonHoc, tenMonHoc, phongHoc) values("M5","phuong phap tinh", "c72");