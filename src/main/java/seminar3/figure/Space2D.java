package seminar3.figure;

import seminar3.figure.base.CurvedLen;
import seminar3.figure.base.Figure;
import seminar3.figure.base.Polygon;
import seminar3.figure.base.SpaceMaster;

import java.util.*;

class Space2D extends ArrayList<Figure> implements SpaceMaster {

    @Override
    public String getInformation(int index) {
        var item = this.get(index);
        StringBuilder s = new StringBuilder(index+". "+item.typeName()+" имеет площадь: "+item.getArea()+", ");
        if(item instanceof CurvedLen){
            s.append("длину окружности: ").append(((CurvedLen) item).getLen());
        }
        if(item instanceof Polygon){
            s.append("периметр: ").append(((Polygon) item).getPeremetr());
        }
        return s.toString();
    }

    @Override
    public void change(int index, Figure target) {
        this.set(index, target);
    }

    public void sortArea() {
        this.sort((o1, o2)->o1.getArea().compareTo(o2.getArea()));
    }




}
