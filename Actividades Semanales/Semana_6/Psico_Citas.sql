USE PsicoCitasDB;
GO

-- Tabla Usuarios (cuentas)
CREATE TABLE Usuarios (
    id_usuario INT IDENTITY(1,1) PRIMARY KEY,
    nombre_usuario NVARCHAR(100) NOT NULL,
    contrasena NVARCHAR(256) NOT NULL,
    tipo_usuario NVARCHAR(20) NOT NULL CHECK (tipo_usuario IN ('Paciente','Psicologo','Admin')),
    fecha_creacion DATETIME DEFAULT GETDATE()
);
GO

-- Tabla Pacientes
CREATE TABLE Pacientes (
    id_paciente INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT NOT NULL,
    nombre NVARCHAR(100) NOT NULL,
    apellido NVARCHAR(100) NOT NULL,
    edad INT NULL,
    telefono NVARCHAR(20) NULL,
    correo NVARCHAR(150) NULL,
    CONSTRAINT FK_Pacientes_Usuarios FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
);
GO

-- Tabla Psicologos
CREATE TABLE Psicologos (
    id_psicologo INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT NOT NULL,
    nombre NVARCHAR(100) NOT NULL,
    apellido NVARCHAR(100) NOT NULL,
    especialidad NVARCHAR(150) NULL,
    telefono NVARCHAR(20) NULL,
    correo NVARCHAR(150) NULL,
    CONSTRAINT FK_Psicologos_Usuarios FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
);
GO

-- Tabla Citas
CREATE TABLE Citas (
    id_cita INT IDENTITY(1,1) PRIMARY KEY,
    id_paciente INT NOT NULL,
    id_psicologo INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    motivo NVARCHAR(400) NULL,
    estado NVARCHAR(20) DEFAULT 'Pendiente',
    CONSTRAINT FK_Citas_Paciente FOREIGN KEY (id_paciente) REFERENCES Pacientes(id_paciente),
    CONSTRAINT FK_Citas_Psicologo FOREIGN KEY (id_psicologo) REFERENCES Psicologos(id_psicologo)
);
GO
