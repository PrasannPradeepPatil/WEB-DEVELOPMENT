//FUNCTION



//FUNCTION DECLARATION(FN ARE OBJECTS)
/* #region Main */

//NORMAL FN,AFRROW FN,EXPRESSION FN
/*
//NORMAL FN(HOISTED TO TOP)
async function fnName(param){}                      -->Declare fn which returns a fnObj; call fn which returns a fnObj
fnName(arg)                                            (this inside fn = windows/global obj)


async function fnName(param){}                      -->Declare fn which returns a fnObj; call fn which returns a fnObj + new  which returns another fnObj
let fnObj = new fnName(arg)                           (this inside fn = object returned by fn = fnObj)




//EXPRESSION FN(NOT HOISTED TO TOP)
let fnObj = async function fnNameOptional(param){} -->Declare fn which returns a fnObj ;Call fnObj
fnObj(arg)                                           (this inside fn = windows/global obj)

let fnObj = async function fnNameOptional(param){} -->Declare fn which returns a fnObj ;Call fnObj + "new" which returns another fnObj 
let fnObj2 = new fnObj(arg)                          (this inside fn = object returned by fn= fnObj2)

//AFRROW FN(NOT HOISTED TO TOP)
let fnName = async(params) =>{}                     -->Declare fn which returns a fnObj ;Call the fnObj
fnName(arg)                                             (this inside fn = windows/global obj)


let fnName = async(params) =>{}                     -->XX cant do this for arrow fn 
let fnObj2 = new fnObj(arg)                                    




EG 1(NORMAL FN):
function sum1(a,b){       -->Declare Fn
    return a+ b;
}
const obj = {
  name:"pras",
  sum : sum1(1,2),      -->Call Fn
};
console.log(obj.sum);

EG 2(EXPRESSION FN):
a,b,c, -->Same as arrow fn just replace arrow fn with expression fn

EG 3(ARROW FN):
a.
let  sum1 = (a,b) =>{return a+b;}    -->Declare fn which returns a fn stored in variable(sum1)
const obj = {
  name:"pras",
  sum : sum1(1,2),                  --> Call the var as fn(sum1(1,2))
};
console.log(obj.sum)

b.
const obj = {
  name:"pras",
  sum : (a,b) =>{return a+b;},        -->Declare fn which returns a fn stored in variable(sum)
};
console.log(obj.sum(1,2));            -->Call the var as fnn(sum(1,2))
                                         

c.
Look in ASYNCHRONOUS FN (CALLBACK),ASYNCHRONOUS FN (PROMISET USING THEN-CATCH),ASYNCHRONOUS FN (PROMISET USING ASYNC AWAIT),
WEBDEVELOPMENT--clientI, server folders 
               










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
    callBackFn(arg) ;                         -->Call the var as fn(callBackFn(callBackParam))
}

//CALLING ASYNCHRONOUSFN  
asyncFnName (fnArg , (param)=>{                -->declare Fn which returns a fn stored in variable(callBackFn)
            console.log();                              SO
            });                                         start executing code of asyncFnName and start executing code after asyncFnName  
Console.log(“code after calling the asynchronous fn ”)  after executing code of asyncFnName  execute callback fn with  param = arg

                                                        
*/

//ASYNCHRONOUS FN (PROMISE USING THEN-CATCH)
/*
//DECLARING ASYNCHRONOUS FN THAT RETURNS PROMISE 
let promiseName = function asyncFn(fnParam) {    -->1.Declare fn that returns a fn as promise and store it in var(asyncFnName)
    code of asyncFnName                                   
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1 )                       -->4.Call the var as fn(resolve(arg1) ie param1 = arg1)
            reject(arg2)                              Call the var as fn(reject(arg2) ie param2 = arg2)
    });
      
}

//CALLING ASYNCHRONOUSFN  
promiseName(fnArg)                                  -->2.Call the promise as fn(asyncFnName(fnArg));apply then,catch on the returned promise                               
        .then((param1)=>{console.log(param1)})      -->3.declare a fn inside then  which returns a fn which is stored in variable(resolve)  
        .catch((param2) => {console.log(param2)})        declare a fn inside catch which returns a fn which is stored in variable(reject)  
                                                            
                                                         SO
                                                         start executing code of asyncFnName and start executing code after asyncFnName
                                                         after executing code of asyncFnName  it returns a promise  
                                                         if promise sucessful execute then with param1 = arg1 of resolve
                                                         if promise  failded execute catch with param2 = arg2 or reject





                                                       
*/

//ASYNCHRONOUS FN (PROMISET USING ASYNC-AWAIT)
/*
//DECLARING ASYNCHRONOUS FN THAT RETURNS PROMISE 
function asyncFnName(fnParam) {                      -->1.Declare fn that  returns a fn as promise
    code of asyncFnName                                  
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1)                        
            reject(arg2)                          
    });
      
}
//CALLING ASYNCHRONOUSFN  
async function fnName(){                                          
    try{
       const param1 = await asyncFnName(fnArg);   -->2.Apply try catch on promise                       
     }                                              param1 gets arg1    
    catch(param2){                                  param2 gets arg2
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
let promiseName = function asyncFnName(fnParam) {    -->Fn return promise
    code for Fn 
    return new Promise ((resolve,reject)=>{ 
            resolve(arg1 )                               
            reject(arg2)                               
    });     
}
OR
Promise promiseName = new Promise((resolve,reject) =>{  -->return promise 
    resolve("foo");
    reject("bar");
});

promiseName(fnArg)                              -->we apply then,catch on Promise                                              
        .then((param1)=>{console.log(param1)})              
        .catch((param2) => {console.log(param2)})     



//Promise.resolve()
let promiseName = function asyncFnName(fnParam) {    -->Fn return promise
    code for Fn                                    
    return  Promise.resolve(arg1);
}
OR
const promiseName =  Promise.resolve(arg1);

promiseName(fnArg)                                ->we apply then,catch on the fn which returns Promise                                                   
        .then((param1)=>{console.log(param1)})     (as we use Promise.resolve()) we can only use then)           
          
//Promise.reject()
let promiseName = function asyncFnName(fnParam) {    -->Fn return promise
    code for Fn                                    
    return  Promise.reject(arg1);
}
OR
const promiseName =  Promise.reject(arg1);

promiseName(fnArg)                                ->we apply then,catch on the fn which returns Promise                                                   
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


