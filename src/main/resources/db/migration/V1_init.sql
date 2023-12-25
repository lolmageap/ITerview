create user 'root'@'host.docker.internal';

ALTER USER 'root'@'host.docker.internal' IDENTIFIED WITH mysql_native_password BY 'your-password';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'host.docker.internal';

FLUSH PRIVILEGES;