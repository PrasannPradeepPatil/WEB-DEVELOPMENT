/*
//REMAINING
Date – Mosh Hemadani -->JavaScript Basics for Beginners-->5. Objects-->14.Date
BABEL;WEBPACK -- MOSH HEMADANI ->JS ->2.OOP->06.ES6MODULES ->61;62
*/

//STRUCTURE 
/*
(MEMBER , THIS)

global{}                                 -->GLOBAL OBJECT,WRAPPER FN(ES5), WINDOW OBJECT(ES6)
function(exports,require...){//OUR CODE}     


const var = require('')                  -->IMPORT , EXPORT(ES5) , IMPORT EXPORT(ES6)
exports.fnname = fnname(){} 

function circle(radius,x,y){ }           -->NAMED FN,ANONYMOUS FN ,                                 
                                           SYNC FN ,ASYNC FN(CALLBACK),ASYNC FN(PROMISET USING THEN-CATCH),ASYNC FN (PROMISET USING ASYNC AWAIT)PROMISE
function circle(radius,x,y){ }           --.FN DETAILS


class classnama{}                       -->NAMED CLASS, ANONYMOUS CLASS
class classnama{}                       -->CLASS DETAILS      



OBJECT                                 --> NUMBER;BOOLEAN;NULL;NaN;SYMBOL ;STRING; OBJECT ; ARRAY

EXCEPTION                              -->EXCEPTION CLASS,EXCEPTION HANDLING 

CONDITIONAL                            -->IF; WHILE, DO WHILE;FOR,FOR –IN ,FOR-OF ,ARRAY METHODS ,BREAK CONTINUE



** JS VS TS**
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


//**MEMBER,THIS**
/* #region Main */


//INSTANCE  MEMBERS ,PROTOTYPE MEMBERS
/*
Instance members -->Members that belong to the object
Prototype members-->Members belonging to all above Prototpes of object;Prototype is a object from which the object inherits                               
*/
//OBJECT(ObjectBase Prototype -->Object)
/*
let obj = {x:1;y:2};
Console.log(obj)--> //INSTANCE MEMBERS 
                        x:1                           -->Object    
                        y:2.
                    //PROTOTYE  MEMBERS
                    __proto__:Object                 -->ObjectBase  Prototype
                    constructor: ƒ Object()  as Object ; 
                    hasOwnProperty: ƒ hasOwnProperty()
*/
//FUNCTION(Object Base Prototype --> FunctionBasePrototype -->  Function)
/*
function Circle(radius){
    this.radius = radius;
    this.draw = function(){
    }
}

let circle = new Circle(1);
console.log(circle);--> //INSTANCE MEMBERS
                        radius:1                                    -->Function
                        draw: f()
                        //PROTOTYPE MEMBERS
                        __proto__:Object                           -->FunctionBase Prototype
                            constructor:f Circle(radius)   
                            __proto__:Object                      -->ObjectBase Prototype
                                constructor: ƒ Object()  as Object ; 
                                hasOwnProperty: ƒ hasOwnProperty()
*/
//CLASS(ObjectBasePrototype -->ClassBasePrototype -->Class)
/*
Class Circle{
    Constructor(radius){
    this.radius = radius;
    this.draw = function(){
    }
}

let circle = new Circle(1);
console.log(circle);--> //INSTANCE MEMBERS
                        radius:1                                    -->Class
                        draw: f()
                        //PROTOTYPE MEMBERS
                        __proto__:Object                            -->ClassBase Prototype
                            constructor:f Circle(radius)   
                            __proto__:Object                        -->ObjectBase Prototype
                                constructor: ƒ Object()  as Object ; 
                                hasOwnProperty: ƒ hasOwnProperty()
*/
//ARRAY(Object Base Prototype --> ArrayBasePrototype -->  Array)
/*
let x = [1,2]
console.log(x)--> //INSTANCE MEMBERS
            1:1                                      -->Array
            2:2
            //PROTOTYE  MEMBERS
            __proto__: Array(2)                      -->ArrayBase Prototype        
                        concat: ƒ concat()           
                        constructor: ƒ Array()    
                        find: ƒ find()                     
                        __proto__: Object              -->Object Base Prototype
                                constructor: ƒ Object()  as Object ; 
                                hasOwnProperty: ƒ hasOwnProperty()
*/


//INSTANCE MEMBERS , PPROTOTYPE MEMBERS CHANGES
//OBJECT.GETPROTOTYPEOF(MYOBJ)
/*
Object.getPrototypeof(myobj)/                    -->returns the prototypeobject   of the object passed    
myObj.__proto__ /                                     Eg let arr = [1,2,3,4]  new Array() under the hood constructor fn
Constructorfn.prototype(deprecated)                       arr.__proto__/ Object.getprototype(arr)/ Array.prototype      
                                                      Eg function Circle(radius){ }
                                                         let c1 = new Circle();
                                                         C1.__proto__/ Object.getprototype(c1)/ Circle.prototype      
*/
//OBJECT.GETOWNPROPERTYDESCIPTOR(MYOBJ ,”MEMBER” )
/*                                                                                                                                                 
Object.getOwnPropertyDesciptor(myobj ,”member” ) -->returns attributes attached to   the member of the object passd  
                                                    value: gives the value of the member
                                                    configurable: if true we can delete the  member
                                                    enumarable: if true means while iterating we will see that member 
`                                                   writable:if true means we can overrite the value  of the member 

                                                    EG
                                                    let person ={x:1};
                                                    let attributes = Object.getOwnPropertyDescriptor(person,'x');
                                                    console.log(attributes);--> value: 1  --> value of member  x is 1                  
                                                                                configurable: true  --> we can delete member x
                                                                                enumerable: true    -->for(i in person) we can see member  x
                                                                                writable: true   --> we can overwrite value of member  x  
                                                                                __proto__: Object

                                                    EG
                                                    let person ={x:1};
                                                    let objectBase = person.__proto__/Object.getPrototypeOf(person);
                                                    let attr = Object.getOwnPropertyDescriptor(objectBase,'toString');
                                                    console.log(attr);--> value: ƒ toString()-->value of member  toString  is toString()
                                                                        configurable: true  --> we can delete member toString
                                                                        enumerable: false --> for(i in person) we cant see member toString 
                                                                        writable: true --> we can overwrite value of member  toString
                                                                        __proto__: Object
*/
//OBJECT.GETOWNPROPERTYDESCIPTOR(MYOBJ ,”MEMBER” )
/*
Object.defineProperty(object ,”property ” { attribute:value}) --> we can change the ttributes atached to a property of object passed
                                                        value = anyvalue: gives the value of the member
                                                        configurable : t/f: if true we can delete the  member
                                                        enumarable : t/f: if true means while iterating we will see that member
                                                        writable =:t/f:if true means we can overrite the value  of the member
                                                        get:function(){return prop} :we can do obj. member no need of obj.get()
                                                        set:function(vall){prop = val} :we can do obj. member = val no need of obj.set(val) 

                                                       	EG
                                                        function Circle(radius,x,y){ 
                                                            Object.defineProperty(this,"angle",{
                                                                    Configurable: false         -->you cant delete angle member 
                                                                    writble:false               --> tou cant overwrite angle member value
                                                                    get:function(){             -->let c1 = new Circle(1,2,3) ; you can directly do   c1.angle 
                                                                            return angle},          no  need of c1.getAngle()   
                                                                    set:function(value){        --> let c1 = new Circle(1,2,3) ; you can dir do   c1.angle =22
                                                                                angle = value;}     no  need of c1.setAngle(22)   
                                                            })
*/
//OBJECT.HASOWNPROPERTY(‘MEMBER’)
/*                                                                                                                                                                                            
Object.hasOwnProperty(‘member’)                         --> returns true if the member is an instance member and false if the member is a prototye member
                                                            EG
                                                            function Circle(radius){
                                                            //Instance member
                                                            this.radius = radius;}

                                                            //prototype member
                                                            Circle.prototype.draw= function(){     
                                                                    console.log(“”circle with” + this.radius)  }

                                                            Object.hasOwnProperty(‘radius’) --> true         
                                                            Object.hasOwnProperty(‘draw’) --> false
*/
//OBJECT.KEYS(MYOBJ)
/*
Objects.keys(myObj)                                      -->returns an array of instance members of the object  whose enumerate = true
                                                            If you want both instance;prototype members  whose enumerate = true use FOR-IN
                                                            EG
                                                            function Circle(radius){
                                                            //Instance member
                                                            this.radius = radius;}

                                                            //prototype member
                                                            Circle.prototype.draw= function(){     
                                                                console.log(“”circle with” + this.radius)  }

                                                            let c1 = new Circle(1)


                                                            Object.keys(c1) -->[“radius”]
                                                            for(key n c1){        -->”radius” , “draw”
                                                                console.log(key)}
*/                                                                                              


