unix-tools
==========

## WC

smWc.sh  file-name           

           It will be display word count,character count and lines count presented in this given file.
           
Example ->    `smWc  one.txt`


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
