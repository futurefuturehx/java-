//面向对象简介：对象就是一个实例 类就是一个模板
//面向对象的秘诀
//第一步 赋予类各种变量
//第二步 借助各种变量生成动作指令
//第三步 实例化之后进行 调用指令赋予参数 实现作用
import java.io.*;
public class Puppy{//Puppy的解释是小狗
  int puppyAge;
  public Puppy(String name){
    System.out.println("小狗的名字是:"+name);
  }
  public void setAge(int age){
    pupptAge = age;
  }
  public int getAge(){
    System.out.println("小狗的年龄为:"+puppyAge);
    return puppyAge;
  }
  public static void main(String []args){
    Puppy myPuppy = new Puppy("tommy");
    myPuppy.setAge(2);
    myPuppy.getAge();
    System.out.println("变量值："+myPuppy.puppyAge);
  }
}