//THIS 
/*
this             --> references object {}  that is executing current function 
this in fn      -->this =  windows/global  objecr   if we are in normal fn
                -->this = object returned by new  FnName()  if we are in const fn
                        = window/global  object   FnName()  if e are in Constructor  fn and we forget new keyword
this in method  -->this = Object_In_Which_Method_Declared {} 
                ‘use strict’ --> Prevents accidently modifying global/window object in case 2 and sets this = undefined
                                For fns we require to explicittly mention ‘strict mode’
                                Classes implicitly work in strict mode
 
                                function Circle(){
                                    this.draw = function(){colsole.log(this)}
                                }

                                //method call
                                Let c = new Circle();
                                c.draw()  -->"In fn this  = object returned by new fn()""

                                //fn call
                                let c = new Circle()
                                let draw = c.draw();
                                draw(); -->"In fn this =  window/global object hence we must ‘use-strict’ at top to prevent this
                                           from being et to window object"

                                EG1
                                function sum(){
                                console.log(this) }           --> this in nrml fn -> this = window { key:value, key:value }
                                sum();

                                EG2
                                function sum(){
                                this.a = 2                     -->  this in constructor --> this = sum {} ;   
                                
                                    this.calculate = function(){   -->  this in constructor --> this = sum {} ; 
                                            let a = this.radius   -->(){-->  this in methdod  ---> this = sum {} ; "equivalent to s.calculate = fn()"
                                                }}
                                "let s = new sum()"

                                EG3
                                Function sum(){
                                let obj = {
                                    tittle:a.
                                    play:function(){
                                        console.log(this)--> this in method  --> this = obj {}
                                    }
                                    return video
                                }


                                EG 4 
                                let video = {
                                    tittle:a.
                                        play:function(){
                                            console.log(this) --> this in method --> this = video {}
                                        }

                                "
                                Video.stop = function(){
                                    console.log(this)                   --> this in method(method is added outside video obj ) --> this = video {}
                                }
                                "


                                Video.play()-> video{tite:a ,play : f  , video:f}
                                Video.stop() -> video{tite:a ,play : f  , video:f}


                                EG 5
                                let video = {
                                    tittle:a.
                                    tags:[‘a’,’b’,’c’];
                                    play:function(){
                                        this.tags.forEach(function (tag){  --> this in method --> this = video {}
                                            console.log(this)              --> this in nrml fn --> this = window {}
                                        } );
                                    }
*/


//CHANGING THIS
/*
1.fnname(arg1 , arg2)                                                           --> In fn this = whatever it is 
fname.call(obj ; arg1,arg2) /   fnname.apply(onj; [arg1,arg2])                --> In fn  this  = obj  only for this call 
let var = fnname.bind(obj,arg1,arg2) var()/ fnname.bind(obj,arg1,arg2 )"()"  --> Return a new fn where this = obj for all calls of new fn 
** forEach(fnname(){} ."bind"(thisvalue))  bind is outside fn so  this passed to bind will be outside fn  (EG 2)
EG1,"2"

2.Arrow Fn -->Arrow fns inherit this from containing fns.
Eg 2

3.const that/self  = this --> Catch this in a var and use the var somwhere else
EG 2



                    EG1
                    function sum(a,b){
                        console.log(this) 
                    }
                    sum()-->this in fn -->Inside fn this = window
                    sum.call({"p":1 ,"r":2} ,1,2)/sum.apply({{"p":1 ,"r":2} },1,2)          --> Inside fn this = window only for this call
                    let c = sum.bind({"p":1 ,"r":2} ,1,2) / sum.bind({"p":1 ,"r":2} ,1,2) () ; --> Inside new  fn this = window for all calls
                    c()



                    EG 2
                    let video = {
                        tittle:a.
                        tags:[‘a’,’b’,’c’];
                        play:function(){
                        this.tags.forEach(function (tag){                        --> this in method --> this = video {}
                            console.log(this ) --> this in nr fn                 --> this = window{}                                                                        
                            } );
                        }

                    let video = {
                        tittle:a.
                        tags:[‘a’,’b’,’c’];
                        play:function(){
                            this.tags.forEach(function (tag){                     --> this in method --> this = video {}
                            console.log(this )                                  -->  this = video{}                                                                        
                            }. bind(this)  );                                   --> this in play method --> this = video{}
                        }

                    let video = {
                        tittle:a.
                        tags:[‘a’,’b’,’c’];
                        play:function(){
                            this.tags.forEach((tag)  =>{                            --> this in method --> this = video {}
                                console.log(this )                                  -->  this in method play --> this =  video{}                                                                        
                            } ); 
                        }

                    let video = {
                        tittle:a.
                        tags:[‘a’,’b’,’c’];
                        play:function(){
                            that = this                                            --> this in method --> this = video {} ; that = video {}
                            this.tags.forEach(function (tag){                      --> this in method --> this = video {}
                                console.log(that )                                 --> instead of using this we use that as this here this  will reference windoe {}
                            }                                         
                            );
                        }


*/

/* #endregion */


//GLOBAL OBJECT , WRAPPER FN ,WINDOW OBJECT
/* #region Main */


//GLOBAL OBJECT(ES5 - NODE)
/*
global {                                         --> Global Object has properties and  functions  which can be called by 
                                                      global.member OR member(node will by default put global ahead of it)
       
setTimeout(time in  ms); --> global object’s  fn which delay the fn by t ms;
clearTimeout();-->global object’s  fn which  stop the elay
setInterval() --> global object’s   fn which  call a fnrepetitively after delay
clearInterval() --> global object’s   fn which  stop calling a fn repetitively after a delay
console.log(“msg”)-> global object’s   fn which  logs the msg
console.error(“msg”)--> global object’s   fn which  logs the msg as red
console.warn(“msg”)--> global object’s   fn which  logs the message as warning 
}
*/

//WRAPPER FN(ES5 - NODE)
/*
function((exports , require , module, filename , __filename, __dirname)){   --> Every File is a module  and everything defined inside a module is 
                                                                                wrapped inside a fn and is  private to that module
     

        module-->wrapper  fns parameter which is a object 
        {
        id: '.',
        path: 'C:\\Users\\DELL\\Desktop\\JavaScript\\NodeVsCode\\VSCode\\audio-transcoder\\mitron',
        exports: {},
        parent: null,
        filename: 'C:\\Users\\DELL\\Desktop\\JavaScript\\NodeVsCode\\VSCode\\audio-transcoder\\mitron\\ztest.js',
        loaded: false,
        children: [],
        paths: [    'C:\\Users\\DE………]
        }
        module.exports.key = value; --> wrapper  fns parameter “module”  is a object ; in “module” object we set the “exports ” oject
        exports.key = value ;       --> wrapper fns parameter  “exports” is a object which we set with key value pair
        require(‘filepath’)         --> wrapper fns parameter “require”  is a fn() which retuens the “module object” ka “exportobject”
                                        OR “export” object itself depending on which obj you used to export
        __filename                  --> wrapper fns parameter “__filename”  is a string which returns the filename 
         __diename                  --> wrapper fns parameter __diename”  is a string which returns the directory in which  the file is 

  
         ///OUR CODE  
        }       
         
 */     


 //WINDOW OBJECT(ES6 - BROWSER)
 /*
 window { }                                        --> Windoe Object has properties and  functions  which can be called by 
                                                      window.member OR member( browser will by default put window ahead of it)
 */

/* #endregion */


//IMPORT EXPORT
/* #region Main */

