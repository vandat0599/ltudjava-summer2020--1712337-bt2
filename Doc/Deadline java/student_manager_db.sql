-- MySQL Script generated by MySQL Workbench
-- Sat Jun 13 00:37:50 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema student_manager
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `student_manager` ;

-- -----------------------------------------------------
-- Schema student_manager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `student_manager` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `student_manager` ;

-- -----------------------------------------------------
-- Table `student_manager`.`LopHoc`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_manager`.`LopHoc` ;

CREATE TABLE IF NOT EXISTS `student_manager`.`LopHoc` (
  `maLopHoc` VARCHAR(45) NOT NULL,
  `mssv` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`maLopHoc`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `student_manager`.`SinhVien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_manager`.`SinhVien` ;

CREATE TABLE IF NOT EXISTS `student_manager`.`SinhVien` (
  `mssv` VARCHAR(7) NOT NULL,
  `hoTen` VARCHAR(45) NULL DEFAULT NULL,
  `gioiTInh` VARCHAR(45) NULL DEFAULT NULL,
  `cmnd` VARCHAR(9) NULL DEFAULT NULL,
  `maMonHoc` VARCHAR(45) NULL DEFAULT NULL,
  `maLopHoc` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mssv`),
  INDEX `fk_SinhVien_LopHoc_idx` (`maLopHoc` ASC) VISIBLE,
  CONSTRAINT `fk_SinhVien_LopHoc`
    FOREIGN KEY (`maLopHoc`)
    REFERENCES `student_manager`.`LopHoc` (`maLopHoc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `student_manager`.`MonHoc`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_manager`.`MonHoc` ;

CREATE TABLE IF NOT EXISTS `student_manager`.`MonHoc` (
  `maMonHoc` VARCHAR(45) NOT NULL,
  `mssv` VARCHAR(45) NULL,
  `tenMonHoc` VARCHAR(45) NULL DEFAULT NULL,
  `phongHoc` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`maMonHoc`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `student_manager`.`Diem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_manager`.`Diem` ;

CREATE TABLE IF NOT EXISTS `student_manager`.`Diem` (
  `mssv` VARCHAR(7) NULL,
  `maMonHoc` VARCHAR(45) NULL,
  `diemGK` FLOAT NULL DEFAULT NULL,
  `diemCK` FLOAT NULL DEFAULT NULL,
  `diemKhac` FLOAT NULL DEFAULT NULL,
  `diemTong` FLOAT NULL DEFAULT NULL,
  INDEX `fk_Diem_SinhVien1_idx` (`mssv` ASC) VISIBLE,
  INDEX `fk_Diem_MonHoc1_idx` (`maMonHoc` ASC) VISIBLE,
  CONSTRAINT `fk_Diem_SinhVien1`
    FOREIGN KEY (`mssv`)
    REFERENCES `student_manager`.`SinhVien` (`mssv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Diem_MonHoc1`
    FOREIGN KEY (`maMonHoc`)
    REFERENCES `student_manager`.`MonHoc` (`maMonHoc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `student_manager`.`MonHoc_has_SinhVien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `student_manager`.`MonHoc_has_SinhVien` ;

CREATE TABLE IF NOT EXISTS `student_manager`.`MonHoc_has_SinhVien` (
  `mssv` VARCHAR(7) NOT NULL,
  `maMonHoc` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`mssv`, `maMonHoc`),
  INDEX `fk_MonHoc_has_SinhVien_SinhVien1_idx` (`mssv` ASC) VISIBLE,
  CONSTRAINT `fk_MonHoc_has_SinhVien_SinhVien1`
    FOREIGN KEY (`mssv`)
    REFERENCES `student_manager`.`SinhVien` (`mssv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MonHoc_has_SinhVien_MonHoc1`
    FOREIGN KEY (`maMonHoc`)
    REFERENCES `student_manager`.`MonHoc` (`maMonHoc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
