
//WEB ARCHITECTURE 
/*                                                   
                                                   
             HTTP REQUEST                         DBCONNECTOR;
CLIENT  ----------------------------------> API -------------> DATABASE----------->SERVER
        <---------------------------------      <--------------  |      <-----------
             HTTP RESPONSE                  |     DBDRIVER       DB:Database(EG: MONGO)
            |                               |      |
            |                               |      DBCONNECTOR:Connect any application to DB 
            |                               |      DBDRIVER :allows any application to interact with the database system to which it is already connected 
            |                               |               
            |                             RESTFUL API : API with get , put,pot,delete(EG: EXPRESS FOR BUILDING RESTFUL API),
            |                                                 
            |                                
            |
            |                                
            | 
            |
            HTTP URL(USE POSTMAN FOR  METHODS , BODY , ERRORS)
            METHOD http://www.ncb.nlm.nig.gov:3000/restful/courses/maths/value1/value2/?param1=value1&param2=value2    {  }     error
              |      |          |                  |             |            |            |                            |         |
            Methods Protocol  DomainName       api(opt)       endpoints   paramValues     query                        Body       errors      
                                                                          (String)       (String)
                                           
                                                                    
            PROTOCOL         :Protocol of transfer http is unsecured ad https is secured
            DOMAINNAME       :Client hosting service name
            API              :Client server api name
            ENDPOINTS        :Server endpoints and different end point are handled by different modules
            PARAMETER VALUES :Client passes paramValues , server catches those in params
            QUERY            :Client passes params and paramsValues , server catches those in params
            BODY             :Client passes body and server catches body 
                              RAW:
                                |-TEXT:abcdefgh
                                |-JSON:{"key1":"value1"}
                                |-XML  <head> </head>
                                |-HTML <head> </head>
                             URLENCODED:key1:value1&&key2:value2
            METHOD           :GET    --> client requests paramValues; server gets object with paramValues and sends back object 
                              PUT    --> client requests paramvalues and  body ;server gets  object with paramvalues and updates it with body 
                              POST   --> client sends body ;server adds  object with own paramvalues amd body  
                              DELETE  --> client requests paramValues; server deletes  object with paramValues and sends back object 
            ERRORS           https://www.restapitutorial.com/httpstatuscodes.html
                             201 --created   
                             409 --conflict
                             200 -- OK         
                             404 -- Not Found 
                             400 -- Bad Request 
                             

  

 */

//STRUCTURE 
/*
server                            
  |-config (custom made)                              
     |-default.json
     |-development.json
     |-testing.json
     |-production.json
     |-custom-environment-variables.json  
  |-bin
    |-www                            -->run on npm start as package.json has script:{start: nodemon ./bin/www}
  |-node_modules                     -->external modules                            
  |-package.json                     -->external module dependency 
  |-package-lock.json                --> external module dependency 
  |-public                           -->public acessories of server 
    |-images
    |-javascript
    |-stylesheet
  |-views                            -->views of server
    |-error.jade
    |-index.jade
    |-layout.jade
  |-routes(custom made folder)       -->handles CRUD of each route          
    |-post.JS              
  |-models(custom made folder)       -->creates collection for db         
    |-post.JS              
  |-controllers(custom made folder)  -->handles CRUD of db                 
    |-post.JS              
  |-app.js                           -->handles different endpoints and connect mongodb to server  and create database


      |
      |
    bin--> app.js                           --->routes                    <-------models                
            (handles different endpoints)     (handles CRUD of each route)      (creates collection for db)
            and connect mongodb to server                                      contoller
            and create database)                                                (handles CRUD of db) 
                                        
       









*/


