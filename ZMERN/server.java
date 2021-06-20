/*
REMAINING/
Mosh Hemadani -- ADVANCE EXPRESS TOPICS --TEMPLATES (VIEWS)




//** JS VS TS
TYPESCRIPT : ts  shows err at runtime ; but you need extra work to run ts
JAVASCRIPT : js does not show err at run time but you can see those byjshint filename.js
EXTRA FILE FOR TS 
|-tcsconfig.json -->run tcs –init and in the created tcsconfig.json overwrite the existing code with the code in audio-transcoder(typescript)
|-typings.t.ds --> create a file with name typings.t.ds 
Run code --> run tcs which will create a equivalent .js file in dist/src ; then run node dist/src/filename.js

DIFFERENT CODE OF TS 
1.import
const readXlsxFile = require('read-excel-file/node');
                  TO
 import * as readXlsxFile from 'read-excel-file/node'; and also create a file  typings.d.ts and add declare module 'read-excel-file/node';

2.statically typed lang : so you have to write datatype or write “any” if datatype is not known 


*/ 

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
server                              --> INSTALL,CREATE PROJECT AND RUN(LINUX , WINDOWS)
  |-config                                   
     |-default.json
     |-development.json
     |-testing.json
     |-production.json
     |-custom-environment-variables.json  
  |-bin
    |-www
  |-node_modules                            
  |-package.json
  |-package-lock.json
  routes  
    |-courses.js                 
    |-food.JS  
  middleware
    |-logger.js                       
  |-app.js
  |-views
    |-error.pug
    |-index.pg
    |-layout.pug
  |-public
    |-images
    |-javascript
    |-stylesheet









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

















//ENV VAR
/*
//SETTING ENV VAR
export/set envVarName=3000  //linux/windows


//GETTING ENV VAR 
process.env.NODE_ENV  -->returns value set for envVarName ; if not set return undefined
OR
const express = require('express')-->npm install express --save   
const app = express()  
app.get('env')        -->returns value set for envVarName ; if not set return undefined
*/



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


//PORT
http://127.0.0.1:3000/endpoints     -->if export PORT=3000 then this application will be active on port 3000

*/


