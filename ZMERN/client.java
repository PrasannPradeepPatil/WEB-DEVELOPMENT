
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
    |-component(custom made folder)       
       |-component1.jsx            
       |-component2.jsx 
    |--           
    |-app.js                       
    |-app.css
    |-index.js
    |index.css
       |
       | 
    app.js,app.css(Main Component) -->index.js, index.css ,public/index.html                                                    
      |                               Render App Component ka REACT ELEMENT(Virtual DOM)
 _____|________________               inside public/index.html ka root element(Actual DOM)  
 |                    |             
Component1.jsx     Component3.jsx(Children Component) 
 |
Component2.jsx

   

*/ 



///////////////////REMAINING///////////////

//USEEFFECT();

//Backend -- api --- action -- reducers -- useDispatch()


//INDEX.JS
//RENDER()
/* #region Main */
/*
ReactDOM.render(                  -->Render App Component ka REACT ELEMENT(Virtual DOM)
  <React.StrictMode>                   inside public/index.html ka root element(Actual DOM)
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);


 */
/* #endregion */










