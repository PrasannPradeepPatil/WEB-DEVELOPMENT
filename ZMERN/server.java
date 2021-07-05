
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
            ERRORS           :200 -- SucessFul
                             :400 -- Bad Request 
                             :404 -- Object Not Found Error

  

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
    |-www                            -->run on npm start 
  |-node_modules                     -->external modules                            
  |-package.json                     -->external module dependency 
  |-package-lock.json                --> external module dependency 
  routes(custom made files)  
    |-index.js                 
    |-user.JS                       
  |-app.js
  |-views
    |-error.jade
    |-index.jade
    |-layout.jade
  |-public
    |-images
    |-javascript
    |-stylesheet
      |
      |
      app.js                     --->routes
      (Entry point of routes)      index.js
                                   post.js
                                   (Handling of each route)
       









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
>Create config ,middleware folder   -->create folders 
>cd server
>sudo npm install                    -->install package.json dependencies which include "cookie-parser","debug","express","http-errors","morgan","pug"
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










//MONGO DB
/* #region Main */



//MONGODB
/*
Database
 |-Collections   -- Hold the collection of documents     (Collection in NoSQL is Similar to table in SQL)
    |-Doucuemnt1  -- Documents are objects {key:value} (Doucuemnt in NoSQL is Similar to row in SQL) 
*/