//IMPORT , EXPORT (ES5 - NODEJS)
/*
//SINLE 
module1.js                          module2.js
fnName = () =>{}                    var fnName = require('externalmodulename' OR './modulename1' OR '../modulename1') 
module.exports = fnName

//MULTIPLE
module1.js                           module2.js
exports.fnName1 = () =>{}           var {fnNanem1,fnName2} = require('externalmodulename' OR './modulename1' OR '../modulename1') 
exports.fnName2 = () =>{}


*/

//IMPORT , EXPORT (ES6 - NODEJS)
/*
//SINGLE
module1.js                             module2.js
fnName = () =>{}                       import fnName from 'externalmodulename' OR './modulename1' OR '../modulename1''    
export default fnName

//MULTIPLE
module1.js                            module2.js  
export const fnName1 = () =>{}        import {fnName1,fnName2} from 'externalmodulename' OR './modulename1' OR '../modulename1'
export const fnName1 = () =>{}




*/
/* #endregion */


//FUNCTION DECLARATION(FUNCTION IS A OBJECT WHICH RETURNS A OBJECT)
/* #region Main */


//NAMED FUNCTION --> FNS WITH DECLARATION 
/*
//NAMED FN DECLARATIONS
function fnname(params){}   OR  fnName = (params)  => {}   -->FNS ARE MOVED TO TOP OF MODULE(HOISTING) 
async function fnname(){}   OR  fnName = async(params) =>{}         


//CALLING NAMED FN
let varname = fnname(arg)       
*/             

//ANONYMOUS FN -->FNS WITHOUT DECLARATION BUT EXPRESSIONS
/*
//ANONYMOUS FN EXPRESSIONS
let varname = function(){}     OR let varname = () =>{}         -->FNS ARE NOT MOVED TO TOP OF MODULE(NON HOISTING)
let varname = async function() OR let varname = async() =>{}      

//CALLING ANONYMOUS FN
Already called

*/

//SYNCHRONOUS FN
/* 
//SYNCHRNOUS FN
function synchronousFnname(arg){
     Synchronous task;
}

//USING SYNCHRONOUSFN
let varname = synchronousFnname(par)       -->Start and complete  syncFn then execute code after syncFn 
Console.log(“code after calling the synchronous fn ”)
*/

//ASYNCHRONOUS FN (CALLBACK)
/*
//ASYNCHRONOUS FUNCTION THAT TAKES CALLBACK 
function asyncFnName (id,"callback") {
          anotherAsyncFn (() => {
            "callback(arg)" ;  -->calls the callback fn and passes it arguements
            });
}

//USING CALLBACK 
asyncFnName (1 , ("param")=>{           -->start asyncFN and the code after the asyncFn ; complete asyncFn task  
            console.log(paramater);        after completion of asyncFn task execute callback fn whose param= arg 
                });

Console.log(“code after calling the asynchronous fn ”)
)
*/

//ASYNCHRONOUS FN (PROMISET USING THEN-CATCH: THEN/CATCH AND ASYNC/AWAIT DO SAME THING BUT ASYNC/AWAIT MAKES ASYNC CODE LOOK SYNCHRONOUS)
/*
//ASYNCHRONOUS FUNCTION THAT RETURNS ROMISE 
function asyncFnName (id) {
    return new Promise (("resolve","reject")=>{
             anotherAsyncFn (() => {
                      "resolve"(arg1 ) --> calls the fn inside and passes it parameter
                      "reject"(arg2)         calls the fn inside catch and passes it parameter 
                      });
      
    });
}

//USING PROMISE(THEN,CATCH)
asyncFnName                                       -->start asyncFn and the code after the asyncFn ; complete the asyncFn and return a promise  
        .then((param1)=>{console.log("param1")})     if promise sucessful execute then whose param1 = arg1
        .catch((param2) => {console.log("param2")}); if failded execute catch whose param2 = arg2(param2 is usually error)
                                                       
*/

//ASYNCHRONOUS FN (PROMISET USING ASYNC AWAIT : THEN/CATCH AND ASYNC/AWAIT DO SAME THING BUT ASYNC/AWAIT MAKES ASYNC CODE LOOK SYNCHRONOUS)
/*
//ASYNCHRONOUS FUNCTION THAT RETURNS ROMISE 
function asyncFnName (id) {
    return new Promise ((resolve,reject)=>{
             anotherAsyncFn (() => {
                    resolve(arg1 ) --> passes the arg to var inside try
                    reject(arg2)         passes arg to var inside catch
                    });
      
    });
}


// USING PROMISE(ASYNC,AWAIT)
async function fnName(){
    let user = null;
    try{
       param1 = await asyncFnName (1);  --> start asyncfnname and the code after the fn;complete the asyncFn and return a promise 
       console.log(user);                    if promise sucessful  run try and return arg1  to param1  
     }                                       if promise failed return  exxcept arnd return arg2 to param2(param2 is usually error)
    catch(param2){                          NOTE: await keyword can be used only if it is wrapped inside async fn 
        console.log(param2);                 
    }
}
fnName();
Console.log(“code after calling the asynchronous fn ”)
*/

//PROMISE
/*
Promise.resolve() --> replace new Promise(resolve,reject) ith Promise.resolve() and 
                      Value inside resolve  goes toparameter in then ; catch gets no value so  not used
                      Value inside resolve  goes to parameter Itry  ; catch gets no but catch cant be removed so don’t use async await

Promise.reject() --> replace  new Promise(resolve,reject) with Promise.reject()  and we can only use catch  and not then
Promise.all(arr) --> collect all the fns that return promise in an array and all fn’s resolve arg will be collected in an array  and given  to then 
                        parameter/parameter in try  ; all fn’s reject  arg will be collected in an array  and given to catch  parameter/parameter in catch()
*/


//FACTORY FN;CONSTRUCTOR FN   
/*
function  circle(radius){ -->PASCAL CASE     function   Circlr(radius) {-->CAMEL CASE
    return {                                      
        radius ,                                 this.radius = radius
        draw(){                                  this.draw = function(){
            console.log(radius);                   console.log(radius)''
        }                                         }
    }                                         }

let varname =fnName(arg)-->fn returns object     let varname = new FnName(arg)-->new creates empty obj {} and assigns this to {}     
*/


//PARAMETER ; ARGUEMENT 
/*
//NORMAL PARAMETERS
fnname(parameter){                              -->PROVIDES VALUE TO PARAM ; IF PARAM > ARG REMAINING PARAM = UNDEFINED ; IF ARG > PARAM REMAINING ARG IGNORED 
                                                   (DEFAULT PARAM)            (REST PARAM)


//DEFAULT PARAMETER(EG 1)
fnname(parameter = value){                         -->PROVIDES DEFAULT VALUE TO PARAM AND  IF ARG PASSES VALUE OVERRIDE
     OR                                               DEFAULT  PARAM MUST BE LAST
     let parameter = parameter|| defaultvalue :       EG1


//REST PARAMETERS, SPREAD ARGUEMENTS
fnName(a,...arr){}                                  -->COLLECTS REMAINING ARG IN ARRAY  CALLED "ARRAYNAME" AND  REST PARAMETER MUST BE LAST PARAMETER
fnName(...arr)                                      -->SPREADS THE ELEMENTS OD ARR INTO INDIVIDUAL ELEMENTTS 
                                                       Note: ...arr as parameter is rest parameter ; ... arr as arguement is spread parameter
                                                       EG2
                
//ARGUEMENT KEYWORD
fnname(parameters){
       arguments                                    -->COLLECTS REMAINING ARG IN ITERATOR  CALLED "ARGUEMENT"  
                                                      EG3

                                                            

Eg1
functon sum(a,b,c = 3){
   let a = a||1;let b = b||2 ; }

sum()

EG2
function sum(a,...NUMS){   --> collects remaining args into arr called "num" [2,3,4,5,6]
    return  name.reduce((a,b) =>a + b );}
sum(1,2,3,4,5,6)

Math.min(...arr)    -->spreads the elements of arr/obj  into individual elements and  give those elements as arguements to min so it will be Math.min(1,2,3,4,5)


Eg3
function sum(){                       
let total = 0;
for(i of arguments){total = total + i;}
return total;
}
let total = sum(1,2,3,4,5,6,7);





*/


