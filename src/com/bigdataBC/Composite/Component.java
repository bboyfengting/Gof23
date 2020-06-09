package com.bigdataBC.Composite;

public interface Component {
    void operation();
}
 interface Leaf extends Component{
     @Override
     void operation();
 }
 interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
 }
