package com.suryani.cn
/**
 * @author Echo
 * @version createTime£ºJul 24, 2013 2:55:37 PM
 */
class GroovyTest {


    String name
    int age

    public static void main(def args){
        def mylist=[1, 2, "Lars", "4"]
        mylist.each{ println it }
        println 'echo'
        int a=1  ;int b=2
        String c='4'
        def d= c as int

        GString first="The toal count: ${a+b+d}"
        println  first

        GroovyTest class2=new GroovyTest([name:'echo',age:12])

        println class2.name
    }
}
