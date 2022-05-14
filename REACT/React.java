//INSTALL NODE AND REACT
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
*/

//CREATE AND RUN REACT
/*
//CREATE REACT
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
>sudo npm install dotenv                -->install env var dependency locally 


//RUN REACT
>cd client
>sudo npx kill-port 3001 -->kill the port if already in use for client
>sudo npm start   -->run client at http://127.0.0.1:3000
                    package.json
                      "scripts": {                               
                        "start": "react-scripts start",  -->npm start = "react-scripts start" 
                        "build": "react-scripts build",
                        "test": "react-scripts test",
                        "eject": "react-scripts eject"
                      },


*/


//STRUCTURE-I(client-I)
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
    |-api(custom made folder)        
      |-posts.js
    |-actions(custom made folder)    
      |-posts.js
    |-reducers(custom made folder)   
      |-posts.js                         
      |-index.js                               
    |-component(custom made folder)       
       |-FORM                        
          |-form.js,styles.js
       |-POSTS                      
         |-POST                         
           |-post.js,styles.js
         |-posts.js,styles.js                
    |-app.js, styles.js,app.css                        
    |-index.js,index.css         
    |- .env                        -->environment variable file
    |- .git                        --> github file
    |- .gitignore                  --> github file

                                                                                                          
  App.js,styles.js,App.css(MAIN COMPONENT )    -------------------------------->actions --------------------->api---------------------->  
      |                                                                         (API FN CALL:                 (API FN SEND:                         
 _____|______________________________                                            calls api fns                send data on route                                               
 |                                   |                                           and awaits for response)     for CRUD operations)                                                                                                          
 Posts.js,styles.js(POSTS COMP)     Form.js,styles.js(FORM COMPONENT)                                                                                               
  |                                                                                                                                                                                                                   
 Post.js,styles.js(POST COMPONENT)                                                                                                                                                                                    
 (COMPONENTS)                                                                                                                                                                                                         
                                                                                                                                                                                                                      
  App.js,"" same as above <------------------ -reducers<------------------------actions<----------------------api<------------------------         
  (COMPONENTS)                                 (REDUCERS:                       (API FN RESPONSE:                (API FN RECEIVE:           
    |                                           based on action type            receive response from api and    receive data on route      
    |                                           reduce action(action            dispatch res on payload with     for CRUD operation)       
    |                                           payload) and put it on list     action type on redux store)
    |                                           COMBINERS:
    |                                           combine all the reducers and
    |                                           put the on redux store)
    |
  index.js,index.css,public/index.html(RENDER,REDUX STORE)
  RENDER:
  converts REACT ELEMENT(VIRTUAL DOM) returned by app.js
  into HTML ELEMENT(ACTUAL DOM) of public/index.html     
  REDUX STORE:
  provide app.js with redux store                                        


  package.json
   "scripts": {                               
    "start": "react-scripts start",  -->npm start = "react-scripts start" 
    "build": "react-scripts build",
    "test": "react-scripts test",
    "eject": "react-scripts eject"
  },

  
*/
                                                                                                               
//STRUCTIRE-II(client-II)
/*


*/