//NODE MODULES , PACKAGE.JSON , PACKAGE-LOCK.JSON
/*
package.json                 -->PACKAGE.JSON KEEPS TRACK OF ALL PACKAGE DEPENDENCY
{
  "name": "package",         -->DEPENDENCY PROPERTIES
  "version": "1.0.0",           when you create package.json  using npm init
  "description": "",            you are asked these options 
  "main": "index.js",
  "scripts": {
  "test": "echo \"Error: no test specified\" && exit 1"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {           -->DEPENDENCIES(DEPLOYED)
    "express": "^4.17.1",      “packageName: ^/~ majorVersion.minorVersion.patchVersion”
    "joi": "^17.4.0"
  }
  "dev-dependencies": {       -->DEVELOPMENT DEPENDENCIES(NOT DEPLOYED )
    "express": "^4.17.1",       “packageName: ^/~ majorVersion.minorVersion.patchVersion”
  }                              patchversion = bug fix ;
}                                minorVersion = changes without disturbing API;
                                 majorVersion = change API itself 
                                 ^ --> supose you have a “module: ^4.1.13” and someone   forks your   repo and performs      
                                      npm –i modulename which my have diff version later in time   ; then
                                      ^ tells install modue as long as its major version = 4  so ^4.1.8 can be written as ^4.x
                                 ~ --> tells install module as long as major version = 4 ; minor version = 1 so ~4.1.8 can be        
                                        written as ~4.1.x
                                 no % or ~ --> install the exact version so this is the best 

//INITIALISE JSON FILE
>npm init                           -->create a package.json which will keep all meta data for packahges

//INSTALL PACKAGES
>npm install package@version --save     -->create node_modules and inside it installs package 
                                        adds the package dependency in package.json ka dependencies{}     
>npm install package@version dev--save -->create node_modules and inside it installs package 
                                        adds the package dependency in package.json ka dev dependencies{}    
                                        telling that this is a devloper package and must not be deployed                                                           


//UNINSTALL PACKAGES                                        
>npm uninstall packagename           -->In node_modules remove package
                                        remove package from package.json ka dependencies{}    

//UPDATE PACKAGE
>npm outdated                       --> show the package with outdated versions ; with current wanted and latest version
>npm  update                        --> update the package to latest ver only if the majorversion is same ; else to wanted ver
                                        and updates package.json
>npm-check-updates                  -->install check updates package
                                       and updates package.json
>npm-check-updates and  ncu –u      --> update the outdated package to latest version in package.json
                                       and updates package.json
>npm install                        --> update the outdated package to latest version 
                                        and updates package.json
                                         
                                                              
//VIEW PACKAGES             
> npm list                          --> view  all the  packages  and their sub dependencies;
                                        or view package.json
> npm list  - -depth=0              --> view all the  packages 
                                        or view package.json
>npm view packagename               --> view all the metadata of a packages
                                        or view package.json  
>npm view packagename dependencies  --> you can view all the dependencies of package 
                                        or view package.json
>npm view packagename  version      --> you can view current   version of package
                                        or view package.json
>npm view modulename versions       --> you can view current version of package
                                        or view package.json
>npm outdated                      --> show the package with outdated versions ; with current wanted and latest version
                                        or view package.json

//-G FLAG(COMANDS WITH -G FLAG ARE TO BE WRITTEN WITH SUDO IN LINUX)
-g flag -->Without -g the package will be installed in node_moduules in current directory
          With -g flag the package will be installed globally where node is installed and all directories in all projects can acess it 
           Eg npm install – g packagename@version -- install package globally so available for all packages
              npm uninstall –g packagename          --uninstall global package
              npm list –g ; npm list –g –depth=0 ; npm view –g packagename and so on 

*/


//ROUTES,MIDDLEWARE ,INDEX.JS-- https://expressjs.com/ -->Go to Resources to get Middleware etc 
//                                                       
/* #region Main */

//MIDDLEWARE
/*
ROUTES  
  |-courses.js                 
  |-food.JS                          
MIDDLEWARE
  |-logger.js                       
index.js
*/

//ALL MIDDLEWARE(index.js)
/*
index.js
const express  = require('express')-->npm install express --save 
const app = express()
const logger   = require(./MIDDLEWARE/logger)
const courses  = require(./ROUTES/course) 


app.use(express.json())                        -->/allRoutes handled by "inbuilt middleware " json()   
app.use(logger)                                -->/allRoutes handled by "custom middleware"  log()       
app.use('/course' , courses)                   -->/courses   handled by "route middleware" in courses 
                                                 (/ = /courses  in course.js)

*/


//INBUILT MIDDLEWARE(index.js)
/*
app.use(express.json())                                     -->takes req from all url      ;parses req body(raw body) into json and sets req.body to json ; sends res to next middleware fn called router() 
app.use(express.urlencoded({extended:truw}))                -->takesreq from all url       ;parses req body(encoded) into json and sets req.body to json ; sends res to next middleware fn called router() 
app.use(express.static("foldername"))                       -->takes req from url with endpoint  foldername ka static file(not foldername); sends the static content of foldername to url
                                                              (static file folder me hoga tobhi endpint static file hoga EG consider public/readme.md then url is http:127.0.0.1/readme.txt(not /public/readme.txt))
*/   

//CUSTOM MIDDLEWARE(MIDDLEWARE/logger.js  )
/*
function log1(req,res){next();}                        -->takes req from all url;performs operation; sends res to all url
function log2(req,res,next){next();}                   -->takes req from all url;performs operation; sends res to next middleware fn written just below log2

module.exports = log;  
*/

