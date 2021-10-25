/*
1.if
2.if else
3.if else if
4.nested if
5.for
6.for each/enhanced for loop
7.labelled for 
8.nested for loop
9.while
10.do while
11.nested while loop
12.break
13.continue
14.switch
15.nested switch
16.enum
*/

import java.util.*;
public class LoopsExamples
{
public static void main(String args[])
{
//if
String password="Ravina";
if(password.length()>=6)
{
System.out.println("Your password is created!");
}
//else
int age=18;
if(age>=18)
{
System.out.println("Elder,,You are able to make decision by own");
}
else
{
System.out.println("Younger,,Decision Making Power is in Parents hands");
}
//if else if
String pwd = "371299999";
if(pwd.length()<=4)
{
System.out.println("Your password length not valid!Pls try once again");
}
else if(pwd.length()<=6)
{
System.out.println("Your password is created!");
}
else if(pwd.length()<=6)
{
System.out.println("Your password length not valid!");
}
else{
System.out.println("Your password not created!");
}
//nested if
String name1="Ammulu";
String hus_name="Vikram";
if(!name1.equals(hus_name))
{
if(true)
{
HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(1,name1);
hm.put(2,hus_name);
System.out.println(hm);
String name2="Revina";
hm.put(1,name2);
System.out.println(name2+hus_name);
}
else{
System.out.println("Not Great!!");
}
}
//for loop
for(int i=1;i<=6;i++)
{
for(int j=10;j<=16;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
//for each loop
String[] nick_name=new String[]{"Ammu"};
for(String nick:nick_name)
{
System.out.print(nick);
System.out.println();
}
//labelled for loop
aa:
for(int i=1;i<=6;i++)
{
bb:
for(int j=10;j<=16;j++)
{
System.out.print(j+" ");
//break bb;
}
System.out.println();
break aa;
}
}
}