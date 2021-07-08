
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



///////////////////REMAINING///////////////

//CLASS  COMPONENT : Class based component 
/* #region Main */
//class Counter extends Component { 
    //STATE OBJECT :holds data of component 
    /*
    state = {count:0,ticks:0}                 -->create state with key:value    
    this.state.count                          -->use state                     
    this.setState({count:this.state.count+1}) -->update state   
    this.state.count = this.state.count+1 X                                          
    */
                                   
    //PROP OBJECT :holds data from other component
    /*
    <childComponentName count={this.state.count}> -->pass prop in parent component                                             
    this.props.count                              -->use prop in child component                                             
    this.props.count = this.props.value+1 X       -->update props in child component cant as props are passed from other component hence cannot be updated      
                                                    (NOTE:key="uniqueProperty" is not considered a value and not passed from parent as it is used to uniquely identify values in dynamic for  
                                                    Eg:<div>{this.state.names.map((name)=>{<Component1 key=name.id ,value={this.state.count}})  
    */

    //CONSTRUCTOR:Initialises properties of component
    /*
    constructor(props){       
      super(props)                                      -->INHERIR :Inherit parent constructor compulsarily                                            
      this.state.count =0                                -->INITIALISE STATE : In constructor no need to do this.setState()
      this.state.ticks = this.props.value                -->USE PROPS : Props must be given as an arguement to constructor
      this.handleOnClick = this.handleOnClick.bind(this) -->BINDING EVENT HANDLERS:So that  "this" inside the eventHandler methods references class object)         
      
    } 
    */                                      
                                                                          
    //RENDER METHOD :Converts Components and all its childrens "JSX EXPRESSION" into "React ELEMENT(Virtelement DOM)"  using React.createElement('div/h1 etc')                         
    /*
    render() {               
      return(
          <div>           --><DIV> TAG : React.createElement('elementtype') calls the first element of jsx                                                                    
              HTML CODE                  so if jsx is  <h1></h1> <img></img> it will call 'h1' but if you wrap all code inside div it will call 'div'              
          <div>            -->HTML CODE                         
      );                     DYNAMIC VAR,METHOD,FOR,IF
                              {this.state.count}                                                -->using variable dynamically
                              {this.methodName()}                                               -->using normal method methods dynamically 
                              {this.methodName} OR {()=>{this.methodname(arg)}}                 -->using eventHandler method methods  dynamically
                              <ul>{this.state.names.map(name =><li key=name>{name}</li> )}<ul>  -->using for loop dynamically(JSX is not a template hence we dont have syntax for ror loop)
                                                                                                  <ul>{names}</ul> :<ul></ul> is a jsx exp insode which you use names array dynamically
                                                                                                  <li>{name}</li>  :<li></li> is a jsx exp insode which you use name element of array dynamically
                                                                                                  key =name        :the elements of array taken here must be unique so you must provide unique property to key
                                                                                                                  EG : in our case all the name in names arr are unique hence key=name
                                                                                                                      if names arr was like [{id:1,}{id:2,}] then you would do key=name.id
                              {this.state.name.length === 0 && "This is empty"}               -->using if dynamically(JSX is not a template hence we dont have syntax for if )  
                                                                                                  if condition used as a first operand  if condition op used as a second operand 
                                                                                                  so both must be truthy 

                              CSS,EVENT                                                                    
                              <tagName className="classname">  OR <tagname style = {{"key1":"value1","key2":"value2"}}>   --> classname= instead of class=
                                                                                                                              style={{"key1":"value1","key2":"value2"}} instead of style="key1":"value1";"key2":"value2"
                              <tagname eventName = {this.eventHandlerMethodName}>                                              --> eventHandlerFnName not eventHandlerFnName()

                                              
                                        
     

    }
    */                                       
                                         
    //COMPONENTDIDMOUNT METHOD:Called after rendering  component to DOM
    /*      
    componentDidMount(){      
    }
    */

    //COMPONENTDIDUPDATE METHOD:Called after rendering updated component to DOM
    /*
    componentDidUpdate(previousProps,previousState){ 
         previousProps -- holds previous props before updating
         previousState -- holds previous state before updating
    }
    */
    
    
    //COMPONENTDIDMOUNT METHOD:Called before deleting component from DOM
    /*
    componentWillUnMount(){   
    }
    */
   
    //NORMAL METHOD: normal method of component
    /*
    count(){                   
        CALLING NORMAL FN IN CLASS, JSX
        this.state.count(args);        -->calling method im class
        {this.state.count(args);       -->calling method on jsx    
      }

      */
                       
                                          
    //EVENTHANDLER METHOD : handles events of jsx
    /*
    handleOnClick(){          -->named fn       :inside fn this != class object so you need to bind the fn in constructor as super();this.handleOnClick = this.handleOnClick.bind(this) 
    handleOnClick = () =>{     -->named arrow fn :indise fn this = class object

        {this.methodName}  OR {() => this.methodName(arg)} --> call method in jsx exp  without arg , with arg 
 
        
    
    }  
    */
//}            

/* #endregion */
    

      
//FUNCTION COMPONENT
/* #region Main */
//fnName = (props) =>{   
    
    //USESTATE() 
    /*
    const [count, setCount] = useState(0);        -->create state  where key is count value is 0 and setcount() is a fn to update count (imported from React)   
    count ,{count}                                -->use state  in fn ,jsx                    
    setCount(count+1),{setcount(count+1)}         -->update state in fn ,jsx 
    */

    //USESTYLES()
    /*
    const classes = useStyles();                -->create styles (imported from styles.js as each file has a corresponding styles.js)
    classes.styleName ; {classes.styleName}     -->use styles in fn,jsx
    */
    
 

    //USEDISPATCH() 
    /*
    
    
    */

    //USEEFFECT()
    /*
     */


    //FNNAME()
    /*
    const fnName = async (arg) => {}     -->create function
    fnName(params) ; {fnName                       


    */


    //RETURN 



    //PROP  :holds data from other component
    /*
    <childComponentName count={count}/>     -->pass prop in parent component                                             
    props.count                             -->use prop in child component (props is an argyement to function)                                            
    props.count = props.count+1 X           -->update props in child component cant as props are passed from other component hence cannot be updated      
                                              (NOTE:key="uniqueProperty" is not considered a value and not passed from parent as it is used to uniquely identify values in dynamic for  
                                               Eg:<div>{names.map((name)=>{<Component1 key=name.id ,value={count}})  
    */
    
    
    //RETURN : return the JSX inside render directly
    /*
    return(                                 
        <div>

        </div>
    );
    */

//} 
/* #endregion */


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










