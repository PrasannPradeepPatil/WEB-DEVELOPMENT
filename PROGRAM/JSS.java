



//CHANGING THIS
/*
https://medium.com/@omergoldberg/javascript-call-apply-and-bind-e5c27301f7bb

1.fnname(arg1 , arg2)                                                        --> In fn this = whatever it is 
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
                            this.tags.forEach(function (tag){                   --> this in method --> this = video {}
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


//FUNCTION DECLARATION-- PARAMETER ; ARGUEMENT 
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


//MISCALLENOUS
/* #region Main */

//FACTORY FN AND CONSTRUCTOR 
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
//FUNCTION(ObjectBase Prototype --> FunctionBase Prototype -->  Function)
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
//CLASS(ObjectBasePrototype -->ClassBase Prototype -->Class)
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
//ARRAY(ObjectBase Prototype --> ArrayBase Prototype -->  Array)
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



//FUNCTIONS ARE OBJECTS
/*
Circle.name             --> returns name of fn  ie circle
Circle.length           --> returns number of arg of fn ie 3
Circle.constructor      --> returns constructor fn object used to build fn object   ie  ƒ Function() { [native code] }
Circle.call({} , 1,2,3) --> returns new Circle(1,2,3)  and {} referennces to this
Circle.apply({} , [1,2,3])--> return new Circle(1,2,3); and {} references to this 

*/

//INBUILT CONSTRUCTOR
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




