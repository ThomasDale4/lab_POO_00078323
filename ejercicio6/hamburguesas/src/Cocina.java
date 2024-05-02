public class Cocina {
    private Builder builder;
    public static Cocina instance;
    private Cocina(Builder builder){
        this.builder = builder;
    }
    public static Cocina getInstance(Builder builder){
        if(instance == null){
            instance = new Cocina(builder);
        }
        return instance;
    }

    public Hamburguesa buildHamburguesa(TipoCarne tipoCarne, boolean lechuga, boolean tomate, boolean cebolla, boolean queso){
        builder.buildCarne(tipoCarne);
        builder.buildLechuga(lechuga);
        builder.buildTomate(tomate);
        builder.buildCebolla(cebolla);
        builder.buildQueso(queso);
        return builder.build();
    }
}
