package com.iflytek.test;

public class Test {
    public static void main(String[] args) {
       //冒泡排序
        int a[]={1,2,5,4,5,8,7,8,9,10};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //插入排序
        int b[]={1,2,5,4,5,8,7,8,9,10};
        for(int i=1;i<b.length;i++){
            int temp=b[i];
            int j=i-1;
            while(j>=0&&b[j]>temp){
                b[j+1]=b[j];
                j--;
            }
            b[j+1]=temp;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        //根据年龄对学生进行排序
       /* Student[] students=new Student[5];
        students[0]=new Student("张三",18);
        students[1]=new Student("李四",19);
        students[2]=new Student("王五",20);
        students[3]=new Student("赵六",21);
        students[4]=new Student("钱七",22);
        for(int i=0;i<students.length-1;i++){
            for(int j=0;j<students.length-1-i;j++){
                if(students[j].getAge()>students[j+1].getAge()){
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }

        }*/
    }
}
