CREATE TABLE IF NOT EXISTS saludo(
    id uuid primary key not null,
    saludo varchar(255),
    nombre varchar(50),
    default_saludo boolean
);

INSERT INTO saludo(id, saludo, nombre, default_saludo) VALUES ('7cb5926a-30e9-4bff-8f54-98becf9cdc18', 'Hola Brais', 'Brais', true);