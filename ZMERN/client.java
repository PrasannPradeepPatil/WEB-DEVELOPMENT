
//INSTALL(WINDOWS , LINUX)
/*
Add  "react developer tools" to chrome extension 
In developer Tools you will see 1 more tab called "compoents"  where you can see the component tree
*/

//CREATE PROJECT AND RUN(WINDOWS(WITHOUT SUDO) , LINUX(WITH SUDO))
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
REACTAPP 
  |-node_modules            -->external modules                 
  |-package.json            -->external module dependency     
  |-package-lock.json       -->external module dependency  
  |-public                  -->public acessories of client 
    |-filename.png/.ico     -->images and icons of project
    |-manifest.json         -->tells browser about app and how it should be installed on mobile or desktop   
    |-index.html            
  |-src      
    |-api(custom made folder)        -->get  CRUD operation from backend on the  URL where backend db is connected
      |-posts.js
    |-actions(custom made folder)    -->get CRUD operation from api and as per action type put them in payload
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
         |
         |
    api -->actions-->reducers-------------------------------\
                                                             \
    MAIN COMPONENT (app.js,styles.js,app.css)                -->index.js, index.css ,public/index.html                                                    
      |                                                        Provide Main Component(app.js) with redux store Render app.js 
 _____|______________________________                          Provide Main Component(app.js) ka REACT ELEMENT(Virtual DOM) inside public/index.html ka root element(Actual DOM)  
 |                                   |                          
POSTS COMP(popsts.js,styles.js)     FORM COMPONENT(form.js,styles.js)
 |
 POST COMPONENT(post.js,styles.js) 


       


   

*/ 






