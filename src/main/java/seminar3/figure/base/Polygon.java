package seminar3.figure.base;

public abstract class Polygon extends Figure implements IPeremetr {
    private Integer numberEgge;
    private Double[] lensEge;

    public Polygon(Integer numberEgge) {
        assert numberEgge > 2;
        this.numberEgge = numberEgge;
        this.lensEge = new Double[numberEgge];
    }
    public Polygon(Integer numberEgge, Double[] lensEge) {
        this(numberEgge);
        this.setLensEge(lensEge);
    }

    protected void setLensEge(Double[] lensEge){
        assert lensEge.length == numberEgge;
        for (int i = 0; i < numberEgge; i++) {
            Double item = lensEge[i];
            assert item > 0.0;
            this.lensEge[i] = lensEge[i];
        }
    }

    protected Double[] getLensEge(){
        return lensEge;
    }

    @Override
    public Double getPeremetr() {
        Double p = 0.;
        for (int i = 0; i < numberEgge; i++) {
            p += lensEge[i];
        }
        return p;
    }
}
