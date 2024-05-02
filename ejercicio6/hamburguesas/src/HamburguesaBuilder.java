public class HamburguesaBuilder implements Builder{
    private Hamburguesa hamburguesa = new Hamburguesa();

    @Override
    public void buildCarne(TipoCarne tipoCarne){
        hamburguesa.setTipoCarne(tipoCarne);
    }

    @Override
    public void buildLechuga(boolean lechuga){
        hamburguesa.setLechuga(lechuga);
    }

    @Override
    public void buildTomate(boolean tomate){
        hamburguesa.setTomate(tomate);
    }

    @Override
    public void buildCebolla(boolean cebolla){
        hamburguesa.setCebolla(cebolla);
    }

    @Override
    public void buildQueso(boolean queso){
        hamburguesa.setQueso(queso);
    }

    @Override
    public Hamburguesa build(){
        return  hamburguesa;
    }
}
