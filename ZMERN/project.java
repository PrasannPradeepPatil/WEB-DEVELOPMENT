
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


//CREATE  SERVER AND RUN(WINDOWS(WITHOUT SUDO) , LINUX(WITH SUDO))
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
>sudo npm start   -->run server at http://127.0.0.1:3000(client runs at 3000, server runs at 3000 so 1st run server and then run client so client automatically runs at 3001)
                    package.json
                    "scripts": {
                            "start": "node ./bin/www"    -->npm start = node ./bin/www 
                            "start": "nodemon ./bin/www" -->npm start = nodemon ./bin/www   (provides hot reload so rename node to nodemon)
                    },
                    bin/www
                    runs app.js file with all error checks

//RUN MONGODB
>sudo systemctl status mongodb.service   OR service mongodb status            -->check mongodb status
>sudo systemctl start  mongod.service    OR service mongodb start  OR mongod  -->start mongodb server at 127.0.0.1:27107
>sudo systemctl stop   mongod.service    OR service mongodb stop              -->stop mongodb server  at 127.0.0.1:27107
>mongo                                                                        --> start mongo shell 

**WINDOWS HAVE ONLY MONGOD AND MONGO COMMAND SYSTEMCTL ARE FOR LINUX
*/
//CREATE CLIENT AND RUN(WINDOWS(WITHOUT SUDO) , LINUX(WITH SUDO))
/*
//CREATE CLIENT
>sudo npm -g uninstall create-react-app    -->uninstall global package  "create-react-app" as global package no longer supported  
>sudo npx create-react-app client          -->installs package "create-react-app version latest" and create a templat called "client"(Node >= 10.16 and npm >= 5.6 )
>sudo chmod -R 777 client                  -->allows all privelages to client folder(linux)
>cd client
>sudo npm install                     -->install package.json dependencies  locally
>sudo npm install axios               -->install react dependancies locally
>sudo npm install moment 
>sudo npm install react-file-base64 
>sudo npm install redux-thunk
>sudo npm install react-redux
>sudo npm install @material-ui/core
>sudo npm install @material-ui/icons


//RUN CLIENT
>cd client
>sudo npm start   -->run client at http://127.0.0.1:3000 (client runs at 3000, server runs at 3000 so 1st run server and then run client so client automatically runs at 3001) 
                    package.json
                      "scripts": {                               
                        "start": "react-scripts start",  -->npm start = "react-scripts start" 
                        "build": "react-scripts build",
                        "test": "react-scripts test",
                        "eject": "react-scripts eject"
                      },



*/




//STRUCTURE 
/*
client 
  |-node_modules            -->external modules                 
  |-package.json            -->external module dependency     
  |-package-lock.json       -->external module dependency  
  |-public                  -->public acessories of client 
    |-filename.png/.ico     -->images and icons of project
    |-manifest.json         -->tells browser about app and how it should be installed on mobile or desktop   
    |-index.html            
  |-src      
    |-api(custom made folder)        -->pass data between backend and frontend
      |-posts.js
    |-actions(custom made folder)    -->await api to perform  
      |-posts.js
    |-reducers(custom made folder)   -->get CRUD operation from actions and as per action type reduce them
      |-posts.js                        index.js combines all reducers and puts them in redux store 
      |-index.js                               
    |-component(custom made folder)       
       |-FORM                        -->FORM component has form.js file and styles.js file for its styles
          |-form.js,styles.js
       |-POSTS                       -->POSTS component has posts.js file and styles.js file for its styles
         |-POST                         POST component(child of POSTS) has post.js file and styles.js file for its styles ;
           |-post.js,styles.js
         |-posts.js,styles.js                
    |-app.js, styles.js,app.css      -->MAIN Component is app.js , styles.js for its styles , app.css for its css                   
    |-index.js,index.css           

server                            
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
 |-bin                             -->run on npm start as package.json has this file on start script ; and this file runs app.js with error checks
    |-www                             
  |-routes(custom made folder)     -->performs CRUD of each route        
    |-post.js              
  |-models(custom made folder)     -->creates collection for db       
    |-post.JS              
  |-controllers(custom made folder) -->performs CRUD of db               
    |-post.JS              
  |-app.js                          -->performs handling of each route; connect mongodb to server and create database           
     

  
  
  app.js,styles.js,app.css(MAIN COMPONENT )    -->actions               -------> api            ------>  app.js  ----------------->routes                       ----> controller;model                                      
      |                                            (calls fnName(arg) from api  (sends arg on route)      (sends route              (calls methods from controller)  (performs CRUD
 _____|______________________________              and awaits for respons)                                on routes)                on route)                          on db )
 |                                   |                                                                                                                                 |
 posts.js,styles.js(POSTS COMP)     form.js,styles.js(FORM COMPONENT)                                                                                                  |
  |                                                                                                                                                                    |
 post.js,styles.js(POST COMPONENT)                                                                                                                                     |
 (dispatch fnName(arg) into  redux store which will trigger                                                                                                            |
  actions)                                                                                                                                                             |
                                                                                                                                                                       |
  app.js,"" same as above <--------------------------------------------------reducers<------------------------------actions<---------------------- api<---------------controller;model
  (receive data from redux store                                          (receive res from action               (receive res from api         (receives response)    (return response)
   and update the state_                                                   and reduce based on actionType         and dispatch response 
                                                                          combine all reducers and put           with actionType on redux store) 
                                                                          on redux store             
     
//CREATE POST(press submit button)
components/Form/form.js calls handleaSubmit method which  dispatches cretePost() method in redux store ; 
this triggers actions/posts.js ka createPost(Post) method which awaits api/index.js ka createPost() method to return something
api/index.js send newPost on the url                  


////////////////////////////////REMAINING////////////////////////////



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