//INSTALL(WINDOWS , LINUX)
/*
//INSTALL NODE(WINDOWS)
INSTALL     -- >Install using link -- https://nodejs.org/en/   
SET ENV VAR -- >C:\Program Files\nodejs\                         
                >node -version   
   
//INSTALL NODE(LINUX) 
INSTALL      -->sudo apt update              -->update installation
               >sudo apt install nodejs      -->install nodejs
               >sudo apt install npm         -->install npm
               >node --version               -->gives npde version
               >whereis node                  --> gives node: /usr/bin/node /usr/share/man/man1/node.1.gz
               >curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.37.2/install.sh | bash -->update node
               >nvm install v14.17.0
SET ENV VAR -->No Need


//INSTALL  MONDODB(WINDOWS)    
INSTALL          -->Install mongodb using link  https://www.mongodb.com/try/download/community (Platform:Windows ; Package:MSI)
                   C:\data\db -->Mongo db stores data in data\db but not created at instalation so create it 
SET ENV VAR      -->C:\ProgramFiles\MongoDB\Server\3.6\bin         
                 >mongo --version-->gives mongodb version    
       

//INSTALL MONGODB(LINUX)
INSTALL         --> >sudo apt update                -->update installation
                    >sudo apt install -y mongodb    -->install mongodb
                    >sudo mkdir -p /data/db         -->Mongo db stores data in data\db but not created at instalation so create it 
                    >sudo mkdir -p /data/db          
                    >mongod -version                 -->gives mongodb version
                    >whereis mongo                   --> gives mongo: /usr/bin/mongo /usr/share/man/man1/mongo.1.gz
                    >whereis mongodb                 --> mongodb: /etc/mongodb.conf
SET ENV VAR -->No Need


//INSTALL MONGODB COMPASS(MONGODB GUI) (WINDOWS)
INSTALL   ->Install Compass using link --https://www.mongodb.com/try/download/compass (Platform:Windows ; Package:Zip)                 


//INSTALL MONGODB COMPASS(MONGODB GUI)   (LINUX)
INSTALL   -->Install Compass using link --https://www.mongodb.com/try/download/compass (Platform:Ubuntu ; Package:deb)
            >cd ~/Downloads
            >dpkg -i DownloadedFilename.deb
    

//INSTALL POSTMAN(WINDOWS)
Add "chrome postman" to  chrome extension 

//INSTALL POSTMAN(LINUX)
Add "chrome postman" to  chrome extension 

*/


//CREATE PROJECT AND RUN(WINDOWS(WITHOUT SUDO) , LINUX(WITH SUDO))
/*
//CREATE SERVER
>sudo npm install -g jshint         --> install compiler for node glbally
>sudo npm install -g nodemon        --> install nodemon globally 
>sudo npm install -g express        -->install express globally
>express --view=pug  server         -->create a templat called "server"
>https://www.freecodecamp.org/news/how-to-enable-es6-and-beyond-syntax-with-node-and-express-68d3e11fe1ab/-->Convert Express template to ES6 if requires

>cd server
>sudo npm install                    -->install package.json dependencies which include "express","cookie-parser","morgan","debug","http-errors","jade"
>sudo npm install express --save     -->install express locally(already installed in npm install)
>sudo npm install mongoose --save    -->install mongoose locally


//RUN SERVER  
>cd server
>sudo npm start   -->run server at 127.0.0.1:3000 
                    package.json
                    "scripts": {
                            "start": "node ./bin/www"    -->npm start = node ./bin/www 
                            "start": "nodemon ./bin/www" -->npm start = nodemon ./bin/www   (provides hot reload so rename node to nodemon)
                    },
                    bin/www
                    var port = normalizePort(process.env.PORT || '3000');->port = 3000  -->start at port 3000 (react runs at 3000 so change this port to 8000)

//RUN MONGODB
>sudo systemctl status mongodb.service   OR service mongodb status            -->check mongodb status
>sudo systemctl start  mongod.service    OR service mongodb start  OR mongod  -->start mongodb server at 127.0.0.1:27107
>sudo systemctl stop   mongod.service    OR service mongodb stop              -->stop mongodb server  at 127.0.0.1:27107
>mongo                                                                        --> start mongo shell 

**WINDOWS HAVE ONLY MONGOD AND MONGO COMMAND SYSTEMCTL ARE FOR LINUX
*/


