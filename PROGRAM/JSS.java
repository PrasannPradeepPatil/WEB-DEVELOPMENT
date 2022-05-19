


//FUNCTION DECLARATION(FN ARE OBJECTS)
/* #region Main */

//NORMAL FN,AFRROW FN,EXPRESSION FN
/*

fnObj   :f fnName() OR f () if we do not have fnName 
objOfFn :fnName() {member1:valu1,member2:value2 only members declared with this}

//NORMAL FN(HOISTED TO TOP)
async function fnName(param){}                      -->Declare fn which returns a fnObj
fnName(arg)                                         -->call fnObj which returns value  


async function fnName(param){}                      -->Declare fn which returns a fnObj
let objOfFn = new fnName(arg)                       -->call fnObj + new which returns objOfFn     



//EXPRESSION FN(NOT HOISTED TO TOP)
let fnObj = async function fnNameOptional(param){} -->Declare fn which returns a fnObj
fnObj(arg)                                         -->Call fnObj which returns a value  

let fnObj = async function fnNameOptional(param){} -->Declare fn which returns a fnObj
let objOfFn = new fnObj(arg)                        -->Call fnObj + "new" which returns ObjOfFn  


//AFRROW FN(NOT HOISTED TO TOP)
let fnName = async(params) =>{}                     -->Declare fn which returns a fnObj 
fnName(arg)                                         -->Call the fnObj which returns value  

let fnName = async(params) =>{}                     -->XX cant use new for arrow fn for arrow fn 
let objOfFn = new fnObj(arg)                             
                                                         
                                                                                                                
EG 1(NORMAL FN):
function sum(a,b){       -->Declare Fn which returns a fnObj(f sum())
    return a+ b;
}
const obj = {
name:"pras",
sum1 : sum(1,2),        -->Call fnObj which returns a value(3)
};
console.log(obj.sum1);

EG 2(EXPRESSION FN):
a,b,c, -->Same as arrow fn just replace arrow fn with expression fn

EG 3(ARROW FN):
a.
let  sum = (a,b) =>{return a+b;}    -->Declare fn which returns a fnObj(f sum())
const obj = {
name:"pras",
sum1 : sum(1,2),                  --> Call fnObj which returns value(3)
};
console.log(obj.sum1)

b.
const obj = {
name:"pras",
sum : (a,b) =>{return a+b;},        -->Declare fn which returns fnObj(f sum())
};
console.log(obj.sum(1,2));            -->Call fnObj which returns value(3)
                                        

c.
Look in ASYNCHRONOUS FN (CALLBACK),ASYNCHRONOUS FN (PROMISET USING THEN-CATCH),ASYNCHRONOUS FN (PROMISET USING ASYNC AWAIT),

*/

//SYNCHRONOUS FN
/* 
//SYNCHRNOUS FN
function synchronousFnname(arg){
     Synchronous task;
}

//USING SYNCHRONOUSFN
synchronousFnname(par)                                   -->Start and complete  syncFn then execute code after syncFn 
Console.log(“code after calling the synchronous fn ”)
*/

//ASYNCHRONOUS FN (CALLBACK)
/*
//DECLARING ASYNCHRONOUSFN
function asyncFnName (fnParam,callBackFn) {
    code for Fn
    callBackFn(arg) ;                                 -->2.Call fnObj stored as variable callBackFn and give arg to param
}

//CALLING ASYNCHRONOUSFN  
asyncFnName (fnArg , (param)=>{                        -->1.declare fn  which returns a fnObj which is passed to variable callbackFn
            console.log();                              SO
            });                                         start executing code of asyncFnName and start executing code after asyncFnName  
Console.log(“code after calling the asynchronous fn ”)  after executing code of asyncFnName  execute callback fn with  param = arg

                                                        
*/

//ASYNCHRONOUS FN (PROMISE USING THEN-CATCH)
/*
//DECLARING ASYNCHRONOUS FN THAT RETURNS PROMISE 
let promiseName = function asyncFn(fnParam) {    -->1.Declare fn that returns a fnObj as promise
    code of asyncFnName                                   
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1 )                       -->4.Call fnObj stored in resolve and give arg1 to param1
            reject(arg2)                              Call fnObj stored in reject and give arg2 to param2
    }); 
      
}

//CALLING ASYNCHRONOUSFN  
promiseName(fnArg)                                  -->2.Call the fnObj ie promise(asyncFnName(fnArg));apply then,catch on the returned promise                               
        .then((param1)=>{console.log(param1)})      -->3.declare a fn inside then  which returns a fnObj which is passed to variable resolve 
        .catch((param2) => {console.log(param2)})        declare a fn inside catch which returns a fnObj which is passed to variable reject  
                                                            
                                                         SO
                                                         start executing code of asyncFnName and start executing code after asyncFnName
                                                         after executing code of asyncFnName  it returns a promise  
                                                         if promise sucessful execute then with param1 = arg1 of resolve
                                                         if promise  failded execute catch with param2 = arg2 or reject





                                                       
*/

