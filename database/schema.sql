-- ============================================================
-- Proyecto Tienda de Tenis - Esquema de base de datos (MySQL)
-- Uso: pegar en la pestaña SQL de phpMyAdmin y pulsar "Continuar"
-- ============================================================
 
CREATE DATABASE IF NOT EXISTS tienda_tenis
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_general_ci;
 
USE tienda_tenis;
 
-- ------------------------------------------------------------
-- Limpieza (en orden inverso por las llaves foráneas)
-- Permite volver a ejecutar el script desde cero.
-- ------------------------------------------------------------
DROP TABLE IF EXISTS detalle_carrito;
DROP TABLE IF EXISTS carrito;
DROP TABLE IF EXISTS inventario;
DROP TABLE IF EXISTS proveedor;
DROP TABLE IF EXISTS producto;
 
-- ------------------------------------------------------------
-- PRODUCTO
-- ------------------------------------------------------------
CREATE TABLE producto (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    nombre      VARCHAR(100)  NOT NULL,
    descripcion VARCHAR(255),
    precio      DECIMAL(10,2) NOT NULL,
    marca       VARCHAR(100)
);
 
-- ------------------------------------------------------------
-- PROVEEDOR
-- ------------------------------------------------------------
CREATE TABLE proveedor (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    nombre   VARCHAR(100) NOT NULL,
    contacto VARCHAR(100)
);
 
-- ------------------------------------------------------------
-- INVENTARIO
-- ------------------------------------------------------------
CREATE TABLE inventario (
    id    INT AUTO_INCREMENT PRIMARY KEY,
    talla INT NOT NULL,
    stock INT NOT NULL DEFAULT 0
);
 
-- ------------------------------------------------------------
-- CARRITO y sus detalles
-- ------------------------------------------------------------
CREATE TABLE carrito (
    id             INT AUTO_INCREMENT PRIMARY KEY,
    fecha_creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);
 
CREATE TABLE detalle_carrito (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    carrito_id  INT NOT NULL,
    producto_id INT NOT NULL,
    cantidad    INT NOT NULL,
    FOREIGN KEY (carrito_id)  REFERENCES carrito(id) ON DELETE CASCADE,
    FOREIGN KEY (producto_id) REFERENCES producto(id),
    UNIQUE KEY uq_carrito_producto (carrito_id, producto_id)
);
 
-- ============================================================
-- DATOS DE EJEMPLO
-- ============================================================
 
INSERT INTO producto (nombre, descripcion, precio, marca) VALUES
('Air Max 90', 'Tenis deportivos Nike', 450000, 'Nike'),
('Ultraboost', 'Tenis running Adidas',  600000, 'Adidas'),
('RS-X',       'Tenis urbanos Puma',    400000, 'Puma');
 
INSERT INTO proveedor (nombre, contacto) VALUES
('Nike Colombia',        '3001234567'),
('Adidas Colombia',      '3109876543'),
('Puma Colombia',        '3112223344'),
('New Balance Colombia', '3205556677');
 
INSERT INTO inventario (talla, stock) VALUES
(40, 50),
(42, 120);
 
INSERT INTO carrito (fecha_creacion) VALUES (NOW()), (NOW());
 
INSERT INTO detalle_carrito (carrito_id, producto_id, cantidad) VALUES
(1, 1, 2),
(1, 2, 1),
(2, 3, 3);
 
-- ============================================================
-- PENDIENTE: tablas de cliente y pedido (aún no migradas a MySQL)
-- ============================================================
 
