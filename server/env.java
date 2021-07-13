/*
//SET ENV VAR
>export/set VAR_NAME=value  //linux/windows  
OR
.env               -->gitignore .env because to some variables must be kept private like mongodb url              
VARNAME = value
.env.example       -->gitignore not .env.exampe because it will show user the variables to include 
VARNAME = valueHint

//USE ENV VAR
var dotenv = require('dotenv');              //sudo npm install (while project creation)
dotenv.config();
process.env.VAR_NAME                        


*/