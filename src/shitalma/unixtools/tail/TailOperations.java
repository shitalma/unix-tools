package shitalma.unixtools.tail;

import shitalma.unixtools.FileReader;

class TailOperations extends FileReader{
    public void display_tail(int size,String text) {
        String[] result = text.split("\r\n");
        for(int i = result.length-size ;  i < result.length; i++) System.out.println(result[i]);
    }
}