package com.bigdataBC.MementoPattern;
//备忘录类
public class StuMemento {
    //学号
    private String id;
    //学生姓名
    private String name;
    //学生电话
    private String telnum;

    //传入要备份的对象数据
    public StuMemento(Student student){
        this.id=student.getId();
        this.name=student.getName();
        this.telnum=student.getTelnum();
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
}
