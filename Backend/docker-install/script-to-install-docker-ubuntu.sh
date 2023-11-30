#!/bin/bash

sudo apt-get update -y
sudo apt-get install -y \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt-get update -y
apt-cache policy docker-ce
sudo apt-get install -y docker-ce
sudo systemctl status docker | cat
sudo docker pull mysql:latest
sudo docker run --name stuff-rental-mysql -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 mysql
sudo docker ps -a