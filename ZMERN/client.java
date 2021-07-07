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

     |
    LIFECYCLE PHASE
    MOUNT PHASE :When component is initialised and put in actuat DOM it enters "mount phase" it calls methods called as "lifecycle hooks" in order
    1.constructor()       --initialise properties of component  
    2.render()            --Converts Components and all its childrens "JSX EXPRESSION" into "React ELEMENT(Virtelement DOM)"  using React.createElement('div/h1 etc') 
    3.componentDidMount() --Called after rendering  component to DOM
     
    UPDATE PHASE :When component is updated due to state or props change it enters "update  phase" it calls  methods called as "lifecycle hooks"in order
    1.render()            --Converts Components and all its childrens "JSX EXPRESSION" into "React ELEMENT(Virtelement DOM)"  using React.createElement('div/h1 etc') 
    2.componentDidUpdate()--Called after rendering  updated component to DOM
  

    UNMOUNT  PHASE :When component is deleted from ctuat DOM it enters "unmount phase" it calls methods called as  "lifecycle hooks" in order
    componentWiiUnMount() --Called before deleting component from DOM
*/ 



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
>Create /src/components folder             -->create folders
>cd client
>sudo npm install                    -->install package.json dependencies  locally
>sudo npm install bootstrap  --save   -->install bootstrap locally


//RUN CLIENT
>cd client
>sudo npm start   -->run client at 127.0.0.1:3000 
                    package.json
                      "scripts": {                               
                        "start": "react-scripts start",  -->npm start = "react-scripts start"
                        "build": "react-scripts build",
                        "test": "react-scripts test",
                        "eject": "react-scripts eject"
                      },



*/

