//ASYNCHRONOUS FN (PROMISET USING ASYNC-AWAIT)
/*
//DECLARING ASYNCHRONOUS FN THAT RETURNS PROMISE 
function asyncFnName(fnParam) {                      -->1.Declare fn that  returns a fnObj as promise
    code of asyncFnName                                  
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1)                            -->4.Call fnObj stored in resolve and give arg1 to param1              
            reject(arg2)                                Call fnObj stored in reject and give arg2 to param2
    });
      
}
//CALLING ASYNCHRONOUSFN  
async function fnName(){                                          
    try{
       const param1 = await asyncFnName(fnArg);   -->2.Apply try catch on fnObj ie promise                       
     }                                               3.Step 3 happens internally and params get arg directly
    catch(param2){                                 
        console.log(param2);                 
    }
}
fnName();
Console.log(“code after ”)                      SO
                                                start executing code of asyncFnName and "wait"
                                                after executing code of asyncFnName  it returns a promise  
                                                if promise sucessful execute then with param1 = arg1 of resolve
                                                if promise  failded execute catch with param1 = arg2 of rjecr
                                                Start executing code after asyncFnName
                                                NOTE: await keyword can be used only if it is wrapped inside async fn 




                                                        
*/

//PROMISE
/*
//Promise promise = new Promise((resolve,reject))
let promiseName = function asyncFnName(fnParam) {    -->Declate Fn return fnObj as promise
    code for Fn 
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1 )                               
            reject(arg2)                               
    });     
}
OR
Promise promiseName = new Promise((resolve,reject) =>{  -->return promise  directly
    resolve("foo");
    reject("bar");
});

promiseName(fnArg)                                    -->apply then,catch on foObj ie Promise                                              
        .then((param1)=>{console.log(param1)})              
        .catch((param2) => {console.log(param2)})     



//Promise.resolve()
let promiseName = function asyncFnName(fnParam) {    -->Declate Fn return fnObj as promise
    code for Fn                                    
    return  Promise.resolve(arg1);
}
OR
const promiseName =  Promise.resolve(arg1);         -->return promise  directly

promiseName(fnArg)                                  -->apply then,catch on the fnObj ie Promise                                                   
        .then((param1)=>{console.log(param1)})       (as we use Promise.resolve()) we can only use then)           
          
//Promise.reject()
let promiseName = function asyncFnName(fnParam) {   -->Declate Fn return fnObj as promise
    code for Fn                                    
    return  Promise.reject(arg1);
}
OR
const promiseName =  Promise.reject(arg1);         -->return promise  directly

promiseName(fnArg)                                ->apply then,catch on the fnObj ie Promise                                                    
        .carcg((param1)=>{console.log(param1)})     (as we use Promise.reject()) we can only use catch)               


//Promse.all()
Promise.all([P1,P2,P3]              Collect all promises in an array
             .then((results) => {})  If all promises resolve hence then is executed and results= [arg1,arg2,arg3] of resolve  
             .catch(results) =>{})   If even 1 promise rejects hence catch is executed and results= [arg1,arg2,arg3] of reject  

EG1:
const p1 = new Promise((resolve, reject) => {
    console.log('The first promise has resolved');
    resolve(1);
    reject(10);
});
const p2 = new Promise((resolve, reject) => {
    console.log('The second promise has resolved');
    resolve(2);
    reject(20);
});
const p3 = new Promise((resolve, reject) => {
    console.log('The third promise has resolved');
    resolve(3);
     reject(20);
});

Promise.all([p1, p2, p3])                      
.then((results) => {console.log(results);})   -->All promises resolve  hence then is executed and results= [1,2,3] 
.catch((results) => {console.log(results);});    OP
                                                The first promise has resolved
                                                The second promise has resolved
                                                The third promise has resolved
                                                Results: 10,20,30
                                                Total: 60

EG2:
const p1 = new Promise((resolve, reject) => {
    console.log('The first promise has resolved');
    resolve(1);
    reject(10);
});
const p2 = new Promise((resolve, reject) => {
    console.log('The second promise has rejected');
    reject(20);
});
const p3 = new Promise((resolve, reject) => {
    console.log('The third promise has resolved');
    resolve(3);
    reject(30);
});

Promise.all([p1, p2, p3])
.then((results) => {console.log(results);})
.catch((results) => {console.log(results);});-->1 promise rejects hence catch is executed and results = [20]


*/


/* #endregion */


//FUNCTION(FN ARE OBJECTS)
/* #region Main */

