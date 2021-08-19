package app.interfaces;

import java.util.Iterator;
import java.util.List;

public interface Manage {
     void add(Object object);

     void remove(Object object);

     Iterator search(Object object);

     void inDS();

     List getList();

}
