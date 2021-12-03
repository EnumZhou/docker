# docker
用docker来封装spring boot

第一步： 在Project根目录下创建 Dockerfile
COPY ： 把target下面的jar包 create image到 docker上面的server

Docker命令行
1. Docker build -f Dockerfile -t docker-demo-serve（备注：镜像jar包）
2. Docker run -p 8085：9000 docker-demo-serve （备注：告诉docker跑镜像包，docker的port：8085，对应sever 9000）
