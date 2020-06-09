package com.bigdataBC.Composite;

public class Client {
    public static void main(String[] args) {
        Folder f=new Folder("文件夹1");

        AbstractFile f1,f2,f3;
        f1=new ImageFile("图片1");
        f2=new TextFile("文本1");
        f3=new TextFile("文本2");
        f.add(f1);
        f.add(f2);
        f.add(f3);

        f.killVirus();
    }
}