/* #endregion */


//FUNCTION 
/* #region Main */

/*
function extend(Child , Parent){
     Child.prototype = Object.create(Parent.prototypte)  --> theprototype of child inherit from prototype of parent
     Child.prototype.constructor = Child                     so child obj has the prototype members of parent obj
                                                                  ------------ Parent.prototype
                                                                 |                   |
                                                         Child.prototype             |
                                                                |                    |
                                                           Child object            Parent object 
     OR                                                                                                                     
      
     Child.prototype = new Parent()              --> theprototype of child inherit from parent object
     Child.prototype.constructor = Child              so child obj  has both  prototype and instance  members of parent 
}                                                                ------------ Parent.prototype
                                                                 |                   |
                                                         Child.prototype             |
                                                                |                    |
                                                           Child object            Parent object 



function Circle(radius,x,y){ -->CAMEL CASE
*/

        ////INSTANCE MEMBERS////  --->THese members belong to Circle class  
        //INITIALISE
         /*
         let   angle = 20;    --> private scope : they are available inside fn only  ie let c = new Circe() c.member cant
                                                  closure :  member can be acesse as members  inside  this.methodname:fn() and  let methodname:fn())
         this.radius = radius; -->public scope : they are available outside fn only ie let c = new Circe() c.member cant
                                                 closure : member can be acessed  as this.member inside this.methodname:fn() and not inside methodnname:fn())
         */                     
         //GETTER , SETTER (USING THIS)-->you need to call method let c1 = new Circle() c1.getAngle() ; c1.setAngle() = 22
         /*
         this.getAngle = function(){                   
            return angle;}

         this.setAngle = function(value){
            angle = value;}
         */
        //GETTER , SETTER(USING OBJECT.DEFINEPROPERTY) --> You can directly do  let c1 = new Circle() c1.angle ; c1.angle = 22 
        /*
        Object.defineProperty(this,"angle",{
                get:function(){
                        return angle; },
                set:function(value){
                        angle = value;

                }
        })
        */
        //METHODS
        /*
        let area= function(){             --> private scope : they are available inside fn only  ie let c = new Circe() c.member cant
                return radius*radius; }       closure :  member can be acesse as members  inside  this.methodname:fn() and  let methodname:fn())


        this.calculate = function(){     --> public scope : they are available outside fn only ie let c = new Circe() c.member cant
                let ar = area();             closure : member can be acessed  as this.member inside this.methodname:fn() and not inside method:fn())
                let ch = chord();
                return ar;
        }    
        */    
    

////PROTOTYPE MEMBERS//// -->These members are put on the CircleBase prototype
/*
 Circle.prototype.draw= function(){     
       console.log(“”circle with” + this.radius)  }
*/

////INHERITED MEMBERS////-->These Members inherited from Shape Object
/*
extends(Circle , Shape)                                       -->Object.prototype ->Shape.prototype ->Circle.prototye->Circ;e Pbject
                                                              -->inheits members       
Circle.prototype.bark = function(){ console.log("gg"); }      -->overriding method(after extends) 
Circle.prototype.bark = function(){                            -->extends method(after extends fn)
           Shape.prototype.bark.call(this);   
           Console.log(“gg”);
}
*/
        //INHERITENCE BY SUPER MEMBER(Anothet type of inheritence)
        /*
        function Animal(height){
            this.height = height;
            this.bark = function(){ console.log("oo");}
        }

        function Dog(height , size){
            Animal.call(this, height);  --> inherits all the instance members of Animal and  
            this.size = size;              prototype members of Animal.prototype
        }

        let d = new Dog(1,2);
        */
        //INHERITENCE BY COMPOSITION( Anothet type of inheritence
        /*
        function compose(targetObject , …sourceObjects){
            Object.assign(targetObject …sourceObject)--> put all the members of obj1, obj2 in 
                                                                                                target obj
        }


        let Animal1 = {
            bark:function(){
                console.log("oo");
            }
        }

        let Animal2 = {
            walk:function(){
                console.log("vromm")
            }
        }

        let Animal3 = compose({},Animal1,Animal2);
        OR
        Function Animal3(){}
        compose(Animal3.prototype,Animal1,Animal2);
        Let a = new Animal3()
        */




/////ACESS////
/*
let c1 = new Circle(2,2,3);-->c1 is an object
console.log(c1.calculate())
*/

////**FUNCTIONS ARE OBJECTS/////
/*
Circle.name             --> returns name of fn  ie circle
Circle.length           --> returns number of arg of fn ie 3
Circle.constructor      --> returns constructor fn object used to build fn object   ie  ƒ Function() { [native code] }
Circle.call({} , 1,2,3) --> returns new Circle(1,2,3)  and {} referennces to this
Circle.apply({} , [1,2,3])--> return new Circle(1,2,3); and {} references to this 

*/

////*** INBUILT CONSTRUCTOR/////
/*
Every obj literal  is converted to constructor fn which returns an object    under the hood                     
let  num = 22 new Number(22)  which returns Number object
let bool = true new Boolean(true) which returns Boolean objetc
let str = “pras” new String(“pras”) which returns String object 
let arr  =[1,2,3,4,5]  new Array([1,2,3,4,5]))  whhic h returns Array object
let obj = {a:1;b:2} new Object{{a:1,b:2}}  which returns object
let fn =function(param){content}  new Function(param , `content of fn`)    which  return function object   
let fact_obj = factoryFunction(); new Function() which returns object
let const_obj = new ConstructorFn() this is itself an constructor fn which returns object
                     
We  can find constructor function  which returned the object(All on the right sides are constructor fns)
console.log(`
${num.constructor}            -->function Number() { [native code] } 
${bool.constructor}           -->function Boolean() { [native code] } 
${str.constructor}            -->function String() { [native code] } 
${arr.constructor}            -->function Array() { [native code] } 
${obj.constructor}            -->function Object() { [native code] } 
${fn.constructor}             -->function Function() { [native code] }
${fact_obj.constructor}       -->function Function() { [native code] }
${factoryFunction.constructor}-->function Function() { [native code] }
${const_obj.constructor}      -->function constructorFunction(a){our code} as the const fn we wite is itself an const fn
 
 `);

*/

/* #endregion */


//CLASS  DECLARATION(CLASSES ARE  SUGARCOAT OVER  FUNCTION WHICH ARE OBJECT WHICH RETTURN OBJECT)
/* #region Main */

//NAMED CLASS --> CLASS WITH DECLARATION 
/*
//NAMED CLASS DECLARATIONS
class classname{}               -->CLASSES ARE "NOT"  MOVED TO TOP OF MODULE(HOISTING) 
       
//CALLING NAMED CLASS
let varname = new class(arg)       
*/             

//ANONYMOUS CLASS -->CLASS WITHOUT DECLARATION BUT EXPRESSIONS
/*
//ANONYMOUS FN EXPRESSIONS
let varname = class(){}       -->CLASSES ARE "NOT" MOVED TO TOP OF MODULE(NON HOISTING)
  

//CALLING ANONYMOUS FN
Already called

*/

/* #endregion */
                                                     

//CLASSES
/* #region Main */