//PROGRAM
//CONNECT DB TO SERVER  
/*
async function connectToDb(){
    //CONNECT TO DB 
    const mongoose = require('mongoose');                                      -->npm install express --save 


    mongoose.connect('mongodb://serverURL/dbName')                             -->connection mongodb  to serverurl(localhost=  127.0.0.1:27107) and create a database(dbName)  
            .then(() =>{console.log("Connected to MongoDB")})                     AND start  the code after the asyncFn ; complete the connection and return a promise       
            .catch((err) => {console.log("Failed to connect due to err" + err)});     if promise sucessful execute then 
                                                                                      if promise failed execute catch
    try{                                                                         AND start  the code after the asyncFn ; complete the connection and return a promise       
        await mongoose.connect('mongodb://serverURL/dbName')                         if promise sucessful execute try 
    }                                                                                  if promise failed execute catch
    catch{

    }

}
*/
//CREATE 
/*
async function createCourse(){
    //CREATE DB
    Already creaded in connection                                        -->create database "playground"


    //CREATE   MODEL,COLLECTION
    const courseSchema = new mongoose.Schema({                           -->create Model(Collection = "courses" ;  DocumentSchema ="courseSchema" )  
        _id       :ObjectId  --every document in collection  is given      
        id        :number,     a unique id  by mongodb                     
        isEmployed:Boolean    (no need to write this )
        name      :String,
        tags      :[ String ],
        type      :{courseName:String, courseId:number}
        date      : Date
       })
       const Course = mongoose.model('course',courseSchema )    
                                    (We must write singluar name of collection
                                    ie courses ke liye course )
    //CREATE DOCUMENT 
    const course = new Course({                                       -->In model Course(collection="Courses",DocumentSchema="courseSchema") 
        _id       :ObjectID("60ae40")  --every document in collection    create document  "course"
        id        :1,                    is given a unique id            
        isEmployed:true                  (done automatically)
        name      :"pras",
        tags      :[ "pras" ],
        type      :{courseName:"node", courseId:1}

    })




    //SAVE DOCUMENT TO DB 
    const coursesaved =  await course.save()                        -->In model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                                       Save document "course"  
                                                                       and return saved document "coursesaved"  
                                                                       AND pronmise same as above
  
}

*/
//READ
/* 
async function getCourses(){
    //READ DOCUMENT 
    const courses = await Course.find({filterObject}   -->From model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                         find array of document  filtered by methods and filterObject  
                                                         and return array of documents "courses"
                                                         AND same as above
                                
    const courses = await Course.findById(__id}       -->From model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                         find array of document  filtered by _id
                                                         and return array of documents "courses"
                                                         AND same as above

                        CHAINING METHODS 
                        .find()                   -->filter no documents 
                        .find({id:1,name:'pras'}) -->filter document that have id as 1 and name as 'pras'
                        .sort({name:1/-1})        -->sort documents by asc/dec order
                        .select({name:1,id:1})    -->select only the name and  id property of each document 
                        .count()                 -->return count of document
                        .skip(10)                -->skip 1st 10 documents
                        .limit(10)               -->limit 10 documents

                        FILTER OBJECT AND FILTER OPERATORS
                        //COMPARISION OPERATOR    
                        .method(key:{$operator : value })
                        eq  : equal to
                        ne  : not equal to
                        gt  : gteater that
                        gte : greater than equal to
                        lt  :less than
                        lte :less than equal ti
                        in  :in
                        ni  : not in 

                        EG
                        .find({'price':10})-->filter document that have price as 10 
                        .find({'price':{gt:10,lte:20}})--->filter document that have  10<price 10<= 20
                        .find({'price':{in:[10,15,20]}})--->filter document that have  price=10 price =15 price=20 
                        
                        //LOGICAL OPERATOR:
                        .method().operator(obj1,obj2)
                        or -- or
                        and -- and
                        EG
                        .find()
                        .or({name:prass},{id:1})  -->filter document that have name 'pras' OR id 1
                        .find()
                        .and({name:prass},{id:1})  -->filter document that have name 'pras' AND id 1

                        //REGULAR EXPRESSION
                        .method(key:{/RE/i})
                        RE : look in JAVA APPLICATIOP ;i:case insensitive
                        ^ : startswith
                        $ : endswith
                        .  :anycharachet
                        * :0 or more characters
                        EG
                        .find(name: '^pras')  -->filter document that have name starting with 'pras' 
                        .find(name:'pras$')   -->filter document that have name ending with 'pras' 
                        .find(name:'.*pras.*')-->filter document that have name containing  'pras' 
}
*/
//UPDATE
/*
async function updateCourses(id){
    //UPDATE DOCUMENT:READ FIRST APPROACH
    const course = await Course.findById(__id)                --From model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                                find  a document  filtered by   _id   
                                                                and return documents "course" 
                                                                AND same as above
                                                   
    if(!course){return;}

    course.name='patil'                                        -->update documents  "course"
    course.id=22
    OR
    course.set({
        name:'patil',
        id:22
    })


    const courseSaved =  await courses.save()                 -->In model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                                  save  document "courses"
                                                                  and return saved array of documents "courseSaved"


    //UPDATE DOCUMENT :UPDATE FiRST APPROCH
    counst result = await Course.update(                        -->From  model Course(collection="Courses",DocumentSchema="courseSchema") 
                           {filterObject},                        get  array of document  filtered by  filterObject and 
                           $updatePperator :{updatedObject})      update array of document  based on updateOperator  and updateObject 
                                                                  and return result object "result" {n:no of documents updated,ok:1}
                                                                  AND same as previous

    counst courses = await Course.insertMany(                  -->In  model Course(collection="Courses",DocumentSchema="courseSchema") 
                           {insertObj1},                         insert the documents
                           {insertObj2}                          and return array of  documents "courses" after insertion  
                           )                                      AND '' same as previous

    counst courses = await Course.findByIdAndUpdate(            -->From  model Course(collection="Courses",DocumentSchema="courseSchema") 
                        __id,                                  get   a  document filtered by  __id  and 
                        $updatePperator :{updatedObject})      update the document  based on updateOperator  and updateObject 
                        {new:True}                            and return array of documents "courses" after updation [original document(if new is not set)/updated document(if new is set)]
                                                                AND '' same as previou
                        )

                            FILTER OBJECT AND FILTER OPERATORS
                            Same as READ

                            UPDATE OBJECT AND UPDATE OPERATOR--https://docs.mongodb.com/manual/reference/operator/update/
                            //FEILDS
                            $set: { field1: value1, field2:value2} -- replaces the value of a field with the specified value.
                            $inc: { field1: amount1,field2:amount2}--increments a field by a specified value  
                            $other: --look in link

                            //ARRAYS
                            Look in Link

                            //MODIFIER
                            Look In Link

                            //BITWISE
                            Look In Link

                            EG
                            Course.update(
                                {_id:'aboefcc'}
                                $set:{
                                    name:'pras'
                                    id:22
                                })
                            Course.update(
                                {name:'pras',id:22}
                                $inc:{
                                    id:33
                                    id:-22
                                })
                        
}
*/
//DELETE
/*
    
async funtion deleteCourses(){
    //DELETE DOCUMENT
    const result = await Course.deleteOne({filterObject})    -->From  model Course(collection="Courses",DocumentSchema="courseSchema") 
                                                                find array of  document "course" filtered by filterObject
                                                                and delete 1st occurence document "course"
                                                                and return result object {n:no of documents deleted(1 always),ok:1} 
                                                                AND same as above
    OR                                                     
    const result = await Course.deleteMany({filterObject})    -->From  model Course(collection="Courses",DocumentSchema="courseSchema")  
                                                                find array of  document  filtered by filterObject
                                                                and delete all occurence document 
                                                                and return result object {n:no of documents deleted,ok:1} 
                                                                AND same as above
                                    
    OR                                                     
    const course = await Course.findByIdAndDelete(_id)       -->From  model Course(collection="Courses",DocumentSchema="courseSchema")  
                                                                find array of  document "course" filtered by _id
                                                                and delete all occurence document "course"
                                                                and return array of documents "course" after deletion 
                                                                AND same as above                                   
                                    
                                FILTER OBJECT AND FILTER OPERATORS
                                Same as READ


}                                                  

*/
   


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