//ROUTE MIDDLEWARE(ROUTES/courses.js)
/*
const express = require('express')
const roter = express.Router()


app.get('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url ; performs get operation; sends resonse  to url 
app.put('/endPoint/:param1/:param2',(req,res)=>{})    -->takes req from url; performs put operation; sends resonse to url 
app.post('/endPoint/:param1/:param2',(req,res)=>{})   -->takes req from url with endponts; performs post operation; sends resonse to url 
app.delete('/endPoint/:param1/:param2',(req,res)=>{}) -->takes req from url with endponts ; performs delete operation; sends resonse to url 
                                                        req.param = {param1:paramvalue1 , param2:paramValue1}-->receive paramValues from by client , param is deined here in url
                                                        req.query = {{param1:paramvalue1 , param2:paramValue1}-->receive param and paramValues fromclient 
                                                        req.body =  {body sent by client}                     -->receive body  from client
                                                                                                                Add app.use(express.json()) at top)
                                                                                                                        
                                                        res.status(errorCode).send("Message")                 --> send status error code to client
                                                        res.send(object)                                      --> send object to client

                                                        next()                                               --> send response to next middleware 


//GET
http:127.0.0.3000/course/1 

courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
app.get('/courses/:id', (req, res) =>{        
    //LOOKUP FOR COURSE WITH ID
    //IF NOT EXIST RETURN 404
    const course = courses.find((course) => {course.id === parseInt(req.params.id)})
    if(!course)                                     //ERROR HANDLING(USE JOI INSTEAD) 
        res.status(404).send('object not found')   
        return 
    }         

    //RETURN COURSE WITH ID
    res.send(course)
  })
app.listen(3000,()=>{console.log("Listenong on port 3000")})


//PUT
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
app.put('/courses/:id' (req,res) => {    
      //LOOKUP FOR COURSE WITH ID
     //IF NOT EXIST RETURN 404
     const course = courses.find((course) => {course.id === parseInt(req.params.id)})
     if(!course) {                                    //ERROR HANDLING(USE JOI INSTEAD) 
        res.status(404).send('object not found')   
        return;
     }   

    //VALIDATE BODY
    //IF INVALID RETURN 400
    if(!req.body.name || req.body.name.length < 3){  ////ERROR HANDLING(USE JOI INSTEAD)
       res.status(400).send('Bad request')
    return 
    }



    //UPDATE COURSE WITH ID BY BODY 
    //RETURN  COURSE
    course.name = req.body.name
    res.send(course)                  
})

//POST
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
app.get('/courses' (req,res) => {    
    if(!req.name ){                          //ERROR HANDLING(USE JOI INSTEAD)                       
        res.status(400).send('Bad request')
        return 
    }

     //ADD COURSE WITH ID AND  BODY 
    //RETURN  COURSE
    const course = {
        id:course.length + 1,
        name:req.body.name                     //add the line app.use(express.json())
    }

    courses.push(course)
    res.send(course) //updated object must be sent back in body of response

                                      
})


//DELETE
courses = [{id:1,name:'pras'},{id:2,name:'patil'}]
app.put('/courses/:id' (req,res) => {    
     //LOOKUP FOR COURSE  with id 
     //IF NOT EXIST RETURN 404
     const course = courses.find((course) => {course.id === parseInt(req.params.id)})
     if(!course) {                                    //ERROR HANDLING(USE JOI INSTEAD) --inspect --> networks -->select all --> refresh with cntrl + R 
        res.status(404).send('object not found')   
        return;
     }   




    //DELETE COURSE WITH IF 
    //RETURN  COURSE
    const index = courses.indexOf(course);
    courses.splice(index,1)
    res.send(course)

                                      
})


//ERROR HANDLING WITH JOI
if(!req.body.name || req.body.name.length < 3){
       res.status(400).send('Bad request')
    return 
}

const Joi = require('JOI') -- returns class Joi  npm install joi --save
const schema = {
    name: Joi.String().                      -- joi provides a "FLUENT API"
}
const res = Joi.validate(res.body,schema)         -- returns {error:some error , value:some value}  if value is correct error will be null and vice versa
if(res.error){
    res.status(400).send(res.error.details[0].message)
    return ;
}


*/

 

/* #endregion */




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