/*
let _radius = Symbol(); --> Symbol produces a unique value every time ; But when  the members will be visible as instance members but not 
let _draw = Symbol();      acessible

let _radius = new WeakMap();  --> weakMaps are Objects with key =:Object ;  value:any value ; The members will not be visible in instance 
let __draw2 = new WeakMap()     members and will not be acessible also

class Circle extends Shape{-->CAMEL CASING
*/
  
    ////INSTANCE MEMBERS////--->These are members of Circle class
    //CONSTRUCTOR
    /* 
    constructor(radius1,radius2){
        super()    -->super() must be calld to inherit superclas constructor must be called in constructor  
        this[_radius] /_radius.set(this,radius        -->private scope :  they are not available outside class
        this [_draw]()  /_radius.set(this,radius)       closure: members can be  acess ie inside any method as  this[_radius]/_radius.get(this)

        this.radius = radius;                          -->public scope: they ae available outside class
        this.draw = function(){}                          closure: members can be  acess ie inside any method as  this.radius  ; this.draw()                   
    */ 
 
    ////PROTOTYPE MEMBER//// -->These members are added to the CirleBase 
    //GETTER SETTER(USING GET METHDNAME)--> We need to call method let c= new Circle() ; c.getradius() ; c.setradius()22
    /*
    getRradius(){
        return radius; }

    setradius(value){
        radius = value;}
    */
    //GETTER SETTER(USING GETMETHDNAME)--> We can directly do let c = new Circle(1,2) c.radius c.radius = 22 no need of methodcall
    /*
    get radius(){
        return radius;}
    set radius(value){
            radius = value;}
   */
    //METHODS
    /*
    aceddmod      this [_draw2]() /=_draw2.set(this, function(){}   --> private scope :  they are not available outside class
                                                                        acess modifier: static members are not added to proto/nonstatic are added 
    acessmod draw2(){ }                                             -->  public  scope :  they are  available outside class
                                                                         acess modifier: static are not added to proto/nonstatic are added
    */                        

    ////INHERITED  MEMBERS////-->These Members inherited from Shape Object
    /*
                              -->inherit members 
    move2(){}                 --> create  members
    move(){                   --> extend members
        super.move();
        consol.log(“mve2”)}
        move(){}             -->overwrite members
    }
    */




/////**ACESS////
/*
let c = new Circlee(1);--> Cis the object retrned by circle class
console.log(c);
*/

////**CLASSES  ARE FNS WHICH ARE OBJECTS////
/*
Circle.name --> returns name of fn  ie circle
Circle.length--> returns number of arg of fn ie 3
Circle.constructor --> returns constructor fn object used to build fn object   ie  ƒ Function() { [native code] }
Circle.call({} , 1,2,3) --> returns new Circle(1,2,3)  and {} referennces to this
Circle.apply({} , [1,2,3])--> return new Circle(1,2,3); and {} references to this 

*/


/* #endregion */



//OBJECTS
/* #region Main */

//(  

    //DECARATION
    /*
    VAR DECLARATION
    var varname = object--> can be declared without being initialized , value can be changed and reassigned
                            global scope or functional scope(available within entire fn), attaches value to window obj

    LET DECLARATIPN
    let varname = object--> can be declared without being initialized , value can be changed and reassigned
                            block scoped available inside only code block) , doesn’t attach value to window object(top level obj in JS)  
    CONST DECLARATION
    const varnam = object--> cannot  be declared without being initialized , value cannot  be changed, block scoped
                            block scoped available inside only code block) , doesn’t attach value to window object(top level obj in JS)  
                            hoisted on top
                            EG
                            #let declaration
                            for(let i = 0 ; i<=5;i++) {}-->(i is code bloc scoped and  is not acessible outside

                            let a = 2-->;   window.a doesn’t exist

                            let a = [1,2,3,4]
                            a[1] = 22 --> we can change value 
                            a = [5,6,7,8,] --> we can reassign


                            #const  declaration
                            for(const  i = 0 ; i<=5;i++) {}-->i is code bloc scoped and  is not acessible outside

                            constt a = 2-->;   window.a doesn’t exist

                            const  a = [1,2,3,4]
                            a[1] = 22 --> we can change value 
                            a = [5,6,7,8,]  X we cant reassign


                            #var declaration
                            for(var j = I ; j <=5 ; j++){} -->i is code bloc scoped and  is not acessible outside

                            var b = 2;   --> window.b returns 2 which is bad

                            var  a = [1,2,3,4]
                            a[1] = 22 --> we can change value 
                            a = [5,6,7,8,] --> we can reassign


    SPREAD OPERATOR;REST PARAMETERS, SPREAD ARGUEMENTS
    ...arr/obj  -->spreads the elements into individual elements
                    #COPY
                    obj2 = {...obj}  -->returns new copy arr/obj (spreads the elements of arr/obj  into individual elements and  put those elements into new arr/obj and return new arr/obj
                    arr2 = [...arr] 

                    #CONCATENATION
                    obj = {...obj1,..obj2}  -->returns new concatenated arr/obj (spreads the elements of arr1/obj1 , arr2/obj2  into individual elements and  put those elements into new arr/obj and return new arr/obj
                    arr = [...arr1,..arr2]


    fnName(a,...arr){}-->collects remaining argumenets passed into array called "arr" and rest parameters must be last 
    fnName(...arr)    -->spreads the elements of arr/obj  into individual elements and  put those elements into new arr/obj and return new arr/obj
                        Note: ...arr as parameter is rest parameter ; ... arr as arguement is spread parameter
                        EG
                        function sum(a,...NUMS){   --> collects remaining args into arr called "num" [2,3,4,5,6]
                            return  name.reduce((a,b) =>a + b );}
                        sum(1,2,3,4,5,6)

                        Math.min(...arr)    -->spreads the elements of arr/obj  into individual elements and  give those elements as arguements to min so it will be Math.min(1,2,3,4,5)


    OBJECT DESTRUCTURE
    [a,b,...rest] = arr  -->Destructure the object by pattern matching on left and right 
    {a,b,...rest} = obj     arr:match the variables with elements                     ; variables must be equal to obj.length as we match values
                            obj: match the variables with the key and give them value ; variables can be less that obj.length as we match keys
                            EG
                            let employee = {id:12 ,name:'pras',surname:'patil'}
                            let list = [1,2,3,4,5,6,7]

                            let {name} = employee  -->name = 'pras'
                            let [a,...b] = list   -->a = 1 ; b = [2,3,4,5,6]

                                                                                                            



    









    */
    //CONVERSION
    /*
            i.toSTring()                        s.split(RE)
    number --------------------> string ------------------------------> arr
          <--------------------          <---------------------------
            parseInt(i)                     arr.join(seperetor)



    */
    //COMPARISION(COMPARISION OP, LOGICAL OP , INCLUSION OP)
    /*
    COMPARISION OPERATOR
    PRIM :== ,<=,>= ,!=/=== !== ;     -->Compare values/values + datatype                        ** = is assignment operator                                                                
    REF  :equals(a,b)           ; === --> Compare values/values + datatype;compare reference  
            |                           COMPARE VALUES /VALUES + DATATYPE    
        form equals method              int i1 = 3
        where you apply == / ===        String s1 ='3'
                                        i1 == s1 -- true    
                                        i1 === b1 -- false

                                        Dog d1 = new Dog(1,2,3);
                                        Dog d2 = new Dog(1,2,3);
                                        Dog d3 = new Dog(4,5,6);
                                        d1.equals(d2) -->True as bth object have same value
                                        d1.equals(d3)--> false as both object hve different value
                                        function equals(a,b,c){
                                            return d1.a == d2.a && d1.b == d2.b && d1.c == d2.c
                                            return d1.a === d2.a && d1.b === d2.b && d1.c === d2.c
                                        }

                                        COMPARE REFERENCE
                                        Dog d1 = new Dog(1,2,3)
                                        Dod d2 = new Dog(1,2,3)
                                        d3 = d2
                                        d1 == d2 --> False as  both reference different objects
                                        d2 == d3 -->True as both referennce same objects                                                  
                                                            
        
                                        Eg  
                                        i1 == < , > ;!=/=== ,!=  i2  -- return boolean by comparing value/value + datatype of integers 

                                        s1 == < , > ;!=/=== ,!=  s2  -- return boolean by comparing value/value + datatype of string

                                        arr1.equals(arr2)        -- returns boolean by comparing value/value + datatype of arr1,arr2
                                        arr1== arr2              -- returns boolean by comparing  reference  of arr1,arr2


                                        obj1.equals(obj2)        -- returns boolean by comparing value/value + datatype of obj1,obj2
                                        obj1== obj2             -- returns boolean by comparing  reference  of obj1,obj2

    LOGICAL OPERATOR    
    &&                               -->go on till values are true and return false if value is false   ** & | ^ are bitwise operators
    ||                               -->goes till value is true returns if value is true)    
    !                                -->not            
                                        FALSY VALUE-->return false  
                                        0, “” , false ; null, unefined ; Nan              
                                        TRUTHY VALUE -->return true along with value    
                                        all except falsy)          
                                        EG                                                                                                                
                                        true && “” && true-->return  “ ”                                                                        
                                        1||2||false --> return 1                                                                                    
                                        1 && 2 && “ ” && 3 --> return “”  
          
        
    //INCLUSION OPERATOR
      in                           -->returns true if obj1 is in obj 2                        
                                      Eg let obj ={ x:”hello”,y:2 }  “hello” in obj --> returns true     

    */
    //DATATYES(DATATYPE OP)
    /*
    DATATYPE OPERATOR
    typeof(operand)            -->returns  datatype of operand
    obj instanceOf constructor --> returns true if obj is instance of class
    EG
    const auto = new Car('Honda', 'Accord', 1998); -- returns true if auto is instance of Car
    if(auto instanceof Car)
    */
    //IP OP
    /*
    Ip – don’t know


    Console.log(“string”)  --> takes string only
    */

