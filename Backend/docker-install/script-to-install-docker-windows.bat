@echo off
curl --version >nul 2>&1
if errorlevel 1 (
    echo curl is not installed. Please install curl and run this script again.
    pause
    exit /b
)
set url="https://desktop.docker.com/win/main/amd64/Docker%20Desktop%20Installer.exe?utm_source=docker&utm_medium=webreferral&utm_campaign=dd-smartbutton&utm_location=module"
set filename="Docker_Desktop_Installer.exe"
curl %url% -o %filename%
echo File downloaded successfully.

docker --version >nul 2>&1
if errorlevel 1 (
    echo Docker is not installed. Please install Docker and run this script again.
    pause
    exit /b
)
docker pull mysql:latest
docker run --name stuff-rental-mysql -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 mysql
docker ps -a
pause