//function fnName extend(Child , Parent){ -->CAMEL CASE
        //MEMBERS,THIS(BASED ON OBJ OF FN) 
        /*
        member=objOfFn having values of this used for acessing members of fn 
        this  =objOfFn 
              =parent objOfFn/obj(EG 6) if fn doesnt have obOfFn(default parent is window obj/global obj OR undefinded('use strict' sets value of this to undefined to prevent updation of window obj) )

        EG1:
        function calculate(){           -->declare fn which returns fnObj(f calculate())
            console.log(this)              //this = parent objOfFn as fn doesnt have objOfFn  = Window {}/global {} OR undefined
            let val = 111;
            let sum  = function(a,b){
                console.log(this);         //this =  parent objOfFn as fn doesnt have objOfFn   = Window {}/global {} OR undefined
                return a+b;
            }
        }
        let calculate1 = calculate(); -->call fnObj which returns val(3)
                                         members cant be acessed as objOfFn is not present


        EG2:
        function calculate(){           -->declare fn which returns fnObj(f calculate())
            console.log(this)              //this = parent objOfFn as fn doesnt have objOfFn  = Window {}/global {} OR undefined 
            this.val = 111;
            this.sum  = function(a,b){
                console.log(this);         //this = parent objOfFn as fn doesnt have objOfFn = Window {}/global {} OR undefined 
                return a+b;
            }
        }

        calculate();                 -->call fnObj which returns val(3) 
                                         //members cant be acessed as objOfFn is not present   


        EG3:
        function calculate(){           -->declare fn which returns fnObj(f calculate())
            console.log(this)             //this = objOfFn  = calculate1 = calculate {} 
            let val = 111;
            let sum  = function(a,b){
                console.log(this);        //this = parent objOfFn as fn doesnt have objOfFn    = calculate1 = calculate {} 
                return a+b;
            }
        }

        let calculate1 = new calculate(); -->call fnObj + new which returns objOfFn(calculate1 = {} )
                                             //members cant be acessed as objOfFn is  present but doesnt have values
        
        EG4:
        function calculate(){                   -->declare fn which returns fnObj(f calculate())
            console.log(this)                     //this =  objOfFn  = calculate1 = {val:111, sum:f ()}  
            this.val = 111;
            this.sum  = function(a,b){
                console.log(this);                //this = parent objOfFn as fn doesnt have objOfFn  = calculate1 = calculate {val:111, sum:f ()}  
                return a+b;
                }
            }
        }
        let calculate1 = new calculate();    -->call fnObj + new which returns objOfFn  (calculate {val:111, sum:f ()} )  
        calculate1.val;                        //members can be acessed as objOfFn with this values present
        calculate1.sum(1,2); 
            
        
        EG5:
        function calculate(){                -->declare fn which returns fnObj(f calculate())
            console.log(this)                      //this =  objOfFn  = calculate1 = calculate {val:111, sum:f ()}  
            this.val = 111;
            this.sum  = function(a,b){
                console.log(this);                //this = objOfFn  = sum1 = sum {}
                return a+b;
                }
        }
        
        let calculate1 = new calculate();     -->call fnObj + new which returns objOfFn(calculate {val:111, sum:f ()})   
        let sum1 = new calculate1.sum();        sum1 = {sum: f()}
        calculate1.val;                         members can be acessed as objOfFn with this values present
        calculate1.sum(1,2); 
 
       

        EG6
        function sum(){                    -->declare fn which returns fnObj(f sum())
            console.log(this);
            let video = {
                tittle:"pras",
                play:function(){
                    console.log(this);      //this = parent obj as fn doesnt have objFn= video{title:"pras",play:f ()}}
                }
            }

            return video;
        }

        let sum1 = sum();               -->call fnObj which returns value(video{title:"pras",play:f ()})
        sum1.play();
        */
        
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



        //MEMBER
        /*
        
        */


        //CHILD , PROTOTYPE
         /*
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




*/

         ////INSTANCE MEMBERS////  --->THese members belong to Circle fn  
         //INITIALISE
         /*
         let   angle = 20;    --> private scope : they are available inside fn only  ie let c = new Circe() c.member cant
                                                  closure :  member can be acesse as members  inside  this.methodname:fn() and  let methodname:fn())
         this.radius = radius; -->public scope : they are available outside fn only ie let c = new Circe() c.member cant
                                                 closure : member can be acessed  as this.member inside this.methodname:fn() and not inside methodnname:fn())
         */                     
         //GETTER , SETTER (USING THIS)-->you need to call method let c1 = new Circle() c1.getAngle() ; c1.setAngle() = 22
         /*
         this.getAngle = function(){        (declare a expression fn)           
            return angle;}

         this.setAngle = function(value){   (declare a expression fn)             
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
                                              (declare a expression fn )

        this.calculate = function(){     --> public scope : they are available outside fn only ie let c = new Circe() c.member cant
                let ar = area();             closure : member can be acessed  as this.member inside this.methodname:fn() and not inside method:fn())
                let ch = chord();            (declare a expression fn )
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