//)


            /*
            PRIMITIVE TYPE                                REFERENCE TYPE
            var a= object  -->holds object                reftype a = object-->holds reference to object           
                            __________                                        ____________          
                            |  var  a |  ---->Obj                             |  Ref class |   --->  Object
                            |_________|                                       |____________|           
                                


                                    | 
                                    |              **Arrays.eqauals(arr1,arr2)   specific to arrays                                                                                                             
            1.REF TYPE :shared by  ref( var.met() ;  ref-->var1==var2 value-->var1 .equals(var2))              PRIMIRIVE TYPE: shared by  value(var.meth() ; == )
            2.MUTABLE  :change in place (2 applications in eg2)                                                IMMUTABLE :change by forming copy (2 app eg2)
            3.ITERABLE :We can iterate over the object                                                         INITERABLE: convert OR use fns return iterable


            EG1(REF , PRIMITIVE)
            PRIMITIVE TYPE                           (int is primitove so shared by value)
            Int a = 22                  a -----22    
            Int b = 33                  b ------33
            c = b                       c -------33

            REF TYPE                                (Book  is reference  so shared by reference )
            Book b = new Book()    b ------Book()                      
            Book c = new Book()    c ------Book()   reference = 2(b,c)          -> active ref = 2 ;null ref = 0
                                                    Object = 2 (Book() Book())  -> reachable obj = 2 ; abandoned obj = 0

            Book b = new Book()  b ------ Book()                      
            Book c = new Book()  c ------ Book()    reference = 3(b,c,d)        -> active ref = 3 ;null ref = 0
            d = c                d------/           Object = 2 (Book() Book())  -> reachable obj = 2 ; abandoned obj = 0
            (d ref to c)

            Book b = new Book()  b ------- Book()   reference = 2(b,c)           -> active ref = 2 ;null ref = 0
            Book c = new Book()   c  -----/ Book()  Object = 2 (Book() Book())   -> reachable obj = 1 ; abandoned obj = 1
            c = b                                                  
            (c ref to book2 is broken)

            Book b = new Book()    b ------- Book()   reference = 2(b,c)          -> active ref = 1 ;null ref = 1
            Book c = new Book()    c           Book() Object = 2 (Book() Book())  -> reachable obj = 1 ; abandoned obj = 1
            c = b                                |--------null                  
            (c ref to book2 is broken)
            c= null
            (c ref to book1 broken)                  
                        

                        
            Book b = new Book()  b ------ --Book()                      
            Book c = new Book()  c ------/  Book()  reference = 3(b,c,d)          -> active ref = 3 ;null ref = 0
            d = c                d---- /            Object = 2 (Book() Book())    ->reachable obj = 1 ; abandoned obj = 1
            (d ref to c)
            c = b
            (c ref to book 2 is broken)           

            EG2(MUTABLE IMMUTABLE)
            IMMUTABLE
            String  x = “pras”    x ----->pras
            String y = x + “pat”  x----->”pras”         (String is immutable ;  changes by forming copy)
                                Y --->”praspat”


            String x = “pras”     x------>”pras”  
            String y = x          y------/

            y = “pat”                x ------->”pras”  (string  is immutable so change  by  forming copy)
                                    y --------->”pat”
                                                                
            MUTABLE
            int[] arr1 = {1,2,3,4}   arr1  ----->{1,2,3,4}  
            arr1[1] = 5              arr1  ----->{1,5,3,4}  (array  is mutable ;  so  changes in place)



            int[] arr1 = {1,2,3,4}    arr1 ---->{1,2,3,4}   
            int[] arr2 = arr1         arr2 -------/

            arr2[1]  = 5             arr1 -------------{1,2,5,4}   (array   is mutable so change  in place)
                                    arr2 -------------/
            
            EG3(Iterable , initerable)
            for(i in arr)              -->array is iterable hence we can iterate
            for(i in str.toCharArray()) --> string is initerable hence convert to array
            for(keys in maps.keys())      --> maps is initerable so use maps,keys() which retuen array of keys                                                                                                                    

            */
//          |          
//          |
//NUMBER -->PRIMITIVE ; IMMUTABLE ; INITERABLE
/*
let num = 1; 1.0022;( new Number()  is default constructor fn that returns the number literal  22 )

** Calculation with fractional nos are not guaranteed to be precise

1.LOOKUP ,INSERT , SIZE
--

2.SLICING
--
3.FNS
(Math is an object)
Math.max(a,b) -> takes int a  b finds max and returns int     
Math.min(a,b) -> takes int a b finds minand returns int
Math.round(a) ->takes float  rounds it and  returns    int
Math.ceil(a) -> takes double and  ceils  it and  returns    float
Math.floor(a) -> takesdouble  floors  it and  returns    int
Math.sqrt(a) -> takesdouble  squareroots it  and  returns    int
Math.randdom() -> gives random double value bw 0(incl) ,1(excl)
*/

//BOOLEAN -->PRIMITIVE ; IMMUTABLE ; INITERABLE
/*
let bool= true/false

1.LOOKUP ,INSERT , SIZE
--

2.SLICING
--
3.FNS
--
*/


//SYMBOL-->PRIMITIVE ; IMMUTABLE ; INITERABLE
/*
let varname = Symbol() --> Symbol returns a unique value for every call so let s1 = Symbol() ; let s2 = Symbol() s1 !== s2

1.LOOKUP ,INSERT , SIZE
--

2.SLICING
--
3.FNS
--
*/

//NULL, UNDEFINED,NaN,
/*
let varname = null      -->var is  declared and initialised null (null is a obj)  typeOf(null) ->returns object
let varname = NaN       --> var is  declared and initialised NaN (NaN is a obj; usually an err cond instead of valid no eg converting”p” to no)
letvarname = undefined --> var is declared but not initialised (undefined is itself a type)
                        **typeOf(null/NaN/undefined) -->return Object /Object/Undefined
                        **null*2 ; undefined*2 --> return NaN
                        **2+3 +”5” -->return 55
1.LOOKUP ,INSERT , SIZE
--

2.SLICING
--
3.FNS
--
*/

//STRING  -->PRIMITIVE ; MUTABLE;IMITERABLE
/*
let s = “prasann”  (new String()  is default constructor fn that returns the string literal “” )
      = 'prasann'
      = `prasann ${varname}`



1.LOOKUP ,INSERT , SIZE
#lookup
charat(index)/s[index]      --> returns the character at given index
indexOf(“as”)               -->returns first index of character
contains(“as”)              --> returns presence of character      


#insert
s.add()   X     s = s+ “stringorCharactertoAdd”                 -- returns a new string by adding character
s.remove()x     s.replace(“char 1”,”char2” OR ‘RE1’ , ’RE2’ )   -- returns new string replacing 1st occurenc of char1 by char2
            

#size
s.length()                            -> returns length of string



2.SLICING
#slicing
s[index] --> returns character  at index
s.trim(); - returns a new string by removing  whitespace before and after string
s.trimleft()--> returns a new string by trimming all white space before string
s.trimright()--> returns a new string by trimming all white space after string
s.split(‘RE’) – returns a new string by splitting  string at RE not including RE and returns list ofsplitted elements

#concatenate
s = s+ “stringorCharactertoAdd” --> returns a new string by adding character
s = s.concat(s1,s2,…)           -->return a new string by concatenating s1ms2

EG
s = "X-DSPAM-Confidence:    0.8475"
s1 = s.rstrip().split() #s2 is a list seperated by space  not including space([''X-DSPAM-Confidence','0.8475']
s = "i'mSPAMaSPAMlumberjack"
s1  = s.rstrip().split("SPAM")  # string seperated by SPAM not including spam["i'm", 'a', 'lumberjack']


3.FNS
--
*/


