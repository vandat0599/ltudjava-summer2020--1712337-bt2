use student_manager;

insert into LopHoc (maLopHoc) values("L1");
insert into MonHoc (maMonHoc) values("M1");
insert into SinhVien values("1712338", "Van Dat", "nam", "M1", "L1");
insert into SinhVien values("1712339", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712340", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712341", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712342", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712343", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712344", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712345", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712346", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712347", "Van Dat", "nam", "123123", "L1");
insert into SinhVien values("1712348", "Van Dat", "nam", "123123", "L1");
insert into MonHoc_SinhVien(mssv, maMonHoc) values("1712338", "M1");
select * from MonHoc_SinhVien
