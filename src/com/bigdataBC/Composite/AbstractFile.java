package com.bigdataBC.Composite;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对图片文件："+name+"进行查杀");
    }
}
class TextFile implements AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件："+name+"进行查杀");
    }
}
