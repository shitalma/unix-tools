unix-tools
==========

## Installing process

1. Copy .zip in your local machine
2. Extract that .zip file
3. Running shell commands you have to set environment varible on your local machine name `UNIXTOOLS_SM` 
and give the path before bin folder.
4. Set path name as `%UNIXTOOLS_SM%\bin` 
5. Execute command from git bash.

Example ->  smWc.sh present-file-name-in-this-directory

## WC

* smWc.sh  file-name           

           It will be display word count,character count and lines count presented in this given file.
           
Example ->    `smWc  one.txt`

* smWc.sh -c file-name           

           It will be display character count presented in this given file.
           
Example ->    `smWc  -c one.txt`

* smWc.sh -c -w file-name           

           It will be display character count and word count presented in this given file.
           
Example ->    `smWc  -c -w one.txt`

* smWc.sh -c -w -l file-name           

           It will be display character count,word count and line count presented in this given file.
           
Example ->    `smWc  -c -w -l one.txt`



## Head

* smHead -[No of lines]  file-name

           It will be display first 5 lines from given file.
           
Example ->  `smHead -5 one.txt`


* smHead file-name 
           
           It will be display default first 10 lines from given file
           
Example -> `smHead one.txt`


## Tail

* smTail -[No of lines]  file-name

           It will be display last 5 lines from given file.
           
Example ->  `smTail -5 one.txt`


* smTail file-name 
           
           It will be display default last 10 lines from given file.
           
Example -> `smTail one.txt`


## Uniq

smUniq file-name

           It will be display uniq lines among the entire file
           
Example -> `smUniq one.txt`


## Sort

* smSort file-name

           It will be display all content of the file by sorting ascending order.
           
Example -> `smSort one.txt`


* smSort -r file-name


           It will be display all content of the file by decending order.
           
Example -> `smSort -r one.txt`


## Cut

* smCut -f[number of fields] file-name

           It will be display all record in given file
           
Example -> `smCut -f1 one.txt`


* smCut -f[number of fields] -d[delimeter] file-name


           It will be display the first field of every line from given file.
           
Example -> `smCut -f1 -d" " one.txt`


## reduce space

smReducer file-name

           It will be remove all extra spaces from the given file.
           
Example -> `smReducer one.txt`
