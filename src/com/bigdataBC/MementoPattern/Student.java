package com.bigdataBC.MementoPattern;

//源发器类
public class Student {
    //学号
    private String id;
    //学生姓名
    private String name;
    //学生电话
    private String telnum;

    //备忘操作，返回备忘录对象
    public StuMemento memento(){
        return new StuMemento(this);
    }

    //恢复操作，恢复到指定备忘录对象的状态值
    public void recover(StuMemento stuMemento){
        this.id=stuMemento.getId();
        this.name=stuMemento.getName();
        this.telnum=stuMemento.getTelnum();
    }

    public Student(String id, String name, String telnum) {
        this.id = id;
        this.name = name;
        this.telnum = telnum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", telnum='" + telnum + '\'' +
                '}';
    }
}
