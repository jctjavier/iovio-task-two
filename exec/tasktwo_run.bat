cls 

echo 'Bol.Com automation test starts now. Task 2 for IOVIO TC'
echo 'by: jctjavier'

git clone https://github.com/jctjavier/iovio-task-two.git
cd iovio-task-two
git fetch 
git pull
mvn clean install test
