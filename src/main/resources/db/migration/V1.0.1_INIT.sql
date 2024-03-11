create user 'root'@'172.20.0.1';

ALTER USER 'root'@'172.20.0.1' IDENTIFIED WITH mysql_native_password BY 'wjd0322189!';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'172.20.0.1';

FLUSH PRIVILEGES;