////////////////////////////////REMAINING////////////////////////////

//controllers/posts.js
/*
C,R,U,D -- var
R,D -- try catch ? ; res.json()
 */



//MONGO DB
/* #region Main */



//MONGODB SHELL-https://gist.github.com/bradtraversy/f407d642bdc3b31681bc7e56d95485b6
//CONNECT
/* 
>mongod -->start mongodb server at 127.0.0.1:27107 -->CONNECT TO DATABASE
>mongo  --> enter mongo shell
*/
//CREATE  
/*                                                    ___filename.json--> [{_id:1234,name:'pras'},{_id:1235,name:'patil'}]
                                                     /
>mongoimport --db dbName -collection collName  --filename filename.json --json jsonArray  -->create a database ; create a collection ; add documents from filename.json   documents are stored in array in filename.json
>use dbName                                                                               -->create database "database" or use preexisting "database" (db = databaseName)
>db.createCollection('collectionName')                                                    -->create in database "db" , collection "createCollection"
*/
//READ
/*
>use db
>db.collectionName.methodsUsedInProgramming()
     +
    >show database  --> shows all databases
    >use dbName      -->shows collection in db
    >show collection 
*/
//UPDATE
/*
>use db
>db.collectionName.methodsUsedInProgramming()
*/
//DELETE
/*
>use db
>db.collectionName.methodsUsedInProgramming()
        + 
        >use db                       --> drop database db
        >db.dropDatabase()  
        >db.collectionName.remove({}) -->remove document from collection

*/



//MONGODB UI(COMPASS)
//CONNECT DB TO SERVER
/*        
>mongod -->start mongodb server at 127.0.0.1:27107
In Compass Connect ->ConnectTo ->Connection string = mongodb://127.0.0.1:27107 --> connect compass to mongoDB
*/
//CREATE
/*
Compass UI 
*/
//READ
/*
Compass UI 
*/
//UPDATE
/*
Compass UI
*/
//DELETE 
/*
Compass UI
*/





/* #endregion */



//CONFIG
/*
|-CONFIG                
    |-default.json
    |-development.json
    |-testing.json
    |-production.json
    |-custom-environment-variables.json    

default.json
{ 
    name:"MERNAPP"                      
    mail:{                                
        host:"mail-server"
    }
}

development.json
{ 
    name:"MERNAPP-DEVELOPMENT"           
    mail:{                               
        host:"development-mail-server"
    }
}

testing.json
{
    name:"MERNAPP-TESTING"                
    mail:{                               
        host:"test-mail-server"
    }
}

production.json
{                                         -
    name:"MERNAPP-PRODUCTION"              
    mail:{                                 
        password:"prod-mail-server""
    }
}

custom-environment-variables.json       
{                                       
    mail:{                              
        password:'AppName_password'      
                                       
    }                                          
}                                               
                                              



//CONFIGURATION --  https://www.npmjs.com/package/config; https://www.npmjs.com/package/rc   --Config  is less popular but better than RC 
const config = require('config')  --> npm install config --save

config.get('name')          -->if export NODE_ENV=not yet set  then return  name from default.json 
                               if export NODE_ENV=development then return  name from development.json 
                               if export NODE_ENV=testing     then return  name from testing.json 
                               if export NODE_ENV=production  then return  name from production.json 
config.get('mail.password') -->if export AppName_password='1234' then return password from custom-environment-variables.json 
                               Note:password is not set any value in json file              (so the source code will not have password)
                                    password holds env var which is passed value through cmd(so the user knowing password will pass to source code)
                                      
                                

//DEBUGGING
const debuga = require('debug')('worker:a')      -->npm install debug   
const debugb = require('debug')('worker:b')                            
 
debuga("message")          -->if export DEBUG=worker:a then debuga will log
debugb("message")             if export DEBUG=worker:b then debugb will log
                              if export DEBUG=worker:a,worker:b then debuga,debugb will log
                              if export DEBUG=worker:* then debuga,debugb will log
                              if export DEBUG= then nothing will log




*/