//OTHER MODULES
/* #region Main */

//PATH--https://nodejs.org/docs/latest-v8.x/api/path.html
/*
const  path = require(‘path’); -->returns  path object

path.parse(“filepath to  .js file”) --> returns object containing important feature of path
*/

//OS -- https://nodejs.org/docs/latest-v8.x/api/os.html
/*
const os = require(‘os’);    -->returns  os object

os.totoalmem(); -->returns string  of total memory in OS
os.fremem();    -->returns string of available mem in OS
*/

//FILE SYSTEM-- https://nodejs.org/docs/latest-v8.x/api/fs.html
/*
const fs  = require(‘fs’);  --> returns fs object

fs.writefilesync(“filepath”, data)           --> synchronously write data to filepath
s.writefile(‘filepath’,data, (params) =>{})  --> asynchronously write data to filepath 
fs.copyfilesync(“filepath1” , “filepath2”)   -->synchronously copy data from filepath2 to filepath1
fs.copyfile(“filepath1” , “filepath2”,(params)=>{} ) -->asynchronously copy data from filepath2 to filepath1
*/

//EVENT -- https://nodejs.org/docs/latest-v8.x/api/events.html
/*
const EventEmitter =  require(“emitter”);   --> retruns EventEmitter class
const emitter = new EventEmmiter();        -->  returns EventEmmiter object

emmiter.emit(“eventname” , {id:1,name:pras}})         -->emit  event  
                                                           
                                                              
emitter.on(“eventname” , (eventArgs) => {            -->listens  event 
             cconsole.log(eventArg.id) })               
                                                        //EMIT , LISTEN SAME FILE-->EMIT AFTER  REGISTERING  LISTENER
                                                        (Emit after  registering listen 
                                                        because emit calls all listeners sybnchronously
                                                        so you must have listeners available before raise)
                                                        EG
                                                        filr.js
                                                        emitter.on(“eventname” , (eventArgs) => {           -->listens  events         
                                                                    console.log(eventArg.id) })   

                                                        emmiter.emit(“eventname” , {id:1,name:pras}})         -->emits event 
                                                        
                                                        
                                                        
                                                        //EMIT ANS LISTEN IN DIFFERENT FILE--> EMIT LISTEN ON DAME OBJECT
                                                        (Emit,Listen must be on same object 
                                                        So emit on a class , listen on object of that class)
                                                        EG
                                                        file1.js                                    file2.js           
                                                        const EventEmitter =  require(“emitter”);   const EventEmitter =  require(“emitter”); 
                                                        const emitter = new EventEmmiter();         const emitter = new EventEmmiter();  
                                                                                                    const foo = require(./file1)  
                                                        function foo(){
                                                            emitter.emit("event1")}                emitter.on("event1") () => {} } -->RAISING ,LISTENENG ON DIFFERENT emmiter object

                                                        module.exports = log


                                                        file1.js                                    file2.js    
                                                        const EventEmitter = require('events');     const Emmiter  = require(./file1)
                                                        class Emitter  extends EventEmitter {       const emmiter = new Emmiter()
                                                            foo() {
                                                                this.emit('event1');}               emmiter.on("event1",()=>{})-->RAISING ,LISTENENG ON SAME emmiter object
                                                        }

                                                        module.exports = Emitter

                                                        


                                                        
*/

//HTTP -- https://nodejs.org/docs/latest-v8.x/api/http.html  -- INSTEAD YOU CAN USE EXPRESS
/*
const http  = require('http');

const server = http.createServer((req,res)=>{    -->emit an http request at server side

    if(req.url === "/"){                    
        res.write("Hello World");
        res.end();
    }

    if(req.url === "/myPersonalApi"){           
        res.write("Hello world2");
        res.end();
    }
});

server.listen(3000);                               -->listen to http request at client side at port 3000
                                                     at http://127.0.0.1:3000 you will get hwllo worls and at 
                                                     at http://127.0.0.1:3000 /myPersonalApi ypu will get Hello World2
*/


/* #endregion */