//OBJECTS -->REFERENCE ; MUTABLE ; ITERABLE  FOR MEMBERS WHOSE ENUMERATE = TRUE)
/*
let  obj = {key: value ; key : value}; (new bject({key:value}) is default  constructor which returns object literal {})
                         |
                    members   :properties and methods are members
                    properties:keys with value = any primitivre, reference
                               EG : radius :20 OR radius;  (if radius:radius  ie key value same) 
                    methods   :keys with value = fn
                               EG : area:function(){} OR  function(){}

1.LOOKUP ,INSERT , SIZE
#lookup
obj.staticKey /object[dynamicKey]     --> return the value at dynamickey(key not known) , statickKey(key known)
Object.keys(obj)                      --> return  array of keys of instance members whose enumerate = True 
Object.entries(obj)                   --> return arrays of  arrays of key value pair of  instance members whose enumerate = True 
                                           



#insert
Obj.add(obj)       X
Obj.set(index,obj) X
delete obj.member                    --> delete object members
            

#size
--


2. SLICING
#SLICE
object[dynamicKey]                         --> return the value at dynamickey(key not known) 

#COPY
obj2 = {…obj1}                            -->returns new copy object (spreads the elements of object  into individual elements and  put those elements into new object and return new obj

#CONCATENATE 
obj = {...obj1,..obj2}                         -->returns new concatenated obj(spreads the elements of obj1,obj2 into individual elements and  put those elements into new object and return a new obj
obj = Object.assign(target obj,source objects)  -->returns new concatenated object  by copying  all source objects into target object
                                                 EG let circle2 = Object.assign({r:22}, circle)






3.FNS
for(let i in obj ){}             --> i = key1 , key2...
for(let i of Object.keys(obj)){ } --> i = key1 , key2...
for(let i of Obj.entries(obj) ){  }-->i = ["key1","value1" ], ["key2","value2"]

*/


//ARRAY -->REFERENCE ; MUTABLE ; ITERABLE  FOR MEMBERS WHOSE ENUMERATE = TRUE) (OBJECTS WHOSE KEY = IND; VALUE = VALUE)
/*
let   arr = [value1,value2] (new Array() is a default constructor which returns Array Literal [] )
                        |
                        |
                        PIMITIVES ELEMENTS: You can use all methods mentioned below
                        REFERENCE ELEMENTS : For reference elements you can use only array methods in pt 5 






1.LOOKUP ,INSERT , SIZE
#lookup
arr[index]                                                      --> returns element at index
arr.indexof(element, fromindex)/lastindexOf(element,fromindex)-> returns the firstOccurence/lastOccuremce  of the element and searh starts from startindex; if not fond returns -1
arr.includes(element.fromposition )                           --> returns true if array includes element search starting from startindex if indexof(element)! = -1 


#insert
arr.push(elements), arr.unshift(elements)   --> push the elements to front(last) of array, rear(firt) of array
arr.pop() ; arr.shift()                     --> pop and return  the elements to front(last) of array; rear(front) of array





#length
arr.length--> return the length of array



2. SLICING
#SLICE
arr[index];    --> return the value at index
arr.splice(startind, n , elements) -->return new arr by  slicing after start index delete “n” number of items of array(pass 0 if you want to add elements)  and 
                                      after sartindex add elements (don’t pass any argument of you want to remove elements)
arr.slice(startpos,end pos)       --> returns a new array by slicing  array starting from start pos (default = 0)  to end pos excluded (default = last 
                                      index) .primitive elements  values are copid to new array ; reference elements  references are copied to new 
                                      array not the element itsef
#COPY
arr2 = […arr1]                            -->returns new copy arr (spreads the elements of arr  into individual elements and  put those elements into new arr and return new arr

#CONCATENATE
arr = [...arr1,...arr2]                  -->returns new concatenated arr (spreads the elements of arr1,arr2 into individual elements and  put those elements into new arr and return new arr
arr = arr1.concat(arr2)                  ->returns new concatenated arr
arr = arr.join(seperator)                ->return a strrng join the elements of array seperated by seperator 
                                                                                    




3.FNS --> callbackfns passed as arguments can be written in 2 ways  :.function(arg) {body}  OR  (arg)  => {body}
FN TYPES
Consumer function: Takes  argument returns nothing
Supplier function: Takes no arg and returns no  value
Predicate function: Takes arg and returns Boolean
Function function  : Takes argument and returns value	       
      |-UnaryOperatoor:Extends Functuio
      |-Binary Operator: Extends BiFunction

for(let i  in  arr , obj ){}                                                --> i =  index of array ,key(iterate over  both instance ; prototype member whose enumerate = true) of obj

for(let i of arr , obj.keys(obj)  ,obj.entries(obj) ){ }                    --> i = value of array , key of object ,[“key” , value] of object 

array.forEach(Function function(element, index, arr){ operations },thisValue / .bind(value) ) 
                                                                            --> for each iterationin array ;                  
                                                                                element =  element at that iteration ,
                                                                                index(optional) = index of element at that iteration
                                                                                arr(optional) = array itself , 
                                                                                thisValue = value  given to  this inside the function ,  

array.every(Predicate fn(element , index ,arr) {} , thisvalue )             --> for every element in array ,   
                                                                                element to index ,arr , this (same as forEach)
                                                                                as soon the boolean condiion is false  every method returns false 
                                                                                and stops  ; if boolean cond does not retuen false till end the end 
                                                                                then every  method will  return true
                                                                                Eg
                                                                                let arr = [1,2,3,4,5,6,-1,2,3];
                                                                                let allPositive = arr.every(function(element ) {  --> return false at                            
                                                                                    return element >=0                                – 1 ad exit
                                                                                });  

array.some(Predicate fn  (element , index ,arr) { } , thisvalue )           --> for every element in array ,   
                                                                                element to index ,arr , this (same as forEach)
                                                                                as soon the boolean condiion is true  then some  method returns 
                                                                                true  and stops  ; if boolean cond does not retuen true till end the 
                                                                                end   then some method will  return false
                                                                                Eg
                                                                                let arr = [1,2,3,4,5,6,-1,2,3];
                                                                                let atLeastOnePositive = arr.every(function(element ) {  --> return 
                                                                                    return element >=0                                       true at 1 
                                                                                });  


array.filter(Predicate fn  (element , index ,arr) { } , thisvalue )          --> for every element in array ,   
                                                                                element to index ,arr , this (same as forEach)
                                                                                if the boolean returns true  filter adds the  element in new array 
                                                                                and at he end filter method returnsthe  new  array
                                                                                Eg
                                                                                let arr = [1,2,3,4,5,6,-1,2,3];
                                                                                let positivearr = arr.filter(function(element ) {  --> return  
                                                                                    return element >=0                                 [1,2,3,4,5,6,2,3]                     
                                                                                });  




array.reduce(Function fn(accumulator, element) {retrn value} , initialvalue )               --> for every element in array ,   
                                                                                accumulator =  initial value (initial value not given acc = arr[0] by 
                                                                                and  element starts from arr[1] not arr[0])
                                                                                accumulator = return value   
                                                                                at the end the reduce fn returns a value 
                                                                                Eg
                                                                                let arr = [1,2,3,4,5,6];
                                                                                let positivearr = arr.reduce(function(a,ib ) {  --> return  20
                                                                                    return a + b                                          
                                                                                }  , 0);  

                                                                                function occurenceCount(arr, searchElement){
                                                                                    return arr.reduce(function(accumulator , element){
                                                                                        if(element === searchElement)
                                                                                        return accumulator + 1;
                                                                                        else
                                                                                        return accumulator;
                                                                                    },0);
                                                                                }






arr.sort()                                                                  --> if compareFunction is not supplied, all non-undefined array 
                                                                                elements are sorted by converting them to strings and comparing 
                                                                                strings in UTF-16 code units order. For example, "banana" comes before 
                                                                                "cherry". In a numeric sort, 9 comes before 80, but because numbers 
                                                                                are converted to strings, "80" comes before "9" in the Unicode order.
                                                                                 All undefined elements are sorted to the end of the 


array.sort(Predicate fn(a,b){ }))                                         --> Sort the array according to compare fn  
                                                                                give 1st element to a , second to b sort them acc to boolean 
                                                                               consition and sort  array in place  and return void
                                                                                EG
                                                                                let arr = [4,3,2,1]
                                                                                arr.sort(function(a,b){       OR    arr.sort((a,b) => a-b)--> ascending
                                                                                    if(a < b) return -1;                                      can be done if a b are numbers    
                                                                                    if(a   >b) return 1;
                                                                                    If(a === b) return 0;
                                                                                }
                                                                                .reverse() --> descending
                                                                                EG
                                                                                let arr = [{id:1 , name :”prasann”} , {id:2 , name: “patil”}] 
                                                                                arr.sort(function(a,b){  
                                                                                    if(a name.toUppercase() < b.name.toUppercase()) return -1;
                                                                                    if(a name.toUppercase()  >b.name.toUppercase()) return 1;
                                                                                    If(a. name.toUppercase() === b. name.toUppercase()) return 0;
                                                                                    }
                                                                                .reverse() --> descending
   



arr.find(functin(element) {                                                 --> for every element in array ,      [use for  reference  elements]
              return booleancondition;                                          give elements to element and as soon as boolean cond returns tue 
                  } );                                                          find method returns  the element at that pos ; if boolean returns 
                                                                                nothing till ed find method returns undefined
                                                                                EG
                                                                                let arr = [{a:1,b:2}, {c:3,d:4}];
                                                                                let obj = arr.find(function(element){
                                                                                    return element.a === 1;
                                                                                });
                                                                                console.log(obj);->{a:1,b:2}




EXAMPLE
//All movies in 2018 with rating > 4; sort them by rating in desc order ;pick their title--   
const movies = [                                    >op 'b' 'a'
    {title:'a',year:2018,rating:4.5},
    {title:'b',year:2018,rating:4.7},
    {title:'c',year:2018,rating:3},
    {title:'d',year:2017,rating:4.5},
]

let a = movies
        .filter((element) => {return element.year === 2018 && element.rating >4})
        .sort((a,b)=>{return a.rating - b.rating})
        .reverse()
        .map((element) => {return element.title});

*/


