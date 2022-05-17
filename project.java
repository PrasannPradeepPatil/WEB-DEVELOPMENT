//INSTALL MONGODB(WINDOWS , LINUX)
/*


//INSTALL  MONDODB(WINDOWS)    
INSTALL          -->Install mongodb using link  https://www.mongodb.com/try/download/community (Platform:Windows ; Package:MSI)
                   C:\data\db -->Mongo db stores data in data\db but not created at instalation so create it 
SET ENV VAR      -->C:\ProgramFiles\MongoDB\Server\3.6\bin         
                 >mongo --version-->gives mongodb version    
       

//INSTALL MONGODB(LINUX)
INSTALL         --> >sudo apt update                -->update installation
                    >sudo apt install -y mongodb    -->install mongodb
                    >sudo mkdir -p /data/db         -->Mongo db stores data in data\db but not created at instalation so create it 
                    >sudo mkdir -p /data/db          
                    >mongod -version                 -->gives mongodb version
                    >whereis mongo                   --> gives mongo: /usr/bin/mongo /usr/share/man/man1/mongo.1.gz
                    >whereis mongodb                 --> mongodb: /etc/mongodb.conf
SET ENV VAR -->No Need


//INSTALL MONGODB COMPASS(MONGODB GUI) (WINDOWS)
INSTALL   ->Install Compass using link --https://www.mongodb.com/try/download/compass (Platform:Windows ; Package:Zip)                 


//INSTALL MONGODB COMPASS(MONGODB GUI)   (LINUX)
INSTALL   -->Install Compass using link --https://www.mongodb.com/try/download/compass (Platform:Ubuntu ; Package:deb)
            >cd ~/Downloads
            >dpkg -i DownloadedFilename.deb
    


*/

//CREATE  AND RUN MONGODB(WINDOWS(WITHOUT SUDO) , LINUX(WITH SUDO))
/*
//RUN MONGODB
>sudo systemctl status mongodb.service   OR service mongodb status            -->check mongodb status
>sudo systemctl start  mongod.service    OR service mongodb start  OR mongod  -->start mongodb server at 127.0.0.1:27107
>sudo systemctl stop   mongod.service    OR service mongodb stop              -->stop mongodb server  at 127.0.0.1:27107
>mongo                                                                        --> start mongo shell 

**WINDOWS HAVE ONLY MONGOD AND MONGO COMMAND SYSTEMCTL ARE FOR LINUX
*/






                                                                                                            

              



