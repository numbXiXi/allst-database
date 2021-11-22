# Neo4j

## 知识图谱

## 图数据库
```text
图数据库(Graph database)指的是以图数据结构的形式来存储和查询数据的数据库。

```

## neo4j
```text
Neo4j构建模块


Linux下neo4j环境搭建
1、下载地址：
https://neo4j.com/artifact.php?name=neo4j-community-3.5.17-unix.tar.gz
2、解压
tar -xvf neo4j-community-3.5.17.tar
3、修改配置文件 neo4j.conf
vi conf/neo4j.conf
主要是修改 允许远程访问的地址 把对应的注释打开即可
dbms.connectors.default_listen_address=0.0.0.0
4、开放对应的访问端口 默认要开放7474 和 7687
firewall-cmd --zone=public --add-port=7474/tcp --permanent
firewall-cmd --zone=public --add-port=7687/tcp --permanent
systemctl reload firewalld
5、neo4j启动命令
./bin/neo4j start
6、使用浏览器 访问服务器上的 neo4j
http://ip:7474/
我这里的ip：192.168.0.108
默认的账号是 neo4j 密码 neo4j 这里第一次登录的话会要求修改密
第一次访问时需要登录用户名和密码：都为neo4j, 需要修改密码：我这里修改为：hadoop

Windows下neo4j环境搭建：
1、下载地址：
https://neo4j.com/download-center/#community
下载最新的Neo4j Server安装文件、可以看到 neo4J 软件 exe 或 zip 格式的所有版本
2、解压
我下载版本为：neo4j-community-4.3.6-windows.zip
3、修改配置文件conf/neo4j.conf
dbms.connectors.default_listen_address=0.0.0.0
4、通过 neo4j.bat install-service 安装neo4j服务
注意的问题: 如果是4.0 以及以上版本需要jdk11
修改文件 bin/neo4j.ps1
Import-Module "neo4j的主目录\bin\Neo4j-Management.psd1"
如果配置了环境变量，上述修改文件步骤则不用执行。
5、neo4j.bat启动
neo4j.bat start
6、使用浏览器 访问服务器上的 neo4j
http://127.0.0.1:7474
默认的账号是 neo4j 密码 neo4j 这里第一次登录的话会要求修改密码

```