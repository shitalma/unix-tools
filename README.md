unix-tools
==========

## WC

smWc.sh  file-name           

Example ->    `smWc  one.txt`

           It will be display word count,character count and lines count presented in this given file.


## Head

* smHead -[No of lines]  file-name

Example ->  `smHead -5 one.txt`

           It will be display first 5 lines from given file.

* smHead file-name 
           
Example -> `smHead one.txt`

           It will be display default first 10 lines from given file.


## Tail

*smTail -[No of lines]  file-name

Example ->  `smTail -5 one.txt`

           It will be display last 5 lines from given file.

*smTail file-name 
           
Example -> `smTail one.txt`

           It will be display default last 10 lines from given file.

## Uniq

smUniq file-name

Example -> `smUniq one.txt`

           It will be display uniq lines among the entire file

## Sort

*smSort file-name

Example -> `smSort one.txt`

           It will be display all content of the file by sorting ascending order.

* smSort -r file-name

Example -> `smSort -r one.txt`

           It will be display all content of the file by decending order.


## Cut
* smCut -c[number of character] file-name

Example -> `smCut -c3 one.txt`

           It will be display third number character of every line of given file.

* smCut -f[number of fields] file-name

Example -> `smCut -f1 one.txt`

           It will be display all record in given file

* smCut -f[number of fields] -d[delimeter] file-name

Example -> `smCut -f1 -d" " one.txt`

           It will be display the first field of every line from given file.

## reduce space

smReducer file-name

Example -> `smReducer one.txt`

           It will be remove all extra spaces from the given file.