/* #endregion */



//EXCEPTION
/* #region Main */

//(
    /*
    EXCEPTOPN --> Method  throws exception; exception  goes down stack to find  exception handler  . So when eexception handler not found till               
                end then java gives the stack trace in  err window (method on top ofstack wghich throws err wrtten 1st , method below it 2nd) 
    Eg
    Public class  Animal{
        public static void barker()[
            bark(null)}
        public  stativ void bark(String name){
        Sout(name.toUppercase();)}}

    Public class main{
    Public statoic vod main(String[] args){
            Animal.barker()}}

    Bark   -> Bark Throws exception no handler found , exception  goes to barker no handler found  , goes to main no handler found      Exceprion at Java.Animal.Bark ExceptionType (Link to bark)
    Barker    Exceprion at Java.Animal.Barker ExceptionType (Link to Barker)
    Main      Exceprion at Java.Animal.Main  ExceptionType (Link to Main)
    */
//)


//EXCEPTION CLASS
/* 
a.INBUILD EXCEPTIONS CONSTRUCTOR FUNCTIONS
Load time errors: Errors which come up when loading a web page like improper syntax errors are known as Load-time errors and it 
                generates the errors dynamically.
Run time errors: Errors that come due to misuse of the command inside the HTML language.
Logical Errors: These are the errors that occur due to the bad logic  performed on a function which is having a different operation.

b.USER DEFINED EXCEPTION CLASS
 */    

//EXCEPTIN HANDLING:
/*
1.Function throws exception automatically
functionnamename(){
    let  f = new FileReader()  }  -->wrap in try catch finally block    so the exception will be handled there  itself and will not travel down the 
                                    stack   to find  exception handler
                                    functionnamename (){
                                    try{
                                        FileReader f = new FileReader()}   --> throws new CheckedException()
                                        
                                    Catch(e){                               --> e = new Objecttype()    
                                        e.method()}                                                      
               
2.If function throws  exc because you throw new exception()-->DON’T WANT  AUTOMATIC  EXC                                                                                       
functionname(){                                                        
            throw new Error();}     --> Make fn  throws Excption () so exception  is not   handed here so it will   travel down the 
                                       stack and wrap the method call in try catch finally block
                                       fnname1() throws Exception(X dont do throws EXC) {
                                            throw new Exception () }} --> throws new Exception()
                                        fnname2()
                                            try{
                                                fnname1()}                      --> throws new Exception()
                                            catch(e){                          --> catch e =  new Exception()                    
                                               }
*/

/* #endregion */



//CONDITIONAL
/* #region Main */

//IF
/*
(True = condition satisfied / non zero or non empty)
If(condition){                                                  
}                                                                                                                   
elseif(condition){           	                                                  |
}          |	                                                                  |                                                                                                                                     
else{      |                                                                   GLOBAL , LOCAL
           |                                                                   Variables inside loops are local to that loop
}          |                                                                                                              
           |	                                                               MOST GENEROC LOOP ON TOP
        |	                                                                   if (a%5 ==0 && a%3 == 0) -> must be on top if on 
                                                                               elseIf (a%3 ==0)            bottom  it will never be
                                                                               else(a%5 ==0)               encountered     
true , false -> return true , false                                                                                             
object -> retuen true if element of obj Is true  [non zero/ non empty]                                       
obj1 operator  obj2 -> return true, false acc to operator
               |                                                                                                                                                    
               |
        COMPARISION OP, LOGICAL OP , INCLUSION OP ,DATATYPE OP : LOOK IN OBJECTS
        ARITHMETIC OPERATOR : +(overloaded for int , string) ,- , * , / , % , ^  
        INCREMENT/DECREMENT : x = x +1 ; x += x ; x++ ; ++x
                                                                    


SIMPLIFYING IF
1.TERNARY(we can do only assignment in ternary and not execution like printing etc)
String a;                           -->  int  b; String a =   (b < 30 ) ? “less” : “more”
if (b < 30){ a =  “less”}
else{s = “more”}

2.SWITCH(you can take only = condition and not other conditions like <, > ……. )
String a ;                       -->  String a
if (a = “prasann” )                   switch (a)
{                                     {
      Sout(“name ”)                    case “prasann”:
}                                        sout(“name”);
                                         break ;
else if (a = “pradeep”)                case  “pradeep”:
{                                         sout(“father’);
   Sout(“father”)                          break ;
}                                                 
else{                                  defaultL sout(“xyz”)
  sout(“xyz”)
}


3.HARDCODE VALUE:     
Int temp = 30;      --> int temp = 30;      --> a = (temp == 30)
boolean a                   boolean a = false
If (temp == 30)          if (temp == 30)
{ a = True}                 a = True;                                  
else
{a = false}
*/

 
//WHILE(Usually used as outerLoop with break, continue)
/*
While(condition)
{               |
}               |
                 |
        SAME AS IF
*/

//DO WHILE(Usually used as outerLoop with break, continue)
/*
do
{
}while(condition)
              |
              |
              |
        SAME AS IF
*/

//FOR
/*
FOR
for(let i = 0 ; i <= 2; i++){ }

FOR –IN
for(let i  in  arr , obj ){}  --> i =  index of array ,key(iterate over  both instance ; prototype member whose enumerate = true) of obj



FOR-OF
for(let i of arr , obj.keys(obj)  ,obj.entries(obj) ){ }--> i = value of array , key of object ,[“key” , value] of object 



FOR-EACH
array.forEach(  function(element, index, arr){ operations }  ,   thisValue / .bind(value) ) --> for each iterationin array ;                  
                                                                                                element =  element at that iteration ,
                                                                                                index(optional) = index of element at that iteration
                                                                                                arr(optional) = array itself , 
                                                                                                thisValue = value  given to  this inside the function ,  
*/


//BREAK, CONTINUE
/*
break --> stop at certsin iteration and jump out of loop block
continue --> skip certain cond and jump  to start of loop 
*/


/* #endregion */


//JS NODE MODULES
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






