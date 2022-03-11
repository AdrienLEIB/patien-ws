# patien-ws
___________________

# pré-requis :

1. mongo d'installé et lancé en local sur le port 27017 (defaut)

- sur MacOS : <br/>
brew tap mongodb/brew <br/>
brew install mongodb-community@5.0 <br/>
mongo


- sur Windows : <br/>

https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/


2. Deployez l'application sur un snapshot 
cd racineduProjet/
mvn clean install

3. Faites tourner l'application dans un JVM
mvn clean spring-boot:run