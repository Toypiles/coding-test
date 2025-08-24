# coding-test
코테 준비
solved.ac
*b1...s4 s#500.. -@$me %ko

http://toypiles.duckdns.org/

http://toypiles.duckdns.org/?folder=/home/coder/project/code/coding-test

git status
git add.
git restore --staged

git commit -m "커밋 메시지" 

git push

https://fromitive.github.io/fromitive-blog/cs/2023-07-10-java/#2-openjdk
~
우텍 자동차 경주
https://github.com/noxknow/java-racingcar-6-mirror?tab=readme-ov-file

gcp에 인스턴스 생성 (우분투, 메모리 100gb)

ip 주소 고정

8080 포트 개방 (방화벽)

웹브라우저 ssh
# docker 설치

## Add Docker's official GPG key:
sudo apt-get update
sudo apt-get install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc

## Add the repository to Apt sources:
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

# code-server 실행
sudo docker run --name code-server -p 80:8080 -v "$PWD:/home/coder/project" -e PASSWORD=원하는 비밀번호 codercom/code-server:latest &

# 사용자 권한 추가
sudo chown -R coder *
sudo chmod ugo+rwx -R /home/coder/project


웹 화면에서 html, css, js를 통해 만드는 사이트
https://junho0811.tistory.com/63
