CREATE DATABASE IF NOT EXISTS oficina;
USE oficina;


CREATE TABLE Fabricante (
    codigo       INT          PRIMARY KEY,
    nome         VARCHAR(100) NOT NULL,
    telefone     VARCHAR(20),
    email        VARCHAR(100),
    responsavel  VARCHAR(100)
);

CREATE TABLE Modelo (
    codigo_de_modelo INT          PRIMARY KEY,
    tipo             VARCHAR(50),
    peso             DECIMAL(10,2),
    fabricante       INT          NOT NULL,
    horaTeste        TIME,
    CONSTRAINT fk_modelo_fabricante
        FOREIGN KEY (fabricante) REFERENCES Fabricante(codigo)
);

CREATE TABLE Oficina (
    codigo      INT          PRIMARY KEY,
    cnpj        VARCHAR(18)  NOT NULL UNIQUE,
    nome        VARCHAR(100) NOT NULL,
    responsavel VARCHAR(100),
    telefone    VARCHAR(20),
    email       VARCHAR(100)
);

CREATE TABLE Tecnico (
    codigo_funcional INT          PRIMARY KEY,
    endereco         VARCHAR(200),
    telefone         VARCHAR(20),
    salario          DECIMAL(10,2),
    qualificacao     VARCHAR(100)
);

CREATE TABLE Maquina (
    numero_de_registro INT PRIMARY KEY,
    ano_de_fabricacao   INT,
    horas_de_uso        DECIMAL(10,2),
    modelo              INT NOT NULL,
    CONSTRAINT fk_maquina_modelo
        FOREIGN KEY (modelo) REFERENCES Modelo(codigo_de_modelo)
);

CREATE TABLE Teste (
    codigo        INT          PRIMARY KEY,
    pontuacao     DECIMAL(5,2),
    resultado     VARCHAR(50),
    recomendacoes TEXT
);


CREATE TABLE Oficina_controla_Teste (
    oficina_codigo INT NOT NULL,
    teste_codigo   INT NOT NULL,
    PRIMARY KEY (oficina_codigo, teste_codigo),
    CONSTRAINT fk_controla_oficina
        FOREIGN KEY (oficina_codigo) REFERENCES Oficina(codigo),
    CONSTRAINT fk_controla_teste
        FOREIGN KEY (teste_codigo) REFERENCES Teste(codigo)
);


CREATE TABLE Oficina_acolhe_Modelo (
    oficina_codigo   INT NOT NULL,
    modelo_codigo    INT NOT NULL,
    PRIMARY KEY (oficina_codigo, modelo_codigo),
    CONSTRAINT fk_acolhe_oficina
        FOREIGN KEY (oficina_codigo) REFERENCES Oficina(codigo),
    CONSTRAINT fk_acolhe_modelo
        FOREIGN KEY (modelo_codigo) REFERENCES Modelo(codigo_de_modelo)
);


CREATE TABLE Tecnico_trabalha_Oficina (
    tecnico_codigo INT NOT NULL,
    oficina_codigo INT NOT NULL,
    PRIMARY KEY (tecnico_codigo, oficina_codigo),
    CONSTRAINT fk_trabalha_tecnico
        FOREIGN KEY (tecnico_codigo) REFERENCES Tecnico(codigo_funcional),
    CONSTRAINT fk_trabalha_oficina
        FOREIGN KEY (oficina_codigo) REFERENCES Oficina(codigo)
);


CREATE TABLE Tecnico_perito_Modelo (
    tecnico_codigo INT NOT NULL,
    modelo_codigo  INT NOT NULL,
    PRIMARY KEY (tecnico_codigo, modelo_codigo),
    CONSTRAINT fk_perito_tecnico
        FOREIGN KEY (tecnico_codigo) REFERENCES Tecnico(codigo_funcional),
    CONSTRAINT fk_perito_modelo
        FOREIGN KEY (modelo_codigo) REFERENCES Modelo(codigo_de_modelo)
);


CREATE TABLE Oficina_tem_Teste (
    oficina_codigo INT NOT NULL,
    teste_codigo   INT NOT NULL,
    PRIMARY KEY (oficina_codigo, teste_codigo),
    CONSTRAINT fk_tem_oficina
        FOREIGN KEY (oficina_codigo) REFERENCES Oficina(codigo),
    CONSTRAINT fk_tem_teste
        FOREIGN KEY (teste_codigo) REFERENCES Teste(codigo)
);


CREATE TABLE Tecnico_faz_Teste (
    tecnico_codigo INT NOT NULL,
    teste_codigo   INT NOT NULL,
    PRIMARY KEY (tecnico_codigo, teste_codigo),
    CONSTRAINT fk_faz_tecnico
        FOREIGN KEY (tecnico_codigo) REFERENCES Tecnico(codigo_funcional),
    CONSTRAINT fk_faz_teste
        FOREIGN KEY (teste_codigo) REFERENCES Teste(codigo)
);