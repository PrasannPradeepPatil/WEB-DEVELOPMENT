//FILEPATHS
/* 
//WINDOWS
ABSOLUTE PATH : dir\dir \filename --> if this path is used in a string supress or else it will count as special char EG cd C:\Users\DELL\Desktop ;let fs = require(“C:\\Users\\DELL\\Desktop")
RELATIVE PATH : ./dir/filename   --> . = pwd ; .. = parent directory


//LINUX
ABSOLUTE PATH : dir/dir /filename  
RELATIVE PATH : ./dir/filename   --> . = pwd ; .. = parent directory ; ~ = /home 
*/

//ENVIRONMANT VARIABLE  -->REQ TO ADD WHENEVER YOU INSTALL APPLICATION
/*         
//WINDOWS 
>Add to envvar --  varname pathOfFile             --> set env var(set PATH directly "OR" set specific var and then add that var to set PATH ) to filepath(your file ) 
                   PATH    path1;path2;%varname%      
                   PATH path1;path2;pathOfFile        



//LINUX
>export varname=filepath                           --> set env var(specific var) to filepath(your file)
>echo $varname                                     --> echo env var

EG:LOOK IN JAVA,PYTHON 

*/



//#########################################################################################################################################################//
//#########################################################################################################################################################//

//CONFIGURE GIT ,CONFIGURE SSH KEYS 
/*
//CONFIGURE GIT
git config --global user.name "Prasann Patil"                    -> configure your git name  and email
git config --global user.email “prasannpatil98@gmai.com”         so your commits will be visible by this username and gmail


//CONFIGURE SSH KEYS
ssh-keygen -t ed25519 -C prasannpatil98@gmail.com keep pon pressing enter -->this  will save your key on a path ; in op search “yourr public 
                                                                             key saves ap path”  copy this path
cat path                                                                  --> create a file on this path which will generate ssh key copy this 
                                                                             ssh key  all until .com
You can do this on  account level for all repo ( profile me click karke dropdown me settings ) 
OR repo  level  only  for that repo but the repo must be private (setting gear sign   above project)
go to settings -->SSH and GPC keys --> new ssh key -->
Title: PrasannPatil Desktop
Key:paste the key and press generate key
*/

//LOCAL REPOSITORY COMMANDS
/*                                                                                                                                    
git init                      --> created a .git file inside the current folder (look in .git and .gitignore)            
touch .gitignore              --> create a .gitignore inside the current folder(look in .git and .gitignore)   
git add branchname            --> add a branchname; branch will share 1st commit with its parent 
git checkout destinationBranch--> move to destinationBranch ka latest commit node
git checkout -b destinationBranch-->create and  move to destinationBranch ka latest commit node
git merge destinationBranch   --> merge the dest branch ka latest commit node with the current branch ka latest commit node;resolve the merge conflicts in VS code
git add foldername            --> add the folder   in current branch ka current commit node to staging area ((github(.)/gitlab(*) = All files ))
git commit –m “message ”      --> move to  current  branch  ka next commit node and commit the files in staging area 


git log     --> logs all the commits of current branch
git status -->status of which changes have been staged and which have not of current branch


Eg
git add *                        0                           |master|
git commit –m “commit1”          commit1
                                 head
  
git add *                        0 ----------->O              |master|
git commit –m “commit2”          commit1        commit2
                                                head

                                                              |prasann|                        
git branch prasann              0 ----------->O               |master|
                                commit1      commit2
                                             head

                                                     
                                head                                |prasann|                        
git branch prasann              0 ----------->O                     |master|
                                commit1        commit2
                                                                                  
                                    _______O                       |prasann|
                                  /        commit2
                                 /         head              
git add *                       0 ----------->O                     |master|
git commit –m “commit2”        commit1        commit2


                                  _______O                           |prasann|
                                 /      commit2
                                /                              
git checkout master             0 ----------->O                      |master|
                               commit1        commit2
                                               head  



                                  _______O                            |prasann|
                                 /       commit2
                                /                              
git commit –m “commit3”         0 ----------->O ------------------>0  |master|
                              commit1        commit2          commit3
                                                              head  

                                  _______O ___________                    |prasann|
                                 /   commit2         \
                                /                      \
git commit –m “commit3”         0 ----------->O --------->0               |master|
                               commit1        commit2     commit3
                                                          head  
*/

//GITHUB REPOSITORY COMMAND
/*
git remote add origin httpURL(config key not needed)/sshUrl(configure ssh key)  --> In .git file set origin= ssh
git push origin branchName                                                      -->Push the  localRepo branchName  to githubRepo  same branchName(CREATE BRANCH ON GITHUB --GUI)
git clone  httpURL(config key not needed)/sshUrl(configure ssh key)             --> Pull  from githubRepo master branch   to localRepo master branch
git pull origin branchName                                                      --> Pull  from githubRepo brancName  to localRepo  same branchName (CREATE BRANCH ON LOCAL --git branch bn) 
*/

//SERIES OF COMMANDS
/*
a.Configure git, configure ssh keys
configure git (only once)
configure ssh keys(only if you use ssh keys)


b.Pull from github
git clone https://gitlab.com/FlairLabs/Clients/idfy/live-desk/live-desk-listener.git
cd live-desk-listener
git checkout -b branchName  (-b for creating a new branch 1st time)   
git remote add origin httplink  (only once)
git pull origin branchName

c.Push on github
git init         (only once)
touch gitignore  (only once)   
git checkout -b branchName  (-b for creating a new branch 1st time)             
git add  .
git commit -m "Initial commit" 
git remote add origin sshLink  (only once)
git push origin branchName


*/


//.GIT ,.GITIGNORE,README.MD
/*

INITIALISE .GIT , .GITIGNORE
.git must be initialised inside the root folder which is converted to repository so everything inside that root folder will be pushed to github re[ository]
.gitignore must be initialised  inside the root folder as it requires a .git file 
 README.md must be initialised  anywhere 


INSIDE .GIT, 
.git handles all the branches , commits etc for the folder

INSIDE .GITIGNORE(https://git-scm.com/docs/gitignore)
.gitognore ignorres all the folders and files ; 
/        = directory seperator; 1st / is current directory   
*        = match all characters

NOTE:"gitignore is used only for files that are not already staged" 

INSIDE README.MD(https://medium.com/@saumya.ranjan/how-to-write-a-readme-md-file-markdown-file-20cb7cbcd6f)
README.md is used as a documentation
#,##             --h1 heading ; h2 heading and so on
'''languageName  --code specific to languagename can be written inside like python,javascript rtc
  code
'''
'code'           --any code 


 */