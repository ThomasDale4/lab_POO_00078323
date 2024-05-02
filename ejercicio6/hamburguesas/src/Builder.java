public interface Builder {
    void buildCarne(TipoCarne tipoCarne);
    void buildLechuga(boolean lechuga);
    void buildTomate(boolean tomate);
    void buildCebolla(boolean cebolla);
    void buildQueso(boolean queso);
    Hamburguesa build();
}
