package p6;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{​​
int authorId() default 123;
String Authorname() default "keerthana";
String developersupervisor() default "mandra";
String date() default "5/5/22";
String Time() default "6.00 PM";
int version() default 7;
}​ ​

@info
class developers{​​
int authorId;
String Authorname;
String developersupervisor;
String date;
String Time;
int version;
}​ ​

public class secondquestion {
  ​ ​
public static void main(String[] args) {​​
developers obj=new developers();
Class n=obj.getClass();
Annotation anno=n.getAnnotation(info.class);
info k=(info)anno;
System.out.println(k.authorId());
System.out.println(k.Authorname());
System.out.println(k.date());
System.out.println(k.developersupervisor());
System.out.println(k.Time());
System.out.println(k.version());
}​ ​
}​ ​